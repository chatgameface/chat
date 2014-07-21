package com.example.chat;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class chatting_form_activity extends Activity {
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chatting_form);
		
	}
	public void onButton(View v){
		switch(v.getId()){
		case R.id.button:
			Toast.makeText(this, "µî·Ï", Toast.LENGTH_SHORT).show();
		
			break; 
	}
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}









