package com.example.chat;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class nickname_activity extends Activity {
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nickname);
		
	}
	
	public void onButton(View v){
		switch(v.getId()){
		case R.id.nicname_button:
			Toast.makeText(this, "닉네임등록", Toast.LENGTH_SHORT).show();
			Intent intent=new Intent(this,chatting_activity.class);
			startActivity(intent);
		
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









