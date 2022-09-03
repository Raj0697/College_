package com.example.techwoods_new;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Mca extends ActionBarActivity {
	TextView t1,t2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mca);
		t1 = (TextView)findViewById(R.id.textView1);
		t2 = (TextView)findViewById(R.id.textView2);
		t1.setBackgroundColor(Color.BLACK);
		t1.setTextColor(Color.WHITE);
		t1.setText("MASTER OF COMPUTER APPLICATIONS ");
		
		t2.setBackgroundColor(Color.WHITE);
		t2.setTextColor(Color.BLACK);
		t2.setText("MCA was established in the year 1995.It was the first self-financed course in mcc and it offers various campus placements to the students !!!");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mca, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		
		return super.onOptionsItemSelected(item);
	}
}
