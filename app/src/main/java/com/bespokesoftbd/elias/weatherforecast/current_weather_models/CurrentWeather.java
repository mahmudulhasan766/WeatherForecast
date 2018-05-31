
package com.bespokesoftbd.elias.weatherforecast.current_weather_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentWeather {

    @SerializedName("current_observation")
    @Expose
    private CurrentObservation currentObservation;

    public CurrentObservation getCurrentObservation() {
        return currentObservation;
    }

    public void setCurrentObservation(CurrentObservation currentObservation) {
        this.currentObservation = currentObservation;
    }

}
