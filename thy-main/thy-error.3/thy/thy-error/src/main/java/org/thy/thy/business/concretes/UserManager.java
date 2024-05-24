package org.thy.thy.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.thy.thy.business.abstracts.UserService;
import org.thy.thy.business.requests.CreatUserRequest;
import org.thy.thy.core.utilities.mappers.ModelMapperService;
import org.thy.thy.dataAccess.abstracts.UserRepository;
import org.thy.thy.Mernis.GBWKPSPublicSoap;
import org.thy.thy.model.User;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class UserManager implements UserService {
    private UserRepository userRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public boolean add(CreatUserRequest creatUserRequest) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(creatUserRequest.getDateOfBirth());
        int birthYear = calendar.get(Calendar.YEAR);

        GBWKPSPublicSoap client=new GBWKPSPublicSoap();
        try {
            boolean isRealPerson=client.TCKimlikNoDogrula(creatUserRequest.getIdentityNumber(),creatUserRequest.getFirstName(),creatUserRequest.getLastName(),birthYear);
            if(isRealPerson){
                User user=this.modelMapperService.forRequest().map(creatUserRequest,User.class);
                // Kredi kartı numarası oluştur
                String creditCardNo = generateRandomCreditCardNo();
                user.setCreditCardNo(Long.parseLong(creditCardNo));
                // Kullanıcıyı kaydet
                this.userRepository.save(user);
                return  true;
            }
            else{
                return false;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    @Override
    public Optional<User> getByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    // Rastgele bir standart kredi kartı numarası oluşturma metodu
    private String generateRandomCreditCardNo() {
        Random random = new Random();
        // İlk dört haneli kısımın başında 4 rakamı olmalıdır (MasterCard veya Visa için)
        String prefix = "4";
        for (int i = 0; i < 15; i++) {
            prefix += random.nextInt(10); // Rastgele bir rakam ekle
        }
        return prefix;
    }

}