package com.avijit.musicianprofile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class Add_date extends Activity {

	Button confirm_date;
	DatePicker datePicker;
	private int year;
	private int month;
	private int day;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_date);
		confirm_date = (Button) findViewById(R.id.date_confirm);
		datePicker = (DatePicker) findViewById(R.id.date_picker);
		//For date confirm:
		confirm_date.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//final Calendar c = datePicker.getDayOfMonth();
				year = datePicker.getYear();
				month = datePicker.getMonth();
				day = datePicker.getDayOfMonth();
				
				Log.d("", month + 1+"-"+day+"-"+year);
				Toast toast = Toast.makeText(getApplicationContext(), month + 1+"-"+day+"-"+year, Toast.LENGTH_SHORT);
				 toast.show();
				Intent intent = new Intent(getApplicationContext(),
						Add_state.class);
				startActivity(intent);
			}
		});
	}
	
}
