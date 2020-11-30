package ldp.e.purdueacademicplan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class WhatIfCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.what_if_calculator);

        Spinner spinnerMajor = (Spinner) findViewById(R.id.spinnerMajor);
        ArrayAdapter<CharSequence> adapterMajor = ArrayAdapter.createFromResource(this,R.array.Majors, android.R.layout.simple_spinner_item);
        adapterMajor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMajor.setAdapter(adapterMajor);

        Spinner spinnerMinor = (Spinner) findViewById(R.id.spinnerMinor);
        ArrayAdapter<CharSequence> adapterMinor = ArrayAdapter.createFromResource(this,R.array.Minors, android.R.layout.simple_spinner_item);
        adapterMinor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMinor.setAdapter(adapterMinor);



    }
}