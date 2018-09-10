package com.venku.programmingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

    }


    public  void Button_1(View view){
        switch (view.getId()){
            case R.id.button:
                Toast.makeText(this, "What is \n Android", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button1:
                break;
            case R.id.button2:
                break;
            case R.id.button3:

                break;
            case R.id.button4:

                break;
            case R.id.button5:

                break;
            case R.id.button6:

                break;
            case R.id.button7:

                break;
            case R.id.button8:

                break;
            case R.id.button9:

                break;
            case R.id.button10:

                break;
            case R.id.button11:

                break;
            case R.id.button12:

            case R.id.button13:

                break;
            case R.id.button14:

                break;
            case R.id.button15:

                break;


        }
    }
}
