package com.example.chat;


import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class chatting_activity extends Activity {
	
	ArrayAdapter<String> adapter;
	ArrayList<String> list;
	EditText edit;
	ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chatting);
		edit = (EditText) findViewById(R.id.chatting_editText);
		
		listView = (ListView) findViewById(R.id.chatting_listView);
		list = new ArrayList();
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
		listView.setAdapter(adapter);
	}
	
	public void onButton(View v){
		switch(v.getId()){
		case R.id.chatting_button:
			Toast.makeText(this, "채팅 입력", Toast.LENGTH_SHORT).show();
			
			
			String chat = edit.getText().toString();
			list.add(chat);//editText문자열을 list에 추가한다.
		
			
		
			adapter.notifyDataSetChanged();
			edit.setText("");
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









