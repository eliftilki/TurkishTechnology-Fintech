package org.thy.thy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password", length = 10)
    private String password;

    @Column(name = "job", length = 50)
    private String job;

    @Column(name = "gender", length = 1)
    private String gender;

    @Column(name = "street", length = 50)
    private String street;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "state", length = 50)
    private String state;


    @Column(name = "zip_no")
    private int zipNo;

    @Column(name = "latitude", length = 50)
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "city_pop")
    private int cityPop;


    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "credit_card_no")
    private Long creditCardNo;

    @OneToOne(mappedBy = "user")
    private Wallet wallet;




}
