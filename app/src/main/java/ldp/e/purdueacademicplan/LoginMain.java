package ldp.e.purdueacademicplan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;



public class LoginMain extends AppCompatActivity {
    EditText usernameEditText;
    EditText passwordEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Password Hash using SHA-256
                String password = passwordEditText.getText().toString();
                String hash = "";
                try {
                    MessageDigest digest = MessageDigest.getInstance("SHA-256");
                    byte[] hashByte = digest.digest(password.getBytes("UTF-8"));

                    for (byte b : hashByte) {
                        String hex = String.format("%02x", b);
                        hash += hex;
                    }

                }catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });



    }
}