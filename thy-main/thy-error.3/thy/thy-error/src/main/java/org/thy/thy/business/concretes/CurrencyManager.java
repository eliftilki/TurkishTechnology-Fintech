package org.thy.thy.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.thy.thy.business.abstracts.CurrencyService;
import org.thy.thy.business.responses.GetAllCurrenciesResponse;
import org.thy.thy.core.utilities.mappers.ModelMapperService;
import org.thy.thy.dataAccess.abstracts.CurrencyRepository;
import org.thy.thy.model.Currency;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CurrencyManager implements CurrencyService {
    private CurrencyRepository currencyRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllCurrenciesResponse> getAll() {
        List<Currency> currencies = currencyRepository.findAll();

        List<GetAllCurrenciesResponse> currenciesResponse = currencies.stream()
                .map(currency -> this.modelMapperService.forResponse()
                        .map(currency,GetAllCurrenciesResponse.class)).collect(Collectors.toList());

        return currenciesResponse;
    }
}
