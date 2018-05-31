
package com.bespokesoftbd.elias.weatherforecast.yesterday_weather_models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class History {

    @SerializedName("date")
    @Expose
    private Date date;
    @SerializedName("utcdate")
    @Expose
    private Utcdate utcdate;
    @SerializedName("observations")
    @Expose
    private List<Observation> observations = null;
    @SerializedName("dailysummary")
    @Expose
    private List<Dailysummary> dailysummary = null;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Utcdate getUtcdate() {
        return utcdate;
    }

    public void setUtcdate(Utcdate utcdate) {
        this.utcdate = utcdate;
    }

    public List<Observation> getObservations() {
        return observations;
    }

    public void setObservations(List<Observation> observations) {
        this.observations = observations;
    }

    public List<Dailysummary> getDailysummary() {
        return dailysummary;
    }

    public void setDailysummary(List<Dailysummary> dailysummary) {
        this.dailysummary = dailysummary;
    }

}
