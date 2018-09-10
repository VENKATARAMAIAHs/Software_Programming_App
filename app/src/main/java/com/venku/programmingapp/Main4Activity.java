package com.venku.programmingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    TextView tv;
    EditText et, et1, et2, et3,et4,et5,et6,et7;
    Button bt;
    Button bt1;
    private Boolean is_completed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tv = (TextView) findViewById(R.id.textView);
        et = (EditText) findViewById(R.id.editText);
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText3);
        et3 = (EditText) findViewById(R.id.editText4);
        et4 = (EditText) findViewById(R.id.editText5);
        et5 = (EditText) findViewById(R.id.editText6);
        et6= (EditText)findViewById(R.id.editText7);
        bt = (Button)findViewById(R.id.button);
        bt1 = (Button)findViewById(R.id.button1);
        Intent in1 = getIntent();
        Bundle b = in1.getExtras();
        int sum = b.getInt("Amount");
        String st1 = b.getString("Payment");
        String st2 = b.getString("Course");
        String st3 = b.getString("Gender");
        String st4 = b.getString("Duration");
        String st5 = b.getString("Trainer");
        String st6 = b.getString("Timings");
        tv.setText("course : "+st2+"\n"+"Fee : "+Integer.toString(sum)+"\n"+"Payment : "+st1+"\n"+"Gender : "+st3+"\n"+"Duration : "+st4+"\n"+
                "Trainer : "+st5+"\n"+"Timings : "+st6);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Main4Activity.this,Main3Activity.class);
                String name=et.getText().toString();
                String mobile=et1.getText().toString();
                String bank=et2.getText().toString();
                String address=et3.getText().toString();
                String age=et5.getText().toString();
                String accountNo=et4.getText().toString();
                String email=et6.getText().toString();


                in.putExtra("Name", "Name is : " + name);
                in.putExtra("Mobile", "Mobile no is : " + mobile);
                /*in.putExtra("Mobile", "mobile no is : " + et1.getText().toString());*/
                in.putExtra("Bank", "Bank  : " + bank);
                in.putExtra("Address", "Address : " + address);
                in.putExtra("AGE", "Age : " + age);
                in.putExtra("ACC", "AccNo : " + accountNo);
                in.putExtra("Email", "Email : " + email);

                if (name.equals("")){
                    Toast.makeText(Main4Activity.this, "please enter valid name", Toast.LENGTH_SHORT).show();
                    et.requestFocus();
                    return;
                }
                if (mobile.equals("")){
                    Toast.makeText(Main4Activity.this, "please enter Mobile number", Toast.LENGTH_SHORT).show();
                    et1.requestFocus();
                    return;
                }
                if (bank.equals("")){
                    Toast.makeText(Main4Activity.this, "please enter Bank AccNo", Toast.LENGTH_SHORT).show();
                    et2.requestFocus();
                    return;
                }
                if (address.equals("")){
                    Toast.makeText(Main4Activity.this, "please enter valid Address", Toast.LENGTH_SHORT).show();
                    et3.requestFocus();
                    return;
                }


                if (age.equals("")){
                    Toast.makeText(Main4Activity.this, "please enter valid Age", Toast.LENGTH_SHORT).show();
                    et5.requestFocus();
                    return;
                }

                if (accountNo.equals("")){
                    Toast.makeText(Main4Activity.this, "please enter valid AccNo", Toast.LENGTH_SHORT).show();
                    et4.requestFocus();
                    return;
                }


                if (email.equals("")){
                    Toast.makeText(Main4Activity.this, "please enter valid Address", Toast.LENGTH_SHORT).show();
                    et6.requestFocus();
                    return;
                }
                setResult(RESULT_OK, in);
                finish();
                /*is_completed = true;*/

            }
        });


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent();
                in1.putExtra("Name",et.getText().toString());
                in1.putExtra("Mobile",et1.getText().toString());
                in1.putExtra("Bank",et2.getText().toString());
                in1.putExtra("Address",et3.getText().toString());
                setResult(RESULT_CANCELED,in1);
                finish();

            }
        });

    }

    @Override
    public void onBackPressed() {

        if(!is_completed==true)
        {
            Toast.makeText(this, "press on cancel to go Back!!!!!!!!!!..", Toast.LENGTH_SHORT).show();
            return;
        }
        super.onBackPressed();
    }
}