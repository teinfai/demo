package com.example.demo.service;

import com.example.demo.dto.LocationRequestDto;
import com.example.demo.dto.OpenWeatherDto;
import com.example.demo.dto.WeatherCegaResponseDto;
import com.example.demo.dto.OpenCegaGeoResponseDto;
import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.external.opencega.OpenCegaClient;
import com.example.demo.external.opencega.model.OpenCegaResponse;
import com.example.demo.external.openweather.OpenWeatherClient;
import com.example.demo.external.openweather.model.OpenWeatherResponse;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.WeatherTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WeatherTrackerService {

    private OpenCegaClient openCegaClient;
    private OpenWeatherClient openWeatherClient;
    private WeatherTrackerRepository weatherTrackerRepository;

    public WeatherTrackerService (OpenCegaClient openCegaClient,OpenWeatherClient openWeatherClient,WeatherTrackerRepository weatherTrackerRepository) {
        this.openCegaClient = openCegaClient;
        this.openWeatherClient = openWeatherClient;
        this.weatherTrackerRepository = weatherTrackerRepository;
    }

//    public WeatherCegaResponseDto getWeatherInfo(LocationRequestDto request) {

//        OpenCegaResponse geoResponse = openCegaClient.getCoordinates(request.getAddress(), request.getCountry(), request.getCity());
//
//        if (geoResponse != null) {
//
//            double lat = geoResponse.getLatitude();
//            double lng = geoResponse.getLongitude();
//
//            OpenWeatherResponse weatherResponse = openWeatherClient.getWeatherByCoordinates(lat,lng);
//
//        }


//    }




}

