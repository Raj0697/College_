package com.example.techwoods_new;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;
import android.content.*;

public class Events extends ActionBarActivity implements OnItemClickListener {
	ListView lv;
	String[] events = {"DEBUGGING","POT-POURI","SQL-QUERY","PRESENTATION","QUIZ","MEME-CREATION","FACIAL_PAINTING","WEB_DESIGNING"  };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_events);
		lv = (ListView)findViewById(R.id.listView1);
		lv.setOnItemClickListener(this);
		ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,events);
		lv.setAdapter(aa);
		Toast.makeText(this, "select the event to know about the rules", Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.events, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onItemClick(AdapterView<?> aa, View v, int p, long id) {
		// TODO Auto-generated method stub
		String s = (String)lv.getItemAtPosition(p);
		Toast.makeText(this, "You have selected " + s , Toast.LENGTH_SHORT).show();
		
		switch(p)
		{
		case 0:
			Intent i = new Intent(this,Debugging.class);
			startActivity(i);
			break;
		case 1:
			Intent i2 = new Intent(this,Potpouri.class);
			startActivity(i2);
			break;
		case 2:
			Intent i3 = new Intent(this,Sql.class);
			startActivity(i3);
			break;
		case 3:
			Intent i4 = new Intent(this,Presentation.class);
			startActivity(i4);
			break;
		case 4:
			Intent i5 = new Intent(this,Quiz.class);
			startActivity(i5);
			break;
		case 5:
			Intent i6 = new Intent(this,Meme.class);
			startActivity(i6);
			break;
		case 6:
			Intent i7 = new Intent(this,Facepainting.class);
			startActivity(i7);
			break;
		case 7:
			Intent i8 = new Intent(this,Webdesign.class);
			startActivity(i8);
			break;
		}
	}
}
