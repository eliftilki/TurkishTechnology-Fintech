package org.thy.thy.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCurrenciesResponse {
    private String name;
    private String abbrevitation;
}
