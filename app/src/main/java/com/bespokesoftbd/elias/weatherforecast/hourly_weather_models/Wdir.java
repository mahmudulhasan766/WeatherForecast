
package com.bespokesoftbd.elias.weatherforecast.hourly_weather_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wdir {

    @SerializedName("dir")
    @Expose
    private String dir;
    @SerializedName("degrees")
    @Expose
    private String degrees;

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getDegrees() {
        return degrees;
    }

    public void setDegrees(String degrees) {
        this.degrees = degrees;
    }

}
