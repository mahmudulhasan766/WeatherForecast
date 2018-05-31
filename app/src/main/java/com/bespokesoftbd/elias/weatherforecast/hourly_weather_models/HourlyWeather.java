
package com.bespokesoftbd.elias.weatherforecast.hourly_weather_models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HourlyWeather {

    @SerializedName("hourly_forecast")
    @Expose
    private List<HourlyForecast> hourlyForecast = null;

    public List<HourlyForecast> getHourlyForecast() {
        return hourlyForecast;
    }

    public void setHourlyForecast(List<HourlyForecast> hourlyForecast) {
        this.hourlyForecast = hourlyForecast;
    }

}
