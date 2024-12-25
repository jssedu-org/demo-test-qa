package com.usdev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1")
public class ControllerStore {


    @GetMapping("/stores")
    public String getStores() {
        return "Stores";
    }

}
