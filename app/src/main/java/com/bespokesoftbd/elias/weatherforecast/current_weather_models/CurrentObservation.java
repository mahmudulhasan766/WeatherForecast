
package com.bespokesoftbd.elias.weatherforecast.current_weather_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentObservation {

    @SerializedName("display_location")
    @Expose
    private DisplayLocation displayLocation;
    @SerializedName("observation_location")
    @Expose
    private ObservationLocation observationLocation;
    @SerializedName("estimated")
    @Expose
    private Estimated estimated;
    @SerializedName("station_id")
    @Expose
    private String stationId;
    @SerializedName("observation_time")
    @Expose
    private String observationTime;
    @SerializedName("observation_time_rfc822")
    @Expose
    private String observationTimeRfc822;
    @SerializedName("observation_epoch")
    @Expose
    private String observationEpoch;
    @SerializedName("local_time_rfc822")
    @Expose
    private String localTimeRfc822;
    @SerializedName("local_epoch")
    @Expose
    private String localEpoch;
    @SerializedName("local_tz_short")
    @Expose
    private String localTzShort;
    @SerializedName("local_tz_long")
    @Expose
    private String localTzLong;
    @SerializedName("local_tz_offset")
    @Expose
    private String localTzOffset;
    @SerializedName("weather")
    @Expose
    private String weather;
    @SerializedName("temperature_string")
    @Expose
    private String temperatureString;
    @SerializedName("temp_f")
    @Expose
    private Integer tempF;
    @SerializedName("temp_c")
    @Expose
    private Integer tempC;
    @SerializedName("relative_humidity")
    @Expose
    private String relativeHumidity;
    @SerializedName("wind_string")
    @Expose
    private String windString;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("wind_degrees")
    @Expose
    private Integer windDegrees;
    @SerializedName("wind_mph")
    @Expose
    private Integer windMph;
    @SerializedName("wind_gust_mph")
    @Expose
    private Integer windGustMph;
    @SerializedName("wind_kph")
    @Expose
    private Integer windKph;
    @SerializedName("wind_gust_kph")
    @Expose
    private Integer windGustKph;
    @SerializedName("pressure_mb")
    @Expose
    private String pressureMb;
    @SerializedName("pressure_in")
    @Expose
    private String pressureIn;
    @SerializedName("pressure_trend")
    @Expose
    private String pressureTrend;
    @SerializedName("dewpoint_string")
    @Expose
    private String dewpointString;
    @SerializedName("dewpoint_f")
    @Expose
    private Integer dewpointF;
    @SerializedName("dewpoint_c")
    @Expose
    private Integer dewpointC;
    @SerializedName("heat_index_string")
    @Expose
    private String heatIndexString;
    @SerializedName("heat_index_f")
    @Expose
    private String heatIndexF;
    @SerializedName("heat_index_c")
    @Expose
    private String heatIndexC;
    @SerializedName("windchill_string")
    @Expose
    private String windchillString;
    @SerializedName("windchill_f")
    @Expose
    private String windchillF;
    @SerializedName("windchill_c")
    @Expose
    private String windchillC;
    @SerializedName("feelslike_string")
    @Expose
    private String feelslikeString;
    @SerializedName("feelslike_f")
    @Expose
    private String feelslikeF;
    @SerializedName("feelslike_c")
    @Expose
    private String feelslikeC;
    @SerializedName("visibility_mi")
    @Expose
    private String visibilityMi;
    @SerializedName("visibility_km")
    @Expose
    private String visibilityKm;
    @SerializedName("solarradiation")
    @Expose
    private String solarradiation;
    @SerializedName("UV")
    @Expose
    private String uV;
    @SerializedName("precip_1hr_string")
    @Expose
    private String precip1hrString;
    @SerializedName("precip_1hr_in")
    @Expose
    private String precip1hrIn;
    @SerializedName("precip_1hr_metric")
    @Expose
    private String precip1hrMetric;
    @SerializedName("precip_today_string")
    @Expose
    private String precipTodayString;
    @SerializedName("precip_today_in")
    @Expose
    private String precipTodayIn;
    @SerializedName("precip_today_metric")
    @Expose
    private String precipTodayMetric;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("forecast_url")
    @Expose
    private String forecastUrl;
    @SerializedName("history_url")
    @Expose
    private String historyUrl;
    @SerializedName("ob_url")
    @Expose
    private String obUrl;
    @SerializedName("nowcast")
    @Expose
    private String nowcast;

    public DisplayLocation getDisplayLocation() {
        return displayLocation;
    }

    public void setDisplayLocation(DisplayLocation displayLocation) {
        this.displayLocation = displayLocation;
    }

    public ObservationLocation getObservationLocation() {
        return observationLocation;
    }

    public void setObservationLocation(ObservationLocation observationLocation) {
        this.observationLocation = observationLocation;
    }

    public Estimated getEstimated() {
        return estimated;
    }

    public void setEstimated(Estimated estimated) {
        this.estimated = estimated;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public String getObservationTimeRfc822() {
        return observationTimeRfc822;
    }

    public void setObservationTimeRfc822(String observationTimeRfc822) {
        this.observationTimeRfc822 = observationTimeRfc822;
    }

    public String getObservationEpoch() {
        return observationEpoch;
    }

    public void setObservationEpoch(String observationEpoch) {
        this.observationEpoch = observationEpoch;
    }

    public String getLocalTimeRfc822() {
        return localTimeRfc822;
    }

    public void setLocalTimeRfc822(String localTimeRfc822) {
        this.localTimeRfc822 = localTimeRfc822;
    }

    public String getLocalEpoch() {
        return localEpoch;
    }

    public void setLocalEpoch(String localEpoch) {
        this.localEpoch = localEpoch;
    }

    public String getLocalTzShort() {
        return localTzShort;
    }

    public void setLocalTzShort(String localTzShort) {
        this.localTzShort = localTzShort;
    }

    public String getLocalTzLong() {
        return localTzLong;
    }

    public void setLocalTzLong(String localTzLong) {
        this.localTzLong = localTzLong;
    }

    public String getLocalTzOffset() {
        return localTzOffset;
    }

    public void setLocalTzOffset(String localTzOffset) {
        this.localTzOffset = localTzOffset;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemperatureString() {
        return temperatureString;
    }

    public void setTemperatureString(String temperatureString) {
        this.temperatureString = temperatureString;
    }

    public Integer getTempF() {
        return tempF;
    }

    public void setTempF(Integer tempF) {
        this.tempF = tempF;
    }

    public Integer getTempC() {
        return tempC;
    }

    public void setTempC(Integer tempC) {
        this.tempC = tempC;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getWindString() {
        return windString;
    }

    public void setWindString(String windString) {
        this.windString = windString;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Integer getWindDegrees() {
        return windDegrees;
    }

    public void setWindDegrees(Integer windDegrees) {
        this.windDegrees = windDegrees;
    }

    public Integer getWindMph() {
        return windMph;
    }

    public void setWindMph(Integer windMph) {
        this.windMph = windMph;
    }

    public Integer getWindGustMph() {
        return windGustMph;
    }

    public void setWindGustMph(Integer windGustMph) {
        this.windGustMph = windGustMph;
    }

    public Integer getWindKph() {
        return windKph;
    }

    public void setWindKph(Integer windKph) {
        this.windKph = windKph;
    }

    public Integer getWindGustKph() {
        return windGustKph;
    }

    public void setWindGustKph(Integer windGustKph) {
        this.windGustKph = windGustKph;
    }

    public String getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(String pressureMb) {
        this.pressureMb = pressureMb;
    }

    public String getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(String pressureIn) {
        this.pressureIn = pressureIn;
    }

    public String getPressureTrend() {
        return pressureTrend;
    }

    public void setPressureTrend(String pressureTrend) {
        this.pressureTrend = pressureTrend;
    }

    public String getDewpointString() {
        return dewpointString;
    }

    public void setDewpointString(String dewpointString) {
        this.dewpointString = dewpointString;
    }

    public Integer getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(Integer dewpointF) {
        this.dewpointF = dewpointF;
    }

    public Integer getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(Integer dewpointC) {
        this.dewpointC = dewpointC;
    }

    public String getHeatIndexString() {
        return heatIndexString;
    }

    public void setHeatIndexString(String heatIndexString) {
        this.heatIndexString = heatIndexString;
    }

    public String getHeatIndexF() {
        return heatIndexF;
    }

    public void setHeatIndexF(String heatIndexF) {
        this.heatIndexF = heatIndexF;
    }

    public String getHeatIndexC() {
        return heatIndexC;
    }

    public void setHeatIndexC(String heatIndexC) {
        this.heatIndexC = heatIndexC;
    }

    public String getWindchillString() {
        return windchillString;
    }

    public void setWindchillString(String windchillString) {
        this.windchillString = windchillString;
    }

    public String getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(String windchillF) {
        this.windchillF = windchillF;
    }

    public String getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(String windchillC) {
        this.windchillC = windchillC;
    }

    public String getFeelslikeString() {
        return feelslikeString;
    }

    public void setFeelslikeString(String feelslikeString) {
        this.feelslikeString = feelslikeString;
    }

    public String getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(String feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public String getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(String feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public String getVisibilityMi() {
        return visibilityMi;
    }

    public void setVisibilityMi(String visibilityMi) {
        this.visibilityMi = visibilityMi;
    }

    public String getVisibilityKm() {
        return visibilityKm;
    }

    public void setVisibilityKm(String visibilityKm) {
        this.visibilityKm = visibilityKm;
    }

    public String getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(String solarradiation) {
        this.solarradiation = solarradiation;
    }

    public String getUV() {
        return uV;
    }

    public void setUV(String uV) {
        this.uV = uV;
    }

    public String getPrecip1hrString() {
        return precip1hrString;
    }

    public void setPrecip1hrString(String precip1hrString) {
        this.precip1hrString = precip1hrString;
    }

    public String getPrecip1hrIn() {
        return precip1hrIn;
    }

    public void setPrecip1hrIn(String precip1hrIn) {
        this.precip1hrIn = precip1hrIn;
    }

    public String getPrecip1hrMetric() {
        return precip1hrMetric;
    }

    public void setPrecip1hrMetric(String precip1hrMetric) {
        this.precip1hrMetric = precip1hrMetric;
    }

    public String getPrecipTodayString() {
        return precipTodayString;
    }

    public void setPrecipTodayString(String precipTodayString) {
        this.precipTodayString = precipTodayString;
    }

    public String getPrecipTodayIn() {
        return precipTodayIn;
    }

    public void setPrecipTodayIn(String precipTodayIn) {
        this.precipTodayIn = precipTodayIn;
    }

    public String getPrecipTodayMetric() {
        return precipTodayMetric;
    }

    public void setPrecipTodayMetric(String precipTodayMetric) {
        this.precipTodayMetric = precipTodayMetric;
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

    public String getForecastUrl() {
        return forecastUrl;
    }

    public void setForecastUrl(String forecastUrl) {
        this.forecastUrl = forecastUrl;
    }

    public String getHistoryUrl() {
        return historyUrl;
    }

    public void setHistoryUrl(String historyUrl) {
        this.historyUrl = historyUrl;
    }

    public String getObUrl() {
        return obUrl;
    }

    public void setObUrl(String obUrl) {
        this.obUrl = obUrl;
    }

    public String getNowcast() {
        return nowcast;
    }

    public void setNowcast(String nowcast) {
        this.nowcast = nowcast;
    }

}
