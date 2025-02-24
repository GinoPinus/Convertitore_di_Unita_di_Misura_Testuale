package lasalvia.simone.loginform_android;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView textViewEmail;
    TextView textViewPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewPassword = findViewById(R.id.textViewPassword);
        Intent intent = getIntent();
        String email = "";
        String password = "";
        email = intent.getStringExtra("email");
        password = intent.getStringExtra("password");
        textViewEmail.setText(email);
        textViewPassword.setText(password);
    }
}