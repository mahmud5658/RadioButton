package com.cyberx.radiobutton;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button showButton;
    private RadioButton genderButton;
    private TextView resultTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        showButton = (Button) findViewById(R.id.showButtonId);
        resultTextView = (TextView) findViewById(R.id.resultTextViewId);

        showButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                genderButton = (RadioButton) findViewById(selectedId);
                String value = genderButton.getText().toString();
                resultTextView.setText("You have selected : " + value);
            }
        });
    }
}