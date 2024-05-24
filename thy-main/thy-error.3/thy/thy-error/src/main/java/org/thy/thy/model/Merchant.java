package org.thy.thy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "merchants")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "website", length = 50)
    private String website;

    @Column(name = "latitude", length = 50)
    private Double latitude;

    @Column(name = "longitude", length = 50)
    private Double longitude;

    @Column(name = "category", length = 50)
    private String category;

}
