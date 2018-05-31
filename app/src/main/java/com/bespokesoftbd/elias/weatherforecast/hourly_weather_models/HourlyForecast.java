
package com.bespokesoftbd.elias.weatherforecast.hourly_weather_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HourlyForecast {

    @SerializedName("FCTTIME")
    @Expose
    private FCTTIME fCTTIME;
    @SerializedName("temp")
    @Expose
    private Temp temp;
    @SerializedName("dewpoint")
    @Expose
    private Dewpoint dewpoint;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("fctcode")
    @Expose
    private String fctcode;
    @SerializedName("sky")
    @Expose
    private String sky;
    @SerializedName("wspd")
    @Expose
    private Wspd wspd;
    @SerializedName("wdir")
    @Expose
    private Wdir wdir;
    @SerializedName("wx")
    @Expose
    private String wx;
    @SerializedName("humidity")
    @Expose
    private String humidity;
    @SerializedName("feelslike")
    @Expose
    private Feelslike feelslike;
    @SerializedName("snow")
    @Expose
    private Snow snow;

    public FCTTIME getFCTTIME() {
        return fCTTIME;
    }

    public void setFCTTIME(FCTTIME fCTTIME) {
        this.fCTTIME = fCTTIME;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public Dewpoint getDewpoint() {
        return dewpoint;
    }

    public void setDewpoint(Dewpoint dewpoint) {
        this.dewpoint = dewpoint;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getFctcode() {
        return fctcode;
    }

    public void setFctcode(String fctcode) {
        this.fctcode = fctcode;
    }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }

    public Wspd getWspd() {
        return wspd;
    }

    public void setWspd(Wspd wspd) {
        this.wspd = wspd;
    }

    public Wdir getWdir() {
        return wdir;
    }

    public void setWdir(Wdir wdir) {
        this.wdir = wdir;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public Feelslike getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Feelslike feelslike) {
        this.feelslike = feelslike;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }

}
