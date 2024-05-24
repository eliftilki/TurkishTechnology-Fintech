package org.thy.thy.business.abstracts;

import org.thy.thy.business.responses.GetAllCurrenciesResponse;


import java.util.List;

public interface CurrencyService {
    List<GetAllCurrenciesResponse> getAll();
}
