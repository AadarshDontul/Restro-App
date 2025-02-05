package com.ethane.restroapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(
        name = "restaurantAddress_seq",
        sequenceName = "restaurant_address_sequence",
        allocationSize = 1
)
public class RestaurantAddress {

    @Id
    @Column(name = "restaurant_address_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "restaurantAddress_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "restro_id",referencedColumnName = "restro_id")
    private Restaurant restaurant;

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private String pincode;
    private String landmark;

}
