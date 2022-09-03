package com.example.techwoods_new;

import android.app.Activity;
//import android.app.PendingIntent;
//import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Successful_reg extends Activity {
	TextView t1,t2,t3;
	String[] code = {"TW01","TW02","TW03","TW04","TW05","TW06","TW07","TW08","TW09","TW10"   };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		try
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_successful_reg);
			//Intent i = new Intent(getApplicationContext(),Successful_reg.class);
			String s = getIntent().getStringExtra("mobi");
		//	PendingIntent pi = PendingIntent.getActivity(getApplicationContext(), 0, i, 0);
			
			SmsManager sms = SmsManager.getDefault();
			SmsManager sms2 = SmsManager.getDefault();
			
			sms.sendTextMessage(s, null, "Your registered code is : " + code[1], null, null);
			sms2.sendTextMessage(s, null, "ThankYou for registering to the techwoods 2020", null, null);
			
			t1 = (TextView)findViewById(R.id.textView1);
			t2 = (TextView)findViewById(R.id.textView2);
			t3 = (TextView)findViewById(R.id.textView3);
			//for(int i=0; i<code.length; i++)
			//{
				t1.setText("You have successfully registered and your registered code is : " +code[2] );
			//}
			Toast.makeText(this, "msg sent sucess", Toast.LENGTH_SHORT).show();
			t2.setText("This code will be sent to your registered mobile number ");
			t3.setText("Please show this code at the time of verification " + " Any duplicate entries will be identified and will not be allowed inside the event!!");
		}
		catch(Exception e)
		{
			Toast.makeText(this, "msg failed", Toast.LENGTH_SHORT).show();
			Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.successful_reg, menu);
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
