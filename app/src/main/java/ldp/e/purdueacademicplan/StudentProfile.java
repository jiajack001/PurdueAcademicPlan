package ldp.e.purdueacademicplan;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class StudentProfile extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_profile);

        Intent planOverviewPage = new Intent(getApplicationContext(), PlanOverview.class);
        startActivity(planOverviewPage);
        finish();
    }
}
