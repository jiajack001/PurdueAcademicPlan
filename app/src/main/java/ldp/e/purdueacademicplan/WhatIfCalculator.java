package ldp.e.purdueacademicplan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class WhatIfCalculator extends AppCompatActivity {
    String [] majorList = new String[] {"CNIT", "CSEC", "NENT", "SAAD"};
    String [] minorList = new String[] {"CS", "PSY", "MA", "ENGL", "POL", "EAPS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.what_if_calculator);

        Spinner spinnerMajor = (Spinner) findViewById(R.id.spinnerMajor);
        ArrayAdapter<String> adapterMajor = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, majorList);
        adapterMajor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMajor.setAdapter(adapterMajor);

        Spinner spinnerMinor = (Spinner) findViewById(R.id.spinnerMinor);
        ArrayAdapter<String> adapterMinor = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, minorList);
        adapterMinor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMinor.setAdapter(adapterMinor);



    }
}