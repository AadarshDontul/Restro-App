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
        name = "restaurant_seq",
        sequenceName = "restaurant_sequence",
        allocationSize = 1
)
public class Restaurant {

    @Id
    @Column(name = "restro_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "restaurant_seq")
    private Long Id;

    @Column(nullable = false, length = 100)
    private String name;

    @Enumerated(EnumType.STRING)
    private RestaurantType type;

}
