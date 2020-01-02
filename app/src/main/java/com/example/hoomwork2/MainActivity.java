package com.example.hoomwork2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar s;
    TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=findViewById(R.id.text5);
         s =  findViewById(R.id.seekBar);

            s.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                    t.setText(String.valueOf(progress));
                    t.setText(seekbar(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
    }

    public static String seekbar(int num){
        String sss ="";
        if(num!=0){
        for (int i = 1; i <11 ; i++) {
            sss += num * i + "\n";
        }
        }
        return sss;
    }

}
