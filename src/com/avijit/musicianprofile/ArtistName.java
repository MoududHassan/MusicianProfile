package com.avijit.musicianprofile;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ArtistName extends Activity {

	TextView emailofmusician, musiciantype;
	EditText artistname;
	Button confirm_artistName;
	Spinner artistName_spinner;
	ArrayAdapter<String> artistNameAdapter;
	String retrievevalue;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.artist_name);

		artistname = (EditText) findViewById(R.id.artistName_field);
		emailofmusician = (TextView) findViewById(R.id.emailaddress);
		musiciantype = (TextView) findViewById(R.id.musitiantype_artistName);
		confirm_artistName = (Button) findViewById(R.id.artistName_confirm);
		artistName_spinner = (Spinner) findViewById(R.id.artistName_spinner);
		
		//For retrieve bundle data
		String newString;
		if (savedInstanceState == null) {
		    Bundle extras = getIntent().getExtras();
		    if(extras == null) {
		        newString= null;
		    } else {
		        newString= extras.getString("musitiantype");
		    }
		} else {
		    newString= (String) savedInstanceState.getSerializable("musitiantype");
		}
		
		musiciantype.setText(newString);

		String[] states = new String[2];
		states[0] = "Yes";
		states[1] = "No";

		artistNameAdapter = new ArrayAdapter<String>(this, R.layout.spinner,
				states);
		artistNameAdapter.setDropDownViewResource(R.layout.spinner);
		artistName_spinner.setAdapter(artistNameAdapter);

		// For Artist name confirm:
		confirm_artistName.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				String selected_credential = artistName_spinner
						.getSelectedItem().toString();
				Toast toast = Toast.makeText(getApplicationContext(),
						selected_credential, Toast.LENGTH_SHORT);
				toast.show();
				/*Intent intent = new Intent(getApplicationContext(),
						Performances.class);
				intent.putExtra("musitiantype", selected_credential);
				startActivity(intent);*/
			}
		});
	}

}
