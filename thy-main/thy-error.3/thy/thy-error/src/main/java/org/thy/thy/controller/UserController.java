package org.thy.thy.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.thy.thy.business.abstracts.UserService;
import org.thy.thy.business.abstracts.WalletService;
import org.thy.thy.business.requests.CreatUserRequest;
import org.thy.thy.business.responses.GetByUserWalletResponse;
import org.thy.thy.model.User;
import org.thy.thy.model.Wallet;

import java.util.Optional;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {
    private UserService userService;
    private WalletService walletService;


    @GetMapping("/wallet")
    public GetByUserWalletResponse getUserWalletByEmail(@RequestParam String email) {
        Optional<User> userOptional = userService.getByEmail(email);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            Optional<Wallet> walletOptional = walletService.getByUserId(user.getId());
            if (walletOptional.isPresent()) {
                Wallet wallet = walletOptional.get();
                return new GetByUserWalletResponse(user.getFirstName(), user.getLastName(), wallet.getBalance());
            }
        }
        return null; // Kullanıcı ya da cüzdan bulunamazsa null döner
    }


    @PostMapping("/add")
    public String add(@RequestBody()CreatUserRequest creatUserRequest){
        if (this.userService.add(creatUserRequest)) {
            return "true"; // Kişi eklendiğinde true döner
        } else {
            return "false"; // Kişi eklenmediğinde false döner
        }
    }


}
