package lk.vinurachan.pizzahutdemo_native;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    static AppCompatActivity objMain = null;
    Button signUpBtn;
    Button loginBtn;
    TextView forgotPasswd;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        objMain = this;

        Click_SignUp_Button();
        Click_Login_Button();
        Click_ForgotPassword();
    }

    private void Click_SignUp_Button() {

        signUpBtn = findViewById(R.id.signUpBtn);

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentResListScrn = new Intent(objMain, SignUpActivity.class);
                startActivity(intentResListScrn);
            }
        });
    }

    private void Click_Login_Button() {

        loginBtn = findViewById(R.id.loginBtn);
        username = findViewById(R.id.usernameText);
        password = findViewById(R.id.passwdText);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
                    Toast.makeText(LoginActivity.this, "You have successfully logged in", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginActivity.this, "Please complete the required fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void Click_ForgotPassword() {

        forgotPasswd = findViewById(R.id.fgtPaswdClickable);

        forgotPasswd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "You have redirected to reset your password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}