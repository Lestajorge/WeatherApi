package com.ApiTiempo.demo.controller;

import com.ApiTiempo.demo.dto.WeatherResponse;
import com.ApiTiempo.demo.model.Weather;
import com.ApiTiempo.demo.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class TiempoController {

    private final WeatherService weatherService;

    public TiempoController(WeatherService weatherService) {

        this.weatherService = weatherService;

    }

    @GetMapping("/saludo")
    public String saludo() {

        return "Hola Mundo";

    }

    @GetMapping("/{ciudad}")
    public WeatherResponse weather(@PathVariable String ciudad) {

        Weather w = weatherService.getWeather(ciudad);

        return new WeatherResponse(w.getMain().getTemp(), w.getMain().getTemp_max(), 
                w.getMain().getTemp_min(),ciudad,w.getWeather().get(0).getDescription());

    }

}
