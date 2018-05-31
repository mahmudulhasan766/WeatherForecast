
package com.bespokesoftbd.elias.weatherforecast.yesterday_weather_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Features {

    @SerializedName("yesterday")
    @Expose
    private Integer yesterday;

    public Integer getYesterday() {
        return yesterday;
    }

    public void setYesterday(Integer yesterday) {
        this.yesterday = yesterday;
    }

}
