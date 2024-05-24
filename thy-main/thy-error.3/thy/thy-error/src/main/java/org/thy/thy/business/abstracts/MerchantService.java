package org.thy.thy.business.abstracts;

import org.thy.thy.business.responses.GetAllMerchantsResponse;

import java.util.List;

public interface MerchantService {
    List<GetAllMerchantsResponse> getAll();
}
