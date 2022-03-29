package com.example.weather.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DailyWeather {


    private float lat;

    private float lon;

    private String timezone;

    private long timezone_offset;

    private long dt;

    private long sunrise;

    private long sunset;

    private long moonrise;

    private long moonset;

    private float moon_phase;

    //private Temp temp;

    // Feelslike feels_like;

    private long pressure;

    private float humidity;

    private float dew_point;

    private float wind_speed;

    private int wind_deg;

    private float wind_gust;

    //private Weather weather;

    private int clouds;

    private int pop;

    private float rain;

    private float uvi;

    private float feelsLike_day;

    private float feelsLike_night;

    private float feelsLike_eve;

    private float feelsLike_morn;

    private float temp_day;

    private float temp_min;

    private float temp_max;

    private float temp_night;

    private float temp_eve;

    private float temp_morn;

    private int weather_id;

    private String weather_main;

    private String weather_description;

    private String weather_icon;



}
