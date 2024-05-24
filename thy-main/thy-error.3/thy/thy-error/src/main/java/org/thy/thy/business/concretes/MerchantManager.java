package org.thy.thy.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.thy.thy.business.abstracts.MerchantService;
import org.thy.thy.business.responses.GetAllMerchantsResponse;
import org.thy.thy.core.utilities.mappers.ModelMapperService;
import org.thy.thy.dataAccess.abstracts.MerchantRepository;
import org.thy.thy.model.Merchant;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MerchantManager implements MerchantService {
    private MerchantRepository merchantRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllMerchantsResponse> getAll() {
        List<Merchant> merchants = merchantRepository.findAll();
        List<GetAllMerchantsResponse> merchantsResponses = merchants.stream()
                .map(merchant ->this.modelMapperService.forResponse()
                        .map(merchant,GetAllMerchantsResponse.class)).collect(Collectors.toList());

        return merchantsResponses;
    }
}
