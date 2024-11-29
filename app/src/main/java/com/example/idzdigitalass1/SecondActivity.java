package com.example.idzdigitalass1;

import android.os.Bundle;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Retrieve data from Intent
        String name = getIntent().getStringExtra("name");
        String dob = getIntent().getStringExtra("dob");
        String email = getIntent().getStringExtra("email");

        // Find the data row in the layout
        TableRow dataRow = findViewById(R.id.dataRow);

        // Add data to the data row
        addCellToRow(dataRow, name);
        addCellToRow(dataRow, dob);
        addCellToRow(dataRow, email);
    }

    // Method to add a cell (TextView) to a row
    private void addCellToRow(TableRow row, String value) {
        TextView textView = new TextView(this);
        textView.setText(value);
        textView.setPadding(8, 8, 8, 8);
        row.addView(textView);
    }
}
