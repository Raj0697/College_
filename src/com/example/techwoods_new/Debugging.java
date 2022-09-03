package com.example.techwoods_new;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;

public class Debugging extends Activity {
	TextView t,t2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_debugging);
		t = (TextView)findViewById(R.id.textView3);
		t2 = (TextView)findViewById(R.id.textView4);
		t.setText("1.	One team per college." +
				"2.	Registration is mandatory(through app)." +
				"3.	Usage of mobile phones during event will be rejected." +
				"4.	Students should maintain discipline." +
				"5.	Topics will be given at the spot." +
				"6.	Event consist of two rounds " +
				"7. preliminary and final round." +
				"8.	c,java,python (Any language can be used by your choice)." );
		t2.setText(	" Event Coordinator : Karthick ." +
				" Contact_No : 887123456. ");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.debugging, menu);
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
