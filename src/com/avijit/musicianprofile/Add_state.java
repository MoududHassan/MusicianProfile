package com.avijit.musicianprofile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Add_state extends Activity {

	Button confirm_date;
	Spinner state_spinner;
	ArrayAdapter<String> stateAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_state);
		confirm_date = (Button) findViewById(R.id.date_confirm);
		state_spinner = (Spinner) findViewById(R.id.state_spinner);
		
		String[] states = new String[3];
		states[0] = "Delhi";
		states[1] = "Mumbai";
		states[2] = "West Bengal";


		    
		stateAdapter = new ArrayAdapter<String>(this,
				R.layout.spinner, states);
		stateAdapter.setDropDownViewResource(R.layout.spinner);
		state_spinner.setAdapter(stateAdapter);
		
		//For date confirm:
		confirm_date.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String selected_state = state_spinner.getSelectedItem().toString();
				Toast toast = Toast.makeText(getApplicationContext(), selected_state, Toast.LENGTH_SHORT);
				 toast.show();
				 Intent intent = new Intent(getApplicationContext(),
							Add_city.class);
					startActivity(intent);
			}
		});
	}
	
}
