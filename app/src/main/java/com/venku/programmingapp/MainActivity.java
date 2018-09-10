package com.venku.programmingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.textView);
    }
    public  void Button_1(View view){
        switch (view.getId()){
            case R.id.button:
                Intent i = new Intent(MainActivity.this,Main3Activity.class);
                i.putExtra("Course","Java");
                startActivity(i);
                break;
            case R.id.button1:
                Intent i1 = new Intent(MainActivity.this,Main3Activity.class);
                i1.putExtra("Course","Android");
                startActivity(i1);
                break;
            case R.id.button2:
                Intent i2 = new Intent(MainActivity.this,Main3Activity.class);
                i2.putExtra("Course","c#");
                startActivity(i2);
                break;
            case R.id.button3:
                Intent i3 = new Intent(MainActivity.this,Main3Activity.class);
                i3.putExtra("Course","sql");
                startActivity(i3);
                break;
            case R.id.button4:
                Intent i4 = new Intent(MainActivity.this,Main3Activity.class);
                i4.putExtra("Course",".NET");
                startActivity(i4);
                break;
            case R.id.button5:
                Intent i5 = new Intent(MainActivity.this,Main3Activity.class);
                i5.putExtra("Course","c/c++");
                startActivity(i5);
                break;
            case R.id.button6:
                Intent i6 = new Intent(MainActivity.this,Main3Activity.class);
                i6.putExtra("Course","j2ee");
                startActivity(i6);
                break;
            case R.id.button7:
                Intent i7= new Intent(MainActivity.this,Main3Activity.class);
                i7.putExtra("Course","java \n frameworks");
                startActivity(i7);
                break;
            case R.id.button8:
                Intent i8 = new Intent(MainActivity.this,Main3Activity.class);
                i8.putExtra("Course","Html");
                startActivity(i8);
                break;
            case R.id.button9:
                Intent i9 = new Intent(MainActivity.this,Main3Activity.class);
                i9.putExtra("Course","css");
                startActivity(i9);
                break;
            case R.id.button10:
                Intent i10= new Intent(MainActivity.this,Main3Activity.class);
                i10.putExtra("Course","javaScript");
                startActivity(i10);
                break;
            case R.id.button11:
                Intent i11 = new Intent(MainActivity.this,Main3Activity.class);
                i11.putExtra("Course","AngularJS");
                startActivity(i11);
                break;
            case R.id.button12:
                Intent i12 = new Intent(MainActivity.this,Main3Activity.class);
                i12.putExtra("Course","IOS");
                startActivity(i12);
                break;

            case R.id.button13:
                Intent i13 = new Intent(MainActivity.this,Main3Activity.class);
                i13.putExtra("Course","PHYTON");
                startActivity(i13);
                break;
            case R.id.button14:
                Intent i14 = new Intent(MainActivity.this,Main3Activity.class);
                i14.putExtra("Course","PHP");
                startActivity(i14);
                break;
            case R.id.button15:
                Intent i15 = new Intent(MainActivity.this,Main3Activity.class);
                i15.putExtra("Course","ASP.NET");
                startActivity(i15);
                break;


        }
    }


}
