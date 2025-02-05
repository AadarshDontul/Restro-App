package com.ethane.restroapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(
        name = "restaurantLegalDocument_seq",
        sequenceName = "restaurant_legal_document_sequence",
        allocationSize = 1
)
public class RestaurantLegalDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="restaurantLegalDocument_seq")
    private Long id;

    @OneToOne
    @JoinColumn(name = "restaurant_address_id",referencedColumnName = "restaurant_address_id")
    private RestaurantAddress restaurantAddress;

    @Column(nullable = false, length = 50)
    private String foodLicense;

}
