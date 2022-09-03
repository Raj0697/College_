package com.example.techwoods_new;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Potpouri extends Activity {
	TextView t,t4,t5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_potpouri);
		t = (TextView)findViewById(R.id.textView3);
		t4 = (TextView)findViewById(R.id.textView4);
		t5 = (TextView)findViewById(R.id.textView5);
		t.setText("1. One team per college." +
				"2.	Registration is mandatory(through app)." +
				"3.	Usage of mobile phones during event will be rejected." +
				"4.	Students should maintain discipline." +
				"5.	Event consists of two rounds." +
				"6.	Top 3 teams will qualify for finals." +
				"7.	Finals will be onstage event.");
		t4.setText("Event Co-ordinator : RAJKUMAR " );
		t5.setText("Contact-No : 9876543210");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.potpouri, menu);
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
