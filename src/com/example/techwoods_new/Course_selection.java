package com.example.techwoods_new;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;
import android.text.*;

public class Course_selection extends Activity implements OnItemClickListener {
	ListView lv;
	EditText e;
	String[] course = {"MCA","MSC CS","MSC DATA SCIENCE","B.TECH CS"   };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course_selection);
		
		lv = (ListView)findViewById(R.id.listView1);
		e = (EditText)findViewById(R.id.editText1);
		lv.setOnItemClickListener(this);
		final ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,course);
		lv.setAdapter(aa);
		
		
		//clg.setText(""+c);
		
		e.addTextChangedListener(new TextWatcher(){

			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence c, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				aa.getFilter().filter(c);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.course_selection, menu);
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
		String st = (String)lv.getItemAtPosition(p);
		Toast.makeText(this, "You have selected " + st, Toast.LENGTH_SHORT).show();
		String c = getIntent().getStringExtra("col");
		if(p==0 || p==1 || p==2 || p==3 || p==4 || p==5)
		{
			Intent i = new Intent(this,Register.class);
			i.putExtra("cour", st);
			i.putExtra("colg", c);
			startActivity(i);
		}
	}
}
