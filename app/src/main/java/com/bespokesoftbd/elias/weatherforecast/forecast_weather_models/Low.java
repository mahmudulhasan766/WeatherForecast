
package com.bespokesoftbd.elias.weatherforecast.forecast_weather_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Low {

    @SerializedName("fahrenheit")
    @Expose
    private String fahrenheit;
    @SerializedName("celsius")
    @Expose
    private String celsius;

    public String getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }

}
