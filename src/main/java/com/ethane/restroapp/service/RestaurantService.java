package com.ethane.restroapp.service;

import com.ethane.restroapp.entity.Restaurant;
import com.ethane.restroapp.model.RestaurantRequestModel;

public interface RestaurantService {
    Restaurant addRestaurant(RestaurantRequestModel restaurantRequestModel);
}
