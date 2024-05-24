package org.thy.thy.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thy.thy.business.abstracts.MerchantService;
import org.thy.thy.business.responses.GetAllMerchantsResponse;

import java.util.List;

@RestController
@RequestMapping("api/merchants")
@AllArgsConstructor
public class MerchantController {
    private MerchantService merchantService;

    @GetMapping("/getall")
    public List<GetAllMerchantsResponse> getAll(){
        return merchantService.getAll();
    }
}
