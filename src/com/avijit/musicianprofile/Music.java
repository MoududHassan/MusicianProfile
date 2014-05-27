package com.avijit.musicianprofile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Music extends Activity {

	Button fan_page;
	Button performance;
	Button music;
	Button broadcast;
	TextView fan_count;
	TextView req_count;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.musician);
		fan_count = (TextView) findViewById(R.id.fan_count);
		req_count = (TextView) findViewById(R.id.request_count);
		fan_page = (Button) findViewById(R.id.fan_page);
		performance = (Button) findViewById(R.id.performance);
		music = (Button) findViewById(R.id.music);
		broadcast = (Button) findViewById(R.id.broadcast);
		
		//For Fan Page:
		fan_page.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//To set performance:
		performance.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						Performances.class);
				startActivity(intent);
			}
		});
		
		//To show music list:
		music.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
				
		//To broadcast:
		broadcast.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

}
