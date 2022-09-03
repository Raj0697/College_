package com.example.techwoods_new;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View.OnClickListener;

public class Register extends Activity implements OnClickListener, OnItemClickListener {
	String[] code = {"TW01","TW02","TW03","TW04","TW05","TWO6","TW07","TW08","TW09","TW10"   };
	String[] events = {"DEBUGGING","POT-POURI","SQL-QUERY","PRESENTATION","QUIZ","MEME-CREATION","FACIAL_PAINTING","WEB_DESIGNING"  };
	ListView lv;
	Button b;
	EditText name,id,clg,mob,cou;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		lv = (ListView)findViewById(R.id.listView1);
		b = (Button)findViewById(R.id.button1);
		name = (EditText)findViewById(R.id.editText1);
		id = (EditText)findViewById(R.id.editText2);
		clg = (EditText)findViewById(R.id.editText3);
		//clg.setEnabled(false);
		//clg.setKeyListener(null);
		mob = (EditText)findViewById(R.id.editText4);
		cou = (EditText)findViewById(R.id.editText5);
		
		b.setOnClickListener(this);
		lv.setOnItemClickListener(this);
		ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,events);
		lv.setAdapter(aa);
		
		String c = getIntent().getStringExtra("colg");
		clg.setText(""+c);
		String s = getIntent().getStringExtra("cour");
		cou.setText(""+s);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
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
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.button1)
		{
			if(name.getText().toString().trim().length() == 0)
			{
				Toast.makeText(this, "name is mandatory", Toast.LENGTH_SHORT).show();
			}
			else if(id.getText().toString().trim().isEmpty())
			{
				Toast.makeText(this, "Id is mandatory", Toast.LENGTH_SHORT).show();
			}
			else if(mob.getText().toString().trim().isEmpty())
			{
				Toast.makeText(this, "Mobile number is mandatory", Toast.LENGTH_SHORT).show();
			}
			else
			{
				String mobile = mob.getText().toString();
				Toast.makeText(this, "Your registered code is : " + code[0], Toast.LENGTH_SHORT).show();
				Intent i = new Intent(this,Successful_reg.class);
				i.putExtra("mobi", mobile);
				startActivity(i);
			}
			
		}
		
		
	}

	@Override
	public void onItemClick(AdapterView<?> aa, View v, int p, long id) {
		// TODO Auto-generated method stub
		String s = (String)lv.getItemAtPosition(p);
		Toast.makeText(this, "You have selected" + s ,  Toast.LENGTH_LONG).show();
		
	}
}
