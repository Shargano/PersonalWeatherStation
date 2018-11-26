package com.example.sharg.myweatherstation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;


public class DataFragment extends Fragment {
    private static TextView temperatureValue, humidityValue, pressureValue, airSpeedValue;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_data, container, false);
        generateRandomDates(v);
        return v;
    }

    public void generateRandomDates(View view) {
        Random random = new Random();
        temperatureValue = view.findViewById(R.id.temperatureValue);
        temperatureValue.setText(String.valueOf(random.nextInt(40) - 15));
        humidityValue = view.findViewById(R.id.humidityValue);
        humidityValue.setText(String.valueOf(random.nextInt(40) - 15));
        pressureValue = view.findViewById(R.id.pressureValue);
        pressureValue.setText(String.valueOf(random.nextInt(40) - 15));
        airSpeedValue = view.findViewById(R.id.airSpeedValue);
        airSpeedValue.setText(String.valueOf(random.nextInt(40) - 15));

    }

}