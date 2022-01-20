package lk.vinurachan.pizzahutdemo_native;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    Button clearBtn;
    Button registerBtn;
    EditText username;
    EditText email;
    EditText password;
    EditText confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        username = findViewById(R.id.regUserText);
        email = findViewById(R.id.emailText);
        password = findViewById(R.id.regPasswordText);
        confirmPassword = findViewById(R.id.regConfPasswordText);

        Click_Clear_Button();
        Click_Register_Button();
    }

    private void Click_Clear_Button() {

        clearBtn =findViewById(R.id.clearBtn);
        clearBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                username.getText().clear();
                email.getText().clear();
                password.getText().clear();
                confirmPassword.getText().clear();
            }
        });
    }

    private void Click_Register_Button() {

        registerBtn = findViewById(R.id.registerBtn);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (username.getText().toString().isEmpty() || email.getText().toString().isEmpty() ||
                        password.getText().toString().isEmpty() || confirmPassword.getText().toString().isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Please complete the required fields", Toast.LENGTH_SHORT).show();
                } else if (!password.getText().toString().equals(confirmPassword.getText().toString())) {
                    Toast.makeText(SignUpActivity.this, "Passwords mismatch", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(SignUpActivity.this, "You have been successfully registered", Toast.LENGTH_SHORT).show();
            }
        });
    }
}