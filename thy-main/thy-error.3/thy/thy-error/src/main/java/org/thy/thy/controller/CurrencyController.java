package org.thy.thy.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thy.thy.business.abstracts.CurrencyService;
import org.thy.thy.business.responses.GetAllCurrenciesResponse;

import java.util.List;

@RestController
@RequestMapping("api/currencies")
@AllArgsConstructor
public class CurrencyController {
    private CurrencyService currencyService;

    @GetMapping()
   public List<GetAllCurrenciesResponse> getAll(){
       return currencyService.getAll();
   }
}
