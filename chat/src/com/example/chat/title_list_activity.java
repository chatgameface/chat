package com.example.chat;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;



public class title_list_activity extends Activity {
	
	String title[] = {"title1","title2","title3","title4"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.title_list);
		list_method();
	}
	void list_method() {
		ListView listView;
		listView = (ListView) findViewById(R.id.title_listView);

		ArrayList<String> list = new ArrayList();
		for (int i = 0; i < title.length; i++) {
			list.add(title[i]);
		}

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(mItemClickListener);

	}
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long l_position) {
			Intent intent = new Intent(title_list_activity.this, nickname_activity.class);
			
			startActivity(intent);

		}
	};

	public void onButton(View v){
		switch(v.getId()){
		case R.id.chatting_button:
			Toast.makeText(this, "검색", Toast.LENGTH_SHORT).show(); //토스트
		
			break; 
		case R.id.room_button:
			Intent intent=new Intent(this,chatting_form_activity.class); // 방만들기 버튼 클릭시 form 액티비티 호출
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









