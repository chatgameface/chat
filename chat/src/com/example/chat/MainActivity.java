package com.example.chat;

import java.util.ArrayList;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	String theme[] = { "theme1","theme2","theme3","theme4"}; //카테고리 목록

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		list_method();
	}
	void list_method() {
		ListView listView;
		listView = (ListView) findViewById(R.id.main_listView);

		ArrayList list = new ArrayList(); //list
		for (int i = 0; i < theme.length; i++) {
			list.add(theme[i]);
		}

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(mItemClickListener);

	}
	//list item 클릭시 title_list_activity 호출
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long l_position) {
			Intent intent = new Intent(MainActivity.this, title_list_activity.class);
			
			startActivity(intent);

		}
	};


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}









