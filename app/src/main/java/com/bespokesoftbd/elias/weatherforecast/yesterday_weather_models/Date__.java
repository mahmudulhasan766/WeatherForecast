
package com.bespokesoftbd.elias.weatherforecast.yesterday_weather_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Date__ {

    @SerializedName("pretty")
    @Expose
    private String pretty;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("mon")
    @Expose
    private String mon;
    @SerializedName("mday")
    @Expose
    private String mday;
    @SerializedName("hour")
    @Expose
    private String hour;
    @SerializedName("min")
    @Expose
    private String min;
    @SerializedName("tzname")
    @Expose
    private String tzname;

    public String getPretty() {
        return pretty;
    }

    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getMday() {
        return mday;
    }

    public void setMday(String mday) {
        this.mday = mday;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getTzname() {
        return tzname;
    }

    public void setTzname(String tzname) {
        this.tzname = tzname;
    }

}
