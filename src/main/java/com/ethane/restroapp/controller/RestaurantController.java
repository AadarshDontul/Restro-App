package com.ethane.restroapp.controller;

import com.ethane.restroapp.entity.Restaurant;
import com.ethane.restroapp.model.RestaurantRequestModel;
import com.ethane.restroapp.service.RestaurantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    public ResponseEntity<Restaurant> addRestaurant(@RequestBody RestaurantRequestModel restaurantRequestModel) {
        Restaurant restaurant = restaurantService.addRestaurant(restaurantRequestModel);
        return ResponseEntity.ok(restaurant);
    }
}
