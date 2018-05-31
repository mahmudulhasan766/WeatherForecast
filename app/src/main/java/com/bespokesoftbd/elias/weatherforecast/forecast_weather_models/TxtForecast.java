
package com.bespokesoftbd.elias.weatherforecast.forecast_weather_models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TxtForecast {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("forecastday")
    @Expose
    private List<Forecastday> forecastday = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Forecastday> getForecastday() {
        return forecastday;
    }

    public void setForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }

}
