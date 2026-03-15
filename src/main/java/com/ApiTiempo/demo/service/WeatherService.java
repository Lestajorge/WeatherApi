

package com.ApiTiempo.demo.service;

import com.ApiTiempo.demo.model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    
    private final RestTemplate restemplate = new RestTemplate(); 
    
    @Value("${weather.api.key}")
    private String weather_api_key ; 
    
    
   
    
    public Weather getWeather(String ciudad){
        
          String url = "https://api.openweathermap.org/data/2.5/weather?q="
                + ciudad
                + "&appid=" + weather_api_key
                + "&units=metric";
          
          
          return restemplate.getForObject(url, Weather.class);
          
        
    }
    
    
    
    
}
