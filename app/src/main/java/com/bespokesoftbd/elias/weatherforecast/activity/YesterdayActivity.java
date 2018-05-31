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
import com.bespokesoftbd.elias.weatherforecast.web_api.RetrofitClient;
import com.bespokesoftbd.elias.weatherforecast.web_api.WeatherApi;
import com.bespokesoftbd.elias.weatherforecast.yesterday_weather_models.YesterdayWeather;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class YesterdayActivity extends AppCompatActivity {
    WeatherApi weatherApi;
    String yesterdayWeatherURL = "api/8ffec187b0d5a8ad/yesterday/q/BD/";
    String location;

    TextView hour1TV,hour1Temp,hour2TV,hour2Temp,hour3TV,hour3Temp,hour4TV,hour4Temp,hour5TV,hour5Temp,hour6TV,hour6Temp,summaryInfo;
    ImageView hour1IV,hour2IV,hour3IV,hour4IV,hour5IV,hour6IV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yesterday);

        weatherApi = RetrofitClient.getRetrofitClient().create(WeatherApi.class);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        location = pref.getString("name",null);
        yesterdayWeatherURL = yesterdayWeatherURL+ location+".json";

        hour1TV = findViewById(R.id.hour1TV);
        hour1Temp = findViewById(R.id.hour1Temp);
        hour1IV = findViewById(R.id.hour1IV);
        hour2TV = findViewById(R.id.hour2TV);
        hour2Temp = findViewById(R.id.hour2Temp);
        hour2IV = findViewById(R.id.hour2IV);
        hour3TV = findViewById(R.id.hour3TV);
        hour3Temp = findViewById(R.id.hour3Temp);
        hour3IV = findViewById(R.id.hour3IV);
        hour4TV = findViewById(R.id.hour4TV);
        hour4Temp = findViewById(R.id.hour4Temp);
        hour4IV = findViewById(R.id.hour4IV);
        hour5TV = findViewById(R.id.hour5TV);
        hour5Temp = findViewById(R.id.hour5Temp);
        hour5IV = findViewById(R.id.hour5IV);
        hour6TV = findViewById(R.id.hour6TV);
        hour6Temp = findViewById(R.id.hour6Temp);
        hour6IV = findViewById(R.id.hour6IV);
        summaryInfo = findViewById(R.id.summaryInfo);

        Call<YesterdayWeather> yesterdayWeatherCall = weatherApi.getYesterdayWeather(yesterdayWeatherURL);
        yesterdayWeatherCall.enqueue(new Callback<YesterdayWeather>() {
            @Override
            public void onResponse(Call<YesterdayWeather> call, Response<YesterdayWeather> response) {
                YesterdayWeather yesterdayWeather = response.body();

                String summary = yesterdayWeather.getHistory().getDailysummary().get(0).getDate().getPretty()+"\nMax Temp: "+
                        yesterdayWeather.getHistory().getDailysummary().get(0).getMintempm()+" °C" + "\nMin Temp: "+
                        yesterdayWeather.getHistory().getDailysummary().get(0).getMaxtempm()+" °C"+"\nMax Pressurem: "+
                        yesterdayWeather.getHistory().getDailysummary().get(0).getMinpressurem()+" hPa" + "\nMin Pressurem: "+
                        yesterdayWeather.getHistory().getDailysummary().get(0).getMaxpressurem()+" hPa"+"\nRain: "+
                        yesterdayWeather.getHistory().getDailysummary().get(0).getRain() + " times";
                summaryInfo.setText(summary);

                String hour1Details = yesterdayWeather.getHistory().getObservations().get(0).getDate().getPretty()+"\n"+
                        yesterdayWeather.getHistory().getObservations().get(0).getConds()+"\nHumidity: "+
                        yesterdayWeather.getHistory().getObservations().get(0).getHum()+"%"+"\nPressure: "+
                        yesterdayWeather.getHistory().getObservations().get(0).getPressurem()+ " hPa";
                hour1TV.setText(hour1Details);


               String image = yesterdayWeather.getHistory().getObservations().get(0).getIcon();
               String hour1Image = "http://icons.wxug.com/i/c/k/"+image+".gif";
               Picasso.get().load(hour1Image).into(hour1IV);

               String hour1TeamDetails = yesterdayWeather.getHistory().getObservations().get(0).getTempm()+"°C";
                hour1Temp.setText(hour1TeamDetails);


                String hour2Details = yesterdayWeather.getHistory().getObservations().get(1).getDate().getPretty()+"\n"+
                        yesterdayWeather.getHistory().getObservations().get(1).getConds()+"\nHumidity: "+
                        yesterdayWeather.getHistory().getObservations().get(1).getHum()+"%"+"\nPressure: "+
                        yesterdayWeather.getHistory().getObservations().get(1).getPressurem()+ " hPa";
                hour2TV.setText(hour2Details);


                String image2 = yesterdayWeather.getHistory().getObservations().get(1).getIcon();
                String hour2Image = "http://icons.wxug.com/i/c/k/"+image2+".gif";
                Picasso.get().load(hour2Image).into(hour2IV);

                String hour2TeamDetails = yesterdayWeather.getHistory().getObservations().get(1).getTempm()+"°C";
                hour2Temp.setText(hour2TeamDetails);


                String hour3Details = yesterdayWeather.getHistory().getObservations().get(2).getDate().getPretty()+"\n"+
                        yesterdayWeather.getHistory().getObservations().get(2).getConds()+"\nHumidity: "+
                        yesterdayWeather.getHistory().getObservations().get(2).getHum()+"%"+"\nPressure: "+
                        yesterdayWeather.getHistory().getObservations().get(2).getPressurem()+ " hPa";
                hour3TV.setText(hour3Details);


                String image3 = yesterdayWeather.getHistory().getObservations().get(2).getIcon();
                String hour3Image = "http://icons.wxug.com/i/c/k/"+image3+".gif";
                Picasso.get().load(hour3Image).into(hour3IV);

                String hour3TeamDetails = yesterdayWeather.getHistory().getObservations().get(2).getTempm()+"°C";
                hour3Temp.setText(hour3TeamDetails);


                String hour4Details = yesterdayWeather.getHistory().getObservations().get(3).getDate().getPretty()+"\n"+
                        yesterdayWeather.getHistory().getObservations().get(3).getConds()+"\nHumidity: "+
                        yesterdayWeather.getHistory().getObservations().get(3).getHum()+"%"+"\nPressure: "+
                        yesterdayWeather.getHistory().getObservations().get(3).getPressurem()+ " hPa";
                hour4TV.setText(hour4Details);


                String image4 = yesterdayWeather.getHistory().getObservations().get(3).getIcon();
                String hour4Image = "http://icons.wxug.com/i/c/k/"+image4+".gif";
                Picasso.get().load(hour4Image).into(hour4IV);

                String hour4TeamDetails = yesterdayWeather.getHistory().getObservations().get(3).getTempm()+"°C";
                hour4Temp.setText(hour4TeamDetails);


                String hour5Details = yesterdayWeather.getHistory().getObservations().get(4).getDate().getPretty()+"\n"+
                        yesterdayWeather.getHistory().getObservations().get(4).getConds()+"\nHumidity: "+
                        yesterdayWeather.getHistory().getObservations().get(4).getHum()+"%"+"\nPressure: "+
                        yesterdayWeather.getHistory().getObservations().get(4).getPressurem()+ " hPa";
                hour5TV.setText(hour5Details);


                String image5 = yesterdayWeather.getHistory().getObservations().get(4).getIcon();
                String hour5Image = "http://icons.wxug.com/i/c/k/"+image5+".gif";
                Picasso.get().load(hour5Image).into(hour5IV);

                String hour5TeamDetails = yesterdayWeather.getHistory().getObservations().get(4).getTempm()+"°C";
                hour5Temp.setText(hour5TeamDetails);


                String hour6Details = yesterdayWeather.getHistory().getObservations().get(5).getDate().getPretty()+"\n"+
                        yesterdayWeather.getHistory().getObservations().get(5).getConds()+"\nHumidity: "+
                        yesterdayWeather.getHistory().getObservations().get(5).getHum()+"%"+"\nPressure: "+
                        yesterdayWeather.getHistory().getObservations().get(5).getPressurem()+ " hPa";
                hour6TV.setText(hour6Details);

                String image6 = yesterdayWeather.getHistory().getObservations().get(5).getIcon();
                String hour6Image = "http://icons.wxug.com/i/c/k/"+image6+".gif";
                Picasso.get().load(hour6Image).into(hour6IV);

                String hour6TeamDetails = yesterdayWeather.getHistory().getObservations().get(5).getTempm()+"°C";
                hour6Temp.setText(hour6TeamDetails);

            }

            @Override
            public void onFailure(Call<YesterdayWeather> call, Throwable t) {

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
