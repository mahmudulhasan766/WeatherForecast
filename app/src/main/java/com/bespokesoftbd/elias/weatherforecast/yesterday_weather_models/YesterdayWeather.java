
package com.bespokesoftbd.elias.weatherforecast.yesterday_weather_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class YesterdayWeather {

    @SerializedName("response")
    @Expose
    private Response response;
    @SerializedName("history")
    @Expose
    private History history;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

}
