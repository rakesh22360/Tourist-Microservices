
package com.example.tourist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.tourist.service.TouristService;

@RestController
public class TouristController {

    private final TouristService service;

    public TouristController(TouristService service) {
        this.service = service;
    }

    @GetMapping("/tourists")
    public String getTourists() {
        return service.getTourist();
    }
}
