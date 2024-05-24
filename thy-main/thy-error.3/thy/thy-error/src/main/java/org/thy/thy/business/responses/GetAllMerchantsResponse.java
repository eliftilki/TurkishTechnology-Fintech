package org.thy.thy.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllMerchantsResponse {
    private String name;
    private String latitude;
    private String longitude;
    private String category;
}
