package com.bespokesoftbd.elias.weatherforecast.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bespokesoftbd.elias.weatherforecast.BuildConfig;
import com.bespokesoftbd.elias.weatherforecast.R;
import com.bespokesoftbd.elias.weatherforecast.current_weather_models.CurrentWeather;
import com.bespokesoftbd.elias.weatherforecast.hourly_weather_models.HourlyWeather;
import com.bespokesoftbd.elias.weatherforecast.web_api.RetrofitClient;
import com.bespokesoftbd.elias.weatherforecast.web_api.WeatherApi;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    WeatherApi weatherApi;
    String currentWeatherURL = "api/8ffec187b0d5a8ad/conditions/q/BD/";
    String hourlyWeatherURL = "api/8ffec187b0d5a8ad/hourly/q/BD/";
    String location;
    TextView showLocationTV,showTempTV,showConditionTV,showWindFlowTV,showPressureTV,showHumidityTV,showUpdatedDateTV;
    ImageView showWeatherImageIV;
    Handler mHandler;

    TextView hour1TV,hour1Temp,hour2TV,hour2Temp,hour3TV,hour3Temp,hour4TV,hour4Temp,hour5TV,hour5Temp,hour6TV,hour6Temp,hour7TV,hour7Temp;
    ImageView hour1IV,hour2IV,hour3IV,hour4IV,hour5IV,hour6IV,hour7IV;

    AlertDialog.Builder aleartDialogBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(!isConnected(MainActivity.this)) buildDialog(MainActivity.this).show();
        else {
            setContentView(R.layout.activity_main);
        }

        this.mHandler = new Handler();
        m_Runnable.run();

        showLocationTV = findViewById(R.id.showLocation);
        showTempTV = findViewById(R.id.showTemp);
        showConditionTV = findViewById(R.id.showCondition);
        showWindFlowTV = findViewById(R.id.showWindFlow);
        showPressureTV = findViewById(R.id.showPressure);
        showHumidityTV = findViewById(R.id.showHumidity);
        showUpdatedDateTV = findViewById(R.id.showUpdatedDate);
        showWeatherImageIV = findViewById(R.id.showWeatherImage);

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
        hour7TV = findViewById(R.id.hour7TV);
        hour7Temp = findViewById(R.id.hour7Temp);
        hour7IV = findViewById(R.id.hour7IV);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        location = pref.getString("name",null);

        weatherApi = RetrofitClient.getRetrofitClient().create(WeatherApi.class);

        //For dymanic link
        currentWeatherURL = currentWeatherURL +location+".json";
        hourlyWeatherURL = hourlyWeatherURL + location+".json";

        Call<CurrentWeather> currentWeatherCall = weatherApi.getCurrentWeather(currentWeatherURL);
        currentWeatherCall.enqueue(new Callback<CurrentWeather>() {
            @Override
            public void onResponse(Call<CurrentWeather> call, Response<CurrentWeather> response) {
                CurrentWeather currentWeather = response.body();

                String weatherImageURL = currentWeather.getCurrentObservation().getIconUrl();
                Picasso.get().load(weatherImageURL).into(showWeatherImageIV);

                String currentLocation = currentWeather.getCurrentObservation().getDisplayLocation().getFull();
                showLocationTV.setText(currentLocation);

                String temp = currentWeather.getCurrentObservation().getTempC()+" °C" + " | " +
                        currentWeather.getCurrentObservation().getTempF()+" °F";
                showTempTV.setText(temp);

                String condition = currentWeather.getCurrentObservation().getWeather();
                showConditionTV.setText(condition);

                String windFlow ="Wind: " + currentWeather.getCurrentObservation().getWindString();
                showWindFlowTV.setText(windFlow);

                String pressure = "Pressure: " + currentWeather.getCurrentObservation().getPressureMb() + " hPa";
                showPressureTV.setText(pressure);

                String humidity = "Humidity: " + currentWeather.getCurrentObservation().getRelativeHumidity();
                showHumidityTV.setText(humidity);

                String updatedDate = currentWeather.getCurrentObservation().getObservationTime();
                showUpdatedDateTV.setText(updatedDate);

            }
            @Override
            public void onFailure(Call<CurrentWeather> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed to load Data", Toast.LENGTH_SHORT).show();

            }
        });


        Call<HourlyWeather> hourlyWeatherCall = weatherApi.getHourlyWeather(hourlyWeatherURL);
        hourlyWeatherCall.enqueue(new Callback<HourlyWeather>() {
            @Override
            public void onResponse(Call<HourlyWeather> call, Response<HourlyWeather> response) {
                HourlyWeather hourlyWeather = response.body();
                //=====hour1Details====
                String hour1Details = hourlyWeather.getHourlyForecast().get(0).getFCTTIME().getPretty() + "\n"
                        +hourlyWeather.getHourlyForecast().get(0).getCondition()+ "\nHumidity: " +
                        hourlyWeather.getHourlyForecast().get(0).getHumidity() + "%"+ "\nFeels Like: "+
                        hourlyWeather.getHourlyForecast().get(0).getFeelslike().getMetric()+ "°C";
                hour1TV.setText(hour1Details);

                String hour1Image = hourlyWeather.getHourlyForecast().get(0).getIconUrl();
                Picasso.get().load(hour1Image).into(hour1IV);

                String hour1TempDetails = hourlyWeather.getHourlyForecast().get(0).getTemp().getMetric() + "°C";
                hour2Temp.setText(hour1TempDetails);

                //=====hour2Details====

                String hour2Details = hourlyWeather.getHourlyForecast().get(3).getFCTTIME().getPretty() + "\n"
                        +hourlyWeather.getHourlyForecast().get(3).getCondition()+ "\nHumidity: " +
                        hourlyWeather.getHourlyForecast().get(3).getHumidity()+ "%" + "\nFeels Like: "+
                        hourlyWeather.getHourlyForecast().get(3).getFeelslike().getMetric() + "°C";
                hour2TV.setText(hour2Details);

                String hour2Image = hourlyWeather.getHourlyForecast().get(3).getIconUrl();
                Picasso.get().load(hour2Image).into(hour2IV);

                String hour2TempDetails = hourlyWeather.getHourlyForecast().get(3).getTemp().getMetric() + "°C";
                hour2Temp.setText(hour2TempDetails);

                //=====hour3Details====

                String hour3Details = hourlyWeather.getHourlyForecast().get(6).getFCTTIME().getPretty() + "\n"
                        +hourlyWeather.getHourlyForecast().get(6).getCondition()+ "\nHumidity: " +
                        hourlyWeather.getHourlyForecast().get(6).getHumidity()+ "%" + "\nFeels Like: "+
                        hourlyWeather.getHourlyForecast().get(6).getFeelslike().getMetric() + "°C";
                hour3TV.setText(hour3Details);

                String hour3Image = hourlyWeather.getHourlyForecast().get(6).getIconUrl();
                Picasso.get().load(hour3Image).into(hour3IV);

                String hour3TempDetails = hourlyWeather.getHourlyForecast().get(6).getTemp().getMetric() + "°C";
                hour3Temp.setText(hour3TempDetails);

                //=====hour4Details====

                String hour4Details = hourlyWeather.getHourlyForecast().get(9).getFCTTIME().getPretty() + "\n"
                        +hourlyWeather.getHourlyForecast().get(9).getCondition()+ "\nHumidity: " +
                        hourlyWeather.getHourlyForecast().get(9).getHumidity()+ "%" + "\nFeels Like: "+
                        hourlyWeather.getHourlyForecast().get(9).getFeelslike().getMetric() + "°C";
                hour4TV.setText(hour3Details);

                String hour4Image = hourlyWeather.getHourlyForecast().get(9).getIconUrl();
                Picasso.get().load(hour4Image).into(hour4IV);

                String hour4TempDetails = hourlyWeather.getHourlyForecast().get(9).getTemp().getMetric() + "°C";
                hour4Temp.setText(hour4TempDetails);

                //=====hour5Details====

                String hour5Details = hourlyWeather.getHourlyForecast().get(12).getFCTTIME().getPretty() + "\n"
                        +hourlyWeather.getHourlyForecast().get(12).getCondition()+ "\nHumidity: " +
                        hourlyWeather.getHourlyForecast().get(12).getHumidity()+ "%" + "\nFeels Like: "+
                        hourlyWeather.getHourlyForecast().get(12).getFeelslike().getMetric() + "°C";
                hour5TV.setText(hour5Details);

                String hour5Image = hourlyWeather.getHourlyForecast().get(12).getIconUrl();
                Picasso.get().load(hour5Image).into(hour5IV);

                String hour5TempDetails = hourlyWeather.getHourlyForecast().get(12).getTemp().getMetric() + "°C";
                hour5Temp.setText(hour5TempDetails);

                //=====hour6Details====

                String hour6Details = hourlyWeather.getHourlyForecast().get(15).getFCTTIME().getPretty() + "\n"
                        +hourlyWeather.getHourlyForecast().get(15).getCondition()+ "\nHumidity: " +
                        hourlyWeather.getHourlyForecast().get(15).getHumidity()+ "%" + "\nFeels Like: "+
                        hourlyWeather.getHourlyForecast().get(15).getFeelslike().getMetric() + "°C";
                hour6TV.setText(hour6Details);

                String hour6Image = hourlyWeather.getHourlyForecast().get(15).getIconUrl();
                Picasso.get().load(hour6Image).into(hour6IV);

                String hour6TempDetails = hourlyWeather.getHourlyForecast().get(15).getTemp().getMetric() + "°C";
                hour6Temp.setText(hour6TempDetails);

                //=====hour7Details====

                String hour7Details = hourlyWeather.getHourlyForecast().get(18).getFCTTIME().getPretty() + "\n"
                        +hourlyWeather.getHourlyForecast().get(18).getCondition()+ "\nHumidity: " +
                        hourlyWeather.getHourlyForecast().get(18).getHumidity()+ "%" + "\nFeels Like: "+
                        hourlyWeather.getHourlyForecast().get(18).getFeelslike().getMetric() + "°C";
                hour7TV.setText(hour7Details);

                String hour7Image = hourlyWeather.getHourlyForecast().get(18).getIconUrl();
                Picasso.get().load(hour7Image).into(hour7IV);

                String hour7TempDetails = hourlyWeather.getHourlyForecast().get(18).getTemp().getMetric() + "°C";
                hour7Temp.setText(hour7TempDetails);

            }

            @Override
            public void onFailure(Call<HourlyWeather> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed to load Data", Toast.LENGTH_SHORT).show();

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.add){
            Intent intent = new Intent(getApplicationContext(),ChangeLocationActivity.class);
            startActivity(intent);
            finish();
        }
        if (item.getItemId() == R.id.about){
            Intent intent = new Intent(getApplicationContext(),AboutAppActivity.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.share){
            final String appPackageName = BuildConfig.APPLICATION_ID;
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            String shareSubText = "My Notepad";
            String shareBodyText = "https://play.google.com/store/apps/details?id=" +appPackageName;
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubText);
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareBodyText);
            startActivity(Intent.createChooser(shareIntent, "Share With"));
        }
        if (item.getItemId() == R.id.exit){
            aleartDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            aleartDialogBuilder.setTitle("Confirm");
            aleartDialogBuilder.setMessage("Do you really want to exit ?");
            aleartDialogBuilder.setIcon(R.drawable.warning_icon);
            aleartDialogBuilder.setCancelable(false);
            aleartDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            aleartDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            AlertDialog alertDialog = aleartDialogBuilder.create();
            alertDialog.show();
        }
        return true;
    }

    public boolean isConnected(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if (netinfo != null && netinfo.isConnectedOrConnecting()) {
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting())) return true;
        else return false;
        } else
        return false;
    }
    public AlertDialog.Builder buildDialog(Context c) {
        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("No Internet Connection");
        builder.setMessage("You need to have Mobile Data or wifi to access this. Press ok to Exit");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        return builder;
    }

    public void yesterDay(View view) {
        Intent intent = new Intent(getApplicationContext(),YesterdayActivity.class);
        startActivity(intent);

    }


    public void Goforecast(View view) {
        Intent intent = new Intent(getApplicationContext(),WeatherForecastActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        aleartDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        aleartDialogBuilder.setTitle("Comfirm");
        aleartDialogBuilder.setMessage("Do you really want to exit ?");
        aleartDialogBuilder.setIcon(R.drawable.warning_icon);
        aleartDialogBuilder.setCancelable(false);
        aleartDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        aleartDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = aleartDialogBuilder.create();
        alertDialog.show();
    }

    private final Runnable m_Runnable = new Runnable() {
        public void run() {
           // Toast.makeText(MainActivity.this,"Refeshed",Toast.LENGTH_SHORT).show();

            MainActivity.this.mHandler.postDelayed(m_Runnable,20000);
        }

    };
}
