package org.thy.thy.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatUserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String job;
    private String gender;
    private String street;
    private String city;
    private String state;
    private int zipNo;
    private String latitude;
    private String longitude;
    private Date dateOfBirth;
    private int cityPop;
    private Long creditCardNo;
    private Long identityNumber;


}
