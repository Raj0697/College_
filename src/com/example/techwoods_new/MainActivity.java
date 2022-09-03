package com.example.techwoods_new;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {
	private static int SPLASH_TIME_OUT = 2000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		new Handler().postDelayed(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent home = new Intent(MainActivity.this,Mcc.class);
				startActivity(home);
				finish();
			}
			
		}, SPLASH_TIME_OUT);
		//Intent in = new Intent(this,Mcc.class);
		//startActivity(in);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		
		
		if(id == R.id.signin)
		{
			Intent i = new Intent(this,Signin.class);
			startActivity(i);
		}
		if(id == R.id.mcc)
		{
			Intent i = new Intent(this,Mcc.class);
			startActivity(i);
		}
		if(id == R.id.mca)
		{
			Intent i = new Intent(this,Mca.class);
			startActivity(i);
		}
		if(id == R.id.tw)
		{
			Intent i = new Intent(this,Techwoods.class);
			startActivity(i);
		}
		if(id == R.id.Events)
		{
			Intent i = new Intent(this,Events.class);
			startActivity(i);
		}
		if(id == R.id.contact)
		{
			Intent i = new Intent(this,Contact.class);
			startActivity(i);
		}
		if(id == R.id.developer)
		{
			Intent i = new Intent(this,Developer.class);
			startActivity(i);
		}
		return super.onOptionsItemSelected(item);
	}
	
}
