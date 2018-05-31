package com.bespokesoftbd.elias.weatherforecast.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bespokesoftbd.elias.weatherforecast.R;
import com.bespokesoftbd.elias.weatherforecast.forecast_weather_models.ForecastWeather;
import com.bespokesoftbd.elias.weatherforecast.web_api.RetrofitClient;
import com.bespokesoftbd.elias.weatherforecast.web_api.WeatherApi;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherForecastActivity extends AppCompatActivity {
    WeatherApi weatherApi;
    String location;
    String forecastWeatherURL = "api/8ffec187b0d5a8ad/forecast/q/BD/";
    TextView forecast1TV, forecast2TV,forecast3TV,forecast4TV,forecast5TV,forecast6TV,forecast7TV,forecast8TV;
    ImageView image1IV,image2IV,image3IV,image4IV,image5IV,image6IV,image7IV,image8IV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_forecast);

        forecast1TV = findViewById(R.id.forecast1TV);
        forecast2TV = findViewById(R.id.forecast2TV);
        forecast3TV = findViewById(R.id.forecast3TV);
        forecast4TV = findViewById(R.id.forecast4TV);
        forecast5TV = findViewById(R.id.forecast5TV);
        forecast6TV = findViewById(R.id.forecast6TV);
        forecast7TV = findViewById(R.id.forecast7TV);
        forecast8TV = findViewById(R.id.forecast8TV);

        image1IV = findViewById(R.id.image1IV);
        image2IV = findViewById(R.id.image2IV);
        image3IV = findViewById(R.id.image3IV);
        image4IV = findViewById(R.id.image4IV);
        image5IV = findViewById(R.id.image5IV);
        image6IV = findViewById(R.id.image6IV);
        image7IV = findViewById(R.id.image7IV);
        image8IV = findViewById(R.id.image8IV);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        location = pref.getString("name",null);

        weatherApi = RetrofitClient.getRetrofitClient().create(WeatherApi.class);
        forecastWeatherURL = forecastWeatherURL+location+".json";

        Call<ForecastWeather> forecastWeatherCall = weatherApi.getForecast(forecastWeatherURL);
        forecastWeatherCall.enqueue(new Callback<ForecastWeather>() {
            @Override
            public void onResponse(Call<ForecastWeather> call, Response<ForecastWeather> response) {
                ForecastWeather forecastWeather = response.body();
                String forecast1Details =forecastWeather.getForecast().getTxtForecast().getForecastday().get(0).getTitle()+
                        ", "+forecastWeather.getForecast().getSimpleforecast().getForecastday().get(0).getDate().getMonthname()+
                        "\n\n"+forecastWeather.getForecast().getTxtForecast().getForecastday().get(0).getFcttextMetric();
                forecast1TV.setText(forecast1Details);
                String image1 = forecastWeather.getForecast().getTxtForecast().getForecastday().get(0).getIconUrl();
                Picasso.get().load(image1).into(image1IV);

                String forecast2Details =forecastWeather.getForecast().getTxtForecast().getForecastday().get(1).getTitle()+
                        ", "+forecastWeather.getForecast().getSimpleforecast().getForecastday().get(0).getDate().getMonthname()+
                        "\n\n"+forecastWeather.getForecast().getTxtForecast().getForecastday().get(1).getFcttextMetric();
                forecast2TV.setText(forecast2Details);
                String image2 = forecastWeather.getForecast().getTxtForecast().getForecastday().get(1).getIconUrl();
                Picasso.get().load(image2).into(image2IV);

                String forecast3Details =forecastWeather.getForecast().getTxtForecast().getForecastday().get(2).getTitle()+
                        ", "+forecastWeather.getForecast().getSimpleforecast().getForecastday().get(0).getDate().getMonthname()+
                        "\n\n"+forecastWeather.getForecast().getTxtForecast().getForecastday().get(2).getFcttextMetric();
                forecast3TV.setText(forecast3Details);
                String image3 = forecastWeather.getForecast().getTxtForecast().getForecastday().get(2).getIconUrl();
                Picasso.get().load(image3).into(image3IV);

                String forecast4Details =forecastWeather.getForecast().getTxtForecast().getForecastday().get(3).getTitle()+
                        ", "+forecastWeather.getForecast().getSimpleforecast().getForecastday().get(0).getDate().getMonthname()+
                        "\n\n"+forecastWeather.getForecast().getTxtForecast().getForecastday().get(3).getFcttextMetric();
                forecast4TV.setText(forecast4Details);
                String image4 = forecastWeather.getForecast().getTxtForecast().getForecastday().get(3).getIconUrl();
                Picasso.get().load(image4).into(image4IV);

                String forecast5Details =forecastWeather.getForecast().getTxtForecast().getForecastday().get(4).getTitle()+
                        ", "+forecastWeather.getForecast().getSimpleforecast().getForecastday().get(0).getDate().getMonthname()+
                        "\n\n"+forecastWeather.getForecast().getTxtForecast().getForecastday().get(4).getFcttextMetric();
                forecast5TV.setText(forecast5Details);
                String image5 = forecastWeather.getForecast().getTxtForecast().getForecastday().get(4).getIconUrl();
                Picasso.get().load(image5).into(image5IV);

                String forecast6Details =forecastWeather.getForecast().getTxtForecast().getForecastday().get(5).getTitle()+
                        ", "+forecastWeather.getForecast().getSimpleforecast().getForecastday().get(0).getDate().getMonthname()+
                        "\n\n"+forecastWeather.getForecast().getTxtForecast().getForecastday().get(5).getFcttextMetric();
                forecast6TV.setText(forecast6Details);
                String image6 = forecastWeather.getForecast().getTxtForecast().getForecastday().get(5).getIconUrl();
                Picasso.get().load(image6).into(image6IV);

                String forecast7Details =forecastWeather.getForecast().getTxtForecast().getForecastday().get(6).getTitle()+
                        ", "+forecastWeather.getForecast().getSimpleforecast().getForecastday().get(0).getDate().getMonthname()+
                        "\n\n"+forecastWeather.getForecast().getTxtForecast().getForecastday().get(6).getFcttextMetric();
                forecast7TV.setText(forecast7Details);
                String image7 = forecastWeather.getForecast().getTxtForecast().getForecastday().get(6).getIconUrl();
                Picasso.get().load(image7).into(image7IV);

                String forecast8Details =forecastWeather.getForecast().getTxtForecast().getForecastday().get(7).getTitle()+
                        ", "+forecastWeather.getForecast().getSimpleforecast().getForecastday().get(0).getDate().getMonthname()+
                        "\n\n"+forecastWeather.getForecast().getTxtForecast().getForecastday().get(7).getFcttextMetric();
                forecast8TV.setText(forecast8Details);
                String image8 = forecastWeather.getForecast().getTxtForecast().getForecastday().get(7).getIconUrl();
                Picasso.get().load(image8).into(image8IV);

            }

            @Override
            public void onFailure(Call<ForecastWeather> call, Throwable t) {
                Toast.makeText(WeatherForecastActivity.this, "Fail", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.second_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.add){
            Intent intent = new Intent(getApplicationContext(),ChangeLocationActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
