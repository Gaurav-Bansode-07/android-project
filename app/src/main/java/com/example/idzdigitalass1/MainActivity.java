package com.example.idzdigitalass1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.editTextName);
        EditText dob = findViewById(R.id.editTextDOB);
        EditText email = findViewById(R.id.editTextEmail);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString();
                String userDOB = dob.getText().toString();
                String userEmail = email.getText().toString();

                // Create an intent to send data to SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", userName);
                intent.putExtra("dob", userDOB);
                intent.putExtra("email", userEmail);

                startActivity(intent);
            }
        });
    }
}
