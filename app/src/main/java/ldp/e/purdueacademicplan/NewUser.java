package ldp.e.purdueacademicplan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewUser extends AppCompatActivity {
    EditText userNameEditText;
    TextView passwordTextView;
    EditText passwordEditText;
    EditText confirmEditText;
    TextView confirmTextView;
    EditText emailEditText;
    CheckBox freshmanCheckBox;
    Button createButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user);

        userNameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        passwordTextView = findViewById(R.id.passwordTextView);
        confirmEditText = findViewById(R.id.confirmEditText);
        confirmTextView = findViewById(R.id.confirmTextView);

        // To check if passwords are the same
        confirmEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String password = passwordEditText.getText().toString();
                String confirm = confirmEditText.getText().toString();

                if (password.equals(confirm)) {
                    passwordTextView.setTextColor(Color.parseColor("#FFC107"));
                    confirmTextView.setTextColor(Color.parseColor("#FFC107"));
                } else if (!password.equals(confirm)) {
                    passwordTextView.setTextColor(Color.RED);
                    confirmTextView.setTextColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "Please confirm that passwords are the same!", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        emailEditText = findViewById(R.id.emailEditText);

        freshmanCheckBox = findViewById(R.id.freshmanCheckBox);
        createButton = findViewById(R.id.createButton);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = passwordEditText.getText().toString();
                String confirm = confirmEditText.getText().toString();

                if (!password.isEmpty() && !confirm.isEmpty()) {
                    passwordTextView.setTextColor(Color.RED);
                    confirmTextView.setTextColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "Please enter a password for the account!", Toast.LENGTH_SHORT).show();


                } else if (password.equals(confirm)) {
                    String username = userNameEditText.getText().toString();
                    String email = emailEditText.getText().toString();
                    boolean freshman = freshmanCheckBox.isChecked();


                    //TODO: Update User Database Here!!!


                    Intent planOverviewPage = new Intent(getApplicationContext(), PlanOverview.class);
                    startActivity(planOverviewPage);
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(), "Please confirm that passwords are the same!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
