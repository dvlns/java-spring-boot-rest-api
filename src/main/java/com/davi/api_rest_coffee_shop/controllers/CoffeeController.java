package com.davi.api_rest_coffee_shop.controllers;


import com.davi.api_rest_coffee_shop.models.Coffee;
import com.davi.api_rest_coffee_shop.repositories.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.List;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    @Autowired
    CoffeeRepository coffeeRepository;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Coffee> getAllCoffe(){
        return coffeeRepository.findAll();
    }

    @PostMapping(value = "/createCoffee", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Coffee createNewCoffee(@RequestBody Coffee coffee) {
        Coffee createCoffee = new Coffee();

        createCoffee.setName(coffee.getName());
        createCoffee.setPrice(coffee.getPrice());

        return coffeeRepository.save(createCoffee);
    }

    @PutMapping(value = "updatedCoffee", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Coffee updateCoffee(@RequestBody Coffee coffee) {
        Coffee getCoffee = coffeeRepository.findById(coffee.getId()).orElseThrow();

        Coffee updatedCoffee = new Coffee();

        updatedCoffee.setId(coffee.getId());
        updatedCoffee.setName(coffee.getName());
        updatedCoffee.setPrice(coffee.getPrice());

        return coffeeRepository.save(updatedCoffee);
    }

}
