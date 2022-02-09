package com.calculatore.imam;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
	private Button btn1, btn2, btn3, btn4;
	private EditText et1, et2;
	private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		btn1 = findViewById(R.id.btn1);
		btn2 = findViewById(R.id.btn2);
		btn3 = findViewById(R.id.btn3);
		btn4 = findViewById(R.id.btn4);
		et1 = findViewById(R.id.et1);
		et2 = findViewById(R.id.et2);
		tv1 = findViewById(R.id.tv1);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
	    btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		tv1.setVisibility(View.INVISIBLE);
		
		
		
		}

	@Override
	public void onClick(View v) {
		
		
		    		
					String number1 = et1.getText().toString();
  String number2 = et2.getText().toString();
  
  double num1 = Double.parseDouble(number1);
  double num2 = Double.parseDouble(number2);
  
  if(v.getId()==R.id.btn1){
	  
	  
	  double sum = num1 + num2;
    tv1.setText("Here is your Result :"+ sum);
	tv1.setVisibility(View.VISIBLE);
	et1.setText(null);
	et2.setText(null);
	
	  
  }
    if(v.getId()==R.id.btn2){
	  
	  
	  double sum = num1 - num2;
    tv1.setText("Here is your Result :"+ sum);
	et1.setText(null);
	et2.setText(null);
	tv1.setVisibility(View.VISIBLE);
	}
	
	    if(v.getId()==R.id.btn3){
	  
	  
	  double sum = num1 * num2;
    tv1.setText("Here is your Result :"+ sum);
	et1.setText(null);
	et2.setText(null);
	tv1.setVisibility(View.VISIBLE);
	
	
	
	}	
	    if(v.getId()==R.id.btn4){
	  
	  
	  double sum = num1 / num2;
    tv1.setText("Here is your Result :"+ sum);
	et1.setText(null);
	et2.setText(null);
	tv1.setVisibility(View.VISIBLE);
	
    
    
		
	}
	}
	}
	
