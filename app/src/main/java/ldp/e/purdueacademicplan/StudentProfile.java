package ldp.e.purdueacademicplan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StudentProfile extends AppCompatActivity {
    Button whatIfCalculatorButton;
    Button planOverviewButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_profile);

        whatIfCalculatorButton = findViewById(R.id.whatIfCalculatorButton);
        whatIfCalculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whatIfCalculatorPage = new Intent(getApplicationContext(), WhatIfCalculator.class);
                startActivity(whatIfCalculatorPage);
                finish();
            }
        });

        planOverviewButton = findViewById(R.id.planOverviewButton);
        planOverviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent planOverviewPage = new Intent(getApplicationContext(), PlanOverview.class);
                startActivity(planOverviewPage);
                finish();
            }
        });




    }
}
