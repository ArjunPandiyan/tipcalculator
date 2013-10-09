package com.codepath.tipcaculator;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText billAmount;
	EditText TipIncluded;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		billAmount = (EditText) findViewById(R.id.txBillAmount);
		TipIncluded = (EditText) findViewById(R.id.txResult);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void tenPercentTip(View v){
		setBillWithTip(Integer.parseInt(billAmount.getText().toString()),10);
	}
	
	public void fifteenPercentTip(View v){
		setBillWithTip(Integer.parseInt(billAmount.getText().toString()),15);
	}

	public void twentyPercentTip(View v){
		setBillWithTip(Integer.parseInt(billAmount.getText().toString()),20);
	}
	
	public void setBillWithTip(int _billAmount, int _percent){
		int result=0;
		if(_billAmount==0){
			//Result Field is set to 0
			TipIncluded.setText("0");
		}
		else {
			result = _billAmount + (_billAmount * _percent/100);
			TipIncluded.setText(String.valueOf(result));
		}
	}
}


