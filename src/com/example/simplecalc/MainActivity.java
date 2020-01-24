package com.example.simplecalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, bequal, bclear, b10;
	EditText et1;
	
	float firstVal, secVal;
	boolean Addition, Subtraction, Multiplication, Division, Percentage;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        b0=(Button)findViewById(R.id.button3);
        b1=(Button)findViewById(R.id.button13);
        b2=(Button)findViewById(R.id.button14);
        b3=(Button)findViewById(R.id.button15);
        b4=(Button)findViewById(R.id.button9);
        b5=(Button)findViewById(R.id.button10);
        b6=(Button)findViewById(R.id.button11);
        b7=(Button)findViewById(R.id.button5);
        b8=(Button)findViewById(R.id.button6);
        b9=(Button)findViewById(R.id.button7);
        b10=(Button)findViewById(R.id.button2);
        badd=(Button)findViewById(R.id.button16);
        bsub=(Button)findViewById(R.id.button12);
        bmul=(Button)findViewById(R.id.button8);
        bdiv=(Button)findViewById(R.id.button4);
        bclear=(Button)findViewById(R.id.button1);
        bequal=(Button)findViewById(R.id.button17);
        et1=(EditText)findViewById(R.id.editText1);
        
        b0.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et1.setText(et1.getText() +"0");
				
			}
		});
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et1.setText(et1.getText()+"1");
				
			}
		});
            b2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
				et1.setText(et1.getText()+"2");	
				}
		});
            b3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					et1.setText(et1.getText()+"3");
						
				}
			});
            b4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					et1.setText(et1.getText()+"4");
					
				}
			});
            b5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					et1.setText(et1.getText()+"5");
					
				}
			});
            b6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					et1.setText(et1.getText()+"6");
					
				}
			});
            b7.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					et1.setText(et1.getText()+"7");
						
				}
			});
            b8.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					et1.setText(et1.getText()+"8");
						
				}
			});
            b9.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					et1.setText(et1.getText()+"9");
					
				}
			});
            badd.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if(et1==null){
						et1.setText("");
					}
					else
					{
						firstVal =Float.parseFloat(et1.getText()+"");
						Addition=true;
						et1.setText(null);
					}
					
				}
			});
            bsub.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					firstVal =Float.parseFloat(et1.getText()+"");
					Subtraction=true;
					et1.setText(null);
				}
			});
            bmul.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					firstVal =Float.parseFloat(et1.getText()+"");
					Multiplication=true;
					et1.setText(null);
				}
			});
            bdiv.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					firstVal =Float.parseFloat(et1.getText()+"");
					Division=true;
					et1.setText(null);
				}
			});
            bequal.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					secVal=Float.parseFloat(et1.getText()+"");
					
					if(Addition==true){
						et1.setText(firstVal+ secVal +"");
						
						Addition= false;
					}
					
					if(Subtraction==true){
						et1.setText(firstVal- secVal +"");
						
						Subtraction= false;
					}
					if(Multiplication==true){
						et1.setText(firstVal*secVal +"");
						
						Multiplication= false;
					}
					if(Division==true){
						et1.setText(firstVal/secVal +"");
						
						Division= false;
					}
				}
			});
            
            bclear.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					et1.setText("");
					
				}
			});
            
            b10.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					et1.setText(et1.getText()+".");
					
				}
			});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
