package com.bespokesoftbd.elias.weatherforecast.web_api;

import com.bespokesoftbd.elias.weatherforecast.current_weather_models.CurrentWeather;
import com.bespokesoftbd.elias.weatherforecast.forecast_weather_models.ForecastWeather;
import com.bespokesoftbd.elias.weatherforecast.hourly_weather_models.HourlyWeather;
import com.bespokesoftbd.elias.weatherforecast.yesterday_weather_models.YesterdayWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface WeatherApi {
    @GET
    Call<CurrentWeather> getCurrentWeather(@Url String remainingUrl);

    @GET
    Call<HourlyWeather> getHourlyWeather(@Url String remain);

    @GET
    Call<ForecastWeather> getForecast(@Url String remainURL);

    @GET
    Call<YesterdayWeather> getYesterdayWeather(@Url String remainLink);

}
