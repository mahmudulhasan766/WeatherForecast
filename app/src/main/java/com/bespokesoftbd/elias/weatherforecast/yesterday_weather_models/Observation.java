
package com.bespokesoftbd.elias.weatherforecast.yesterday_weather_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Observation {

    @SerializedName("date")
    @Expose
    private Date_ date;
    @SerializedName("utcdate")
    @Expose
    private Utcdate_ utcdate;
    @SerializedName("tempm")
    @Expose
    private String tempm;
    @SerializedName("tempi")
    @Expose
    private String tempi;
    @SerializedName("dewptm")
    @Expose
    private String dewptm;
    @SerializedName("dewpti")
    @Expose
    private String dewpti;
    @SerializedName("hum")
    @Expose
    private String hum;
    @SerializedName("wspdm")
    @Expose
    private String wspdm;
    @SerializedName("wspdi")
    @Expose
    private String wspdi;
    @SerializedName("wgustm")
    @Expose
    private String wgustm;
    @SerializedName("wgusti")
    @Expose
    private String wgusti;
    @SerializedName("wdird")
    @Expose
    private String wdird;
    @SerializedName("wdire")
    @Expose
    private String wdire;
    @SerializedName("vism")
    @Expose
    private String vism;
    @SerializedName("visi")
    @Expose
    private String visi;
    @SerializedName("pressurem")
    @Expose
    private String pressurem;
    @SerializedName("pressurei")
    @Expose
    private String pressurei;
    @SerializedName("windchillm")
    @Expose
    private String windchillm;
    @SerializedName("windchilli")
    @Expose
    private String windchilli;
    @SerializedName("heatindexm")
    @Expose
    private String heatindexm;
    @SerializedName("heatindexi")
    @Expose
    private String heatindexi;
    @SerializedName("precipm")
    @Expose
    private String precipm;
    @SerializedName("precipi")
    @Expose
    private String precipi;
    @SerializedName("conds")
    @Expose
    private String conds;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("fog")
    @Expose
    private String fog;
    @SerializedName("rain")
    @Expose
    private String rain;
    @SerializedName("snow")
    @Expose
    private String snow;
    @SerializedName("hail")
    @Expose
    private String hail;
    @SerializedName("thunder")
    @Expose
    private String thunder;
    @SerializedName("tornado")
    @Expose
    private String tornado;
    @SerializedName("metar")
    @Expose
    private String metar;

    public Date_ getDate() {
        return date;
    }

    public void setDate(Date_ date) {
        this.date = date;
    }

    public Utcdate_ getUtcdate() {
        return utcdate;
    }

    public void setUtcdate(Utcdate_ utcdate) {
        this.utcdate = utcdate;
    }

    public String getTempm() {
        return tempm;
    }

    public void setTempm(String tempm) {
        this.tempm = tempm;
    }

    public String getTempi() {
        return tempi;
    }

    public void setTempi(String tempi) {
        this.tempi = tempi;
    }

    public String getDewptm() {
        return dewptm;
    }

    public void setDewptm(String dewptm) {
        this.dewptm = dewptm;
    }

    public String getDewpti() {
        return dewpti;
    }

    public void setDewpti(String dewpti) {
        this.dewpti = dewpti;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getWspdm() {
        return wspdm;
    }

    public void setWspdm(String wspdm) {
        this.wspdm = wspdm;
    }

    public String getWspdi() {
        return wspdi;
    }

    public void setWspdi(String wspdi) {
        this.wspdi = wspdi;
    }

    public String getWgustm() {
        return wgustm;
    }

    public void setWgustm(String wgustm) {
        this.wgustm = wgustm;
    }

    public String getWgusti() {
        return wgusti;
    }

    public void setWgusti(String wgusti) {
        this.wgusti = wgusti;
    }

    public String getWdird() {
        return wdird;
    }

    public void setWdird(String wdird) {
        this.wdird = wdird;
    }

    public String getWdire() {
        return wdire;
    }

    public void setWdire(String wdire) {
        this.wdire = wdire;
    }

    public String getVism() {
        return vism;
    }

    public void setVism(String vism) {
        this.vism = vism;
    }

    public String getVisi() {
        return visi;
    }

    public void setVisi(String visi) {
        this.visi = visi;
    }

    public String getPressurem() {
        return pressurem;
    }

    public void setPressurem(String pressurem) {
        this.pressurem = pressurem;
    }

    public String getPressurei() {
        return pressurei;
    }

    public void setPressurei(String pressurei) {
        this.pressurei = pressurei;
    }

    public String getWindchillm() {
        return windchillm;
    }

    public void setWindchillm(String windchillm) {
        this.windchillm = windchillm;
    }

    public String getWindchilli() {
        return windchilli;
    }

    public void setWindchilli(String windchilli) {
        this.windchilli = windchilli;
    }

    public String getHeatindexm() {
        return heatindexm;
    }

    public void setHeatindexm(String heatindexm) {
        this.heatindexm = heatindexm;
    }

    public String getHeatindexi() {
        return heatindexi;
    }

    public void setHeatindexi(String heatindexi) {
        this.heatindexi = heatindexi;
    }

    public String getPrecipm() {
        return precipm;
    }

    public void setPrecipm(String precipm) {
        this.precipm = precipm;
    }

    public String getPrecipi() {
        return precipi;
    }

    public void setPrecipi(String precipi) {
        this.precipi = precipi;
    }

    public String getConds() {
        return conds;
    }

    public void setConds(String conds) {
        this.conds = conds;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getFog() {
        return fog;
    }

    public void setFog(String fog) {
        this.fog = fog;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getSnow() {
        return snow;
    }

    public void setSnow(String snow) {
        this.snow = snow;
    }

    public String getHail() {
        return hail;
    }

    public void setHail(String hail) {
        this.hail = hail;
    }

    public String getThunder() {
        return thunder;
    }

    public void setThunder(String thunder) {
        this.thunder = thunder;
    }

    public String getTornado() {
        return tornado;
    }

    public void setTornado(String tornado) {
        this.tornado = tornado;
    }

    public String getMetar() {
        return metar;
    }

    public void setMetar(String metar) {
        this.metar = metar;
    }

}
