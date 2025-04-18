package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.service.WeatherTrackerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/weathertracker")
@Api(value = "User API", tags = "User API")
public class WeatherTrackerController {

    @Autowired
    private WeatherTrackerService weatherTrackerService;


    @GetMapping("/{city}/{country}")
    @ApiOperation(value = "Get weather by location")
    public String getWeatherInfo(
            @RequestParam String Address,                          // Required
            @RequestParam(required = false) String city,     // Optional
            @RequestParam(required = false) Double country  // Optional
    ) {
      return "";
    }
}