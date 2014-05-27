package com.avijit.musicianprofile;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.SimpleAdapter.ViewBinder;
import android.widget.Toast;
import android.widget.ToggleButton;


public class Performances extends ListActivity {

	Button add_performance;
	ListView lv;
	ListAdapter adapter;
	ArrayList<HashMap<String, String>> listItems;
	private static final String performance_venue = "venue";
	private static final String performance_toggle = "toggle";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.performances);
		add_performance = (Button) findViewById(R.id.add_performance);
		
		//To add performance:
		add_performance.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						Add_date.class);
				startActivity(intent);
			}
		});
		final String[] str = new String[] {performance_venue,performance_toggle};
		final int[] place = new int[] { R.id.venue_text, R.id.toggle};
		listItems = new ArrayList<HashMap<String, String>>();
		for (int i = 0; i <= 3; i++)
		{			
		HashMap<String, String> map = new HashMap<String, String>();		
		String venue = "venue"+i;
		map.put("venue",venue);
		map.put("toggle", venue);
		listItems.add(map);
		}
		adapter = new SimpleAdapter(Performances.this,
				listItems, R.layout.list_item, str, place);
		((SimpleAdapter) adapter).setViewBinder(new MyBinder());
		setListAdapter(adapter);
		
		
	}
	
	class MyBinder implements ViewBinder {

		public boolean setViewValue(final View view, final Object data,
				String textRepresentation) {
			
			if (view.getId() == R.id.venue_text) {
				TextView textView = (TextView) view;
				String stringval = (String) data;
				textView.setText(stringval);
				return true;
			}

			if (view.getId() == R.id.toggle) {
				final ToggleButton on_off = (ToggleButton) view;
				final String stringval = (String) data;
				on_off.setOnClickListener(new View.OnClickListener() {

					public void onClick(View arg0) {
//							RelativeLayout parent = (RelativeLayout) arg0
//									.getParent();
//							TextView venue_text = (TextView) parent
//									.findViewById(R.id.venue_text);
//							String shareFact = "abc";
						if(on_off.isChecked()){
							Log.d("TogggggggggggggleButton", stringval);		
							
							Toast toast = Toast.makeText(getApplicationContext(), stringval, Toast.LENGTH_SHORT);
							 toast.show();
						}
							
							 
					}
				});
				return true;
			}
			return false;
	}
		
	}


}
