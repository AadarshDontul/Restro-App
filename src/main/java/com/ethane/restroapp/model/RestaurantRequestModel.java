package com.ethane.restroapp.model;

import com.ethane.restroapp.entity.RestaurantType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantRequestModel {

    private String name;
    private RestaurantType type;

}
