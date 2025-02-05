package com.ethane.restroapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(
        name = "restaurantContact_seq",
        sequenceName = "restaurant_contact_sequence",
        allocationSize = 1
)
public class RestaurantContactDetails {

    @Id
    @Column(name = "restaurant_contactdetails_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "restaurantContact_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "restaurant_address_id", referencedColumnName = "restaurant_address_id")
    private RestaurantAddress restaurantAddress;

    private String phoneNumber;
    private String email;
}
