package com.venku.programmingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    RadioGroup rg;
    CheckBox cb, cb1, cb2/*,cb3,cb4*/;
    RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8,rb9,rb10;
    Button bt,bt2;
    TextView tv, tv1, tv2, tv3,tv5,tv6,tv7;
    public static final int Req_CD1 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        bt = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.button2);
        cb = (CheckBox) findViewById(R.id.checkbox);
        cb1 = (CheckBox) findViewById(R.id.checkbox1);
        cb2 = (CheckBox) findViewById(R.id.checkbox2);
        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        rb5 = (RadioButton) findViewById(R.id.radioButton5);
        rb6 = (RadioButton) findViewById(R.id.radioButton6);
        rb7 = (RadioButton) findViewById(R.id.radioButton7);
        rb8 = (RadioButton) findViewById(R.id.radioButton8);
        rb9 = (RadioButton) findViewById(R.id.radioButton9);
        rb10 = (RadioButton) findViewById(R.id.radioButton10);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv = (TextView) findViewById(R.id.textView3);
        tv3 = (TextView) findViewById(R.id.textView4);
        tv5 = (TextView) findViewById(R.id.textView5);
        tv6 = (TextView) findViewById(R.id.textView6);
        tv7 = (TextView) findViewById(R.id.textView7);
        Intent i = getIntent();
        Bundle bb = i.getExtras();
        final String a = bb.getString("Course");

        bt2.setVisibility(View.GONE);
        tv.setText("You Selected " + "\n" + a);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cb1.setChecked(false);
                cb2.setChecked(false);
            }
        });

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cb.setChecked(false);
                cb2.setChecked(false);

            }
        });

        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cb.setChecked(false);
                cb1.setChecked(false);
            }
        });


        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb2.setChecked(false);

            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb1.setChecked(false);

            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb4.setChecked(false);

            }
        });

        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb3.setChecked(false);
            }
        });

        rb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb6.setChecked(false);

            }
        });

        rb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb5.setChecked(false);

            }
        });

        rb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb8.setChecked(false);

            }
        });

        rb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb7.setChecked(false);
            }
        });


        rb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb10.setChecked(false);

            }
        });

        rb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb9.setChecked(false);
            }
        });


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Main3Activity.this,Main4Activity.class);
                int sum = 0;
                //String s;
                if (cb.isChecked() || cb1.isChecked() || cb2.isChecked()) {
                    if (cb.isChecked()) {
                        sum = 10000;
                    } else if (cb1.isChecked()) {
                        sum = 11105;
                    } else if (cb2.isChecked()) {
                        sum = 7500;
                    }

                    //s=Integer.toString(sum);
                    //Log.d("Sum",s);
                    i1.putExtra("Amount", sum);
                } else {
                    Toast.makeText(getApplicationContext(), "Please filled the course", Toast.LENGTH_LONG).show();
                }
                if (rb1.isChecked() || rb2.isChecked()) {
                    if (rb1.isChecked()) {
                        i1.putExtra("Payment", "CC Avenue");
                    } else if (rb2.isChecked()) {
                        i1.putExtra("Payment", "Paytm");
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Please Choose the Payment Method", Toast.LENGTH_LONG).show();
                }

                if (rb3.isChecked() || rb4.isChecked()) {
                    if (rb3.isChecked()) {
                        i1.putExtra("Gender", "male");
                    } else if (rb4.isChecked()) {
                        i1.putExtra("Gender", "female");
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Please Choose the Gender", Toast.LENGTH_LONG).show();
                }

                if (rb5.isChecked() || rb6.isChecked()) {
                    if (rb5.isChecked()) {
                        i1.putExtra("Duration", "6-Months");
                    } else if (rb6.isChecked()) {
                        i1.putExtra("Duration", "3-Months");
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Please Choose the Duration", Toast.LENGTH_LONG).show();
                }


                if (rb7.isChecked() || rb8.isChecked()) {
                    if (rb7.isChecked()) {
                        i1.putExtra("Trainer", "Suresh.K");
                    } else if (rb8.isChecked()) {
                        i1.putExtra("Trainer", "Vishnu.S");
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Please Choose the Trainer", Toast.LENGTH_LONG).show();
                }

                if (rb9.isChecked() || rb10.isChecked()) {
                    if (rb9.isChecked()) {
                        i1.putExtra("Timings", "Morning_Batch");
                    } else if (rb10.isChecked()) {
                        i1.putExtra("Timings", "Evening_Batch");
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Please Choose Course Timings", Toast.LENGTH_LONG).show();
                }


                if (cb.isChecked() || cb1.isChecked() || cb2.isChecked()) {
                    if (rb1.isChecked() || rb2.isChecked()) {
                        if (rb3.isChecked() || rb4.isChecked()) {
                            if (rb5.isChecked() || rb6.isChecked()) {
                                if (rb7.isChecked() || rb8.isChecked()) {
                                    if (rb9.isChecked() || rb10.isChecked()) {
                                        /* if(cb.isChecked()||cb1.isChecked()||cb2.isChecked() ){*/
                                        i1.putExtra("Course", a);
                                        startActivityForResult(i1, Req_CD1);
                                        /*}*/

                                    }
                                }
                            }
                        }
                    }
                }


            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(Req_CD1==requestCode) {
            if (resultCode == RESULT_OK) {
                Intent i = getIntent();
                Bundle bb = i.getExtras();
                final String a = bb.getString("Course");
                Bundle b1 = data.getExtras();
                String st1 = b1.getString("Name");
                String st2 = b1.getString("Mobile");
                String st3 = b1.getString("Bank");
                String st4 = b1.getString("Address");
                String st5 = b1.getString("AGE");
                String st6 = b1.getString("ACC");
                String st7= b1.getString("Email");
                tv.setText("CONGRATULATIONS \n" + "You Selected : " + a+ " Tutorial \n" + st1 + "\n" +st5+"\n"+st7+"\n"+
                        st2 + "\n" + st3 +"\n"+ st6+"\n" + st4+"\n"+"\n"+"\n"+"'press Back' \n & \n 'select one More Course'");
                bt.setVisibility(View.GONE);
                cb.setVisibility(View.GONE);
                cb1.setVisibility(View.GONE);
                cb2.setVisibility(View.GONE);
                rb1.setVisibility(View.GONE);
                rb2.setVisibility(View.GONE);
                rb3.setVisibility(View.GONE);
                rb4.setVisibility(View.GONE);
                rb5.setVisibility(View.GONE);
                rb6.setVisibility(View.GONE);
                rb7.setVisibility(View.GONE);
                rb8.setVisibility(View.GONE);
                tv1.setVisibility(View.GONE);
                tv2.setVisibility(View.GONE);
                tv3.setVisibility(View.GONE);
                tv5.setVisibility(View.GONE);
                tv6.setVisibility(View.GONE);
                tv7.setVisibility(View.GONE);
                rb9.setVisibility(View.GONE);
                rb10.setVisibility(View.GONE);
                bt2.setVisibility(View.VISIBLE);

                //now button click
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1 = new Intent(Main3Activity.this,Main5Activity.class);
                        Toast.makeText(Main3Activity.this, "classes Started", Toast.LENGTH_SHORT).show();
                        startActivity(i1);
                    }
                });

           /* new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i =new Intent(Main2Activity.this,MainActivity.class);
                    startActivity(i);
                    finish();

                }
            },5000);*/
            }

            else{
                bt.setVisibility(View.GONE);
                cb.setVisibility(View.GONE);
                cb1.setVisibility(View.GONE);
                cb2.setVisibility(View.GONE);
                rb1.setVisibility(View.GONE);
                rb2.setVisibility(View.GONE);
                rb3.setVisibility(View.GONE);
                rb4.setVisibility(View.GONE);
                rb5.setVisibility(View.GONE);
                rb6.setVisibility(View.GONE);
                rb7.setVisibility(View.GONE);
                rb8.setVisibility(View.GONE);
                tv1.setVisibility(View.GONE);
                tv2.setVisibility(View.GONE);
                tv3.setVisibility(View.GONE);
                tv5.setVisibility(View.GONE);
                tv6.setVisibility(View.GONE);
                tv7.setVisibility(View.GONE);
                rb9.setVisibility(View.GONE);
                rb10.setVisibility(View.GONE);
                tv.setText("Transaction  : Failure  \n  please try once More"/*+" Name  :"+st1+"\n"+ "Mobile :"+st2+"\n"+"Bank :"+st3+"\n"+"Address : "+st4*/);
                Toast.makeText(Main3Activity.this,"ur Transaction got Failure",Toast.LENGTH_LONG).show();
                bt2.setVisibility(View.GONE);
            }

        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}