package com.example.techwoods_new;

import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Signin extends ActionBarActivity implements OnItemClickListener,OnClickListener {
	ListView lv;
	Button b;
	EditText e;
	String[] clg = {"loyola","ethiraj","wcc","SRM University","Anna University","Stella Maris","GuruNanak","DG Vaishnava","MOP Vaishnava","Crescent University","Anna Adarsh"   };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signin);
		lv = (ListView)findViewById(R.id.listView1);
		e = (EditText)findViewById(R.id.editText1);
		lv.setOnItemClickListener(this);
		final ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,clg);
		lv.setAdapter(aa);
		b = (Button)findViewById(R.id.button1);
		b.setOnClickListener(this);
		
		e.addTextChangedListener(new TextWatcher()
		{

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
		getMenuInflater().inflate(R.menu.signin, menu);
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
	public void onItemClick(AdapterView<?> aa, View v, int position, long id) {
		// TODO Auto-generated method stub
		String s = (String)lv.getItemAtPosition(position);
		Toast.makeText(this, "You have selected " + s, Toast.LENGTH_SHORT).show();
		
		if(position==0 || position==1 || position==2 || position==3 || position==4 || position==5 || position==6 || position==7 || position==8 || position==9 || position==10)
		{
			//Intent i = new Intent(this,Register.class);
			Intent i = new Intent(this,Course_selection.class);
			i.putExtra("col", s);
			startActivity(i);
			
		}
		else
		{
			Toast.makeText(this, "Please select your college to register", Toast.LENGTH_SHORT).show();
			Toast.makeText(this, "If your college is not shown in the list, then you are not eligible to participate", Toast.LENGTH_LONG).show();
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.listView1)
		{
			Intent i2 = new Intent(this,Register.class);
			startActivity(i2);
		}
		else
		{
			Toast.makeText(this, "Please select your college to register", Toast.LENGTH_SHORT).show();
			Toast.makeText(this, "If your college is not shown in the list, then you are not eligible to participate", Toast.LENGTH_SHORT).show();
		}
	}
}
