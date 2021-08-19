package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText1, editText2;
    TextView textView;
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        //

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = editText1.getText().toString().trim();
                String so2 = editText2.getText().toString().trim();

                //
                if (so1.length() == 0 || so2.length() == 0) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ số nhé!!", Toast.LENGTH_SHORT).show();
                } else {
                    int somot = Integer.parseInt(so1);
                    int sohai = Integer.parseInt(so2);
                    if (somot > sohai) {
                        Toast.makeText(MainActivity.this, "Vui lòng nhập số thứ nhất nhỏ hơn số thứ hai nhé!!", Toast.LENGTH_SHORT).show();
                    } else {
                        Random random = new Random();
                        int number = random.nextInt(sohai - somot + 1) + somot;
                        textView.setText(String.valueOf(number));
                    }
                }
            }
        });
    }
    //
    private void AnhXa()
    {
        button=(Button) findViewById(R.id.button);
        editText1=(EditText) findViewById(R.id.editTextTextPersonName2);
        editText2=(EditText) findViewById(R.id.editTextTextPersonName);
        textView=(TextView) findViewById(R.id.textView);
        relativeLayout=(RelativeLayout) findViewById(R.id.notification_background);
    }
}