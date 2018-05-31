
package com.bespokesoftbd.elias.weatherforecast.forecast_weather_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ForecastWeather {

    @SerializedName("forecast")
    @Expose
    private Forecast forecast;

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

}
