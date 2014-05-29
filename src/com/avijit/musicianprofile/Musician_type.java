package com.avijit.musicianprofile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Musician_type extends Activity {

	TextView emailofmusician;
	Button confirm_musicianType;
	Spinner musicianType_spinner;
	ArrayAdapter<String> musicianTypeAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.musician_type);

		emailofmusician = (TextView) findViewById(R.id.emailaddress);
		confirm_musicianType = (Button) findViewById(R.id.musician_confirm);
		musicianType_spinner = (Spinner) findViewById(R.id.musician_spinner);

		String[] states = new String[5];
		states[0] = "Drummer";
		states[1] = "Bass Player";
		states[2] = "Vocalist";
		states[3] = "Keyboardist";
		states[4] = "Producer";

		musicianTypeAdapter = new ArrayAdapter<String>(this, R.layout.spinner,
				states);
		musicianTypeAdapter.setDropDownViewResource(R.layout.spinner);
		musicianType_spinner.setAdapter(musicianTypeAdapter);

		// For Musician type confirm:
		confirm_musicianType.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				String selected_credential = musicianType_spinner
						.getSelectedItem().toString();
				Toast toast = Toast.makeText(getApplicationContext(),
						selected_credential, Toast.LENGTH_SHORT);
				toast.show();
				Intent intent = new Intent(getApplicationContext(),
						ArtistName.class);
				intent.putExtra("musitiantype", selected_credential);
				startActivity(intent);
			}
		});
	}

}
