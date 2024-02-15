package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   EditText username,password;
   Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Log In Data Accepted", Toast.LENGTH_SHORT).show();
                    switchViews();
                } else {
                    Toast.makeText(MainActivity.this, "Log In Data Incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void switchViews() {
        Intent intent = new Intent(this, SecondView.class);
        startActivity(intent);
    }
}