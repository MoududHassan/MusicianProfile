package com.avijit.musicianprofile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Usertype extends Activity{

	Button confirm_credential;
	Spinner credential_spinner;
	ArrayAdapter<String> credentialAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.usertype);
		
		confirm_credential = (Button) findViewById(R.id.credential_confirm);
		credential_spinner = (Spinner) findViewById(R.id.credential_spinner);
		
		String[] states = new String[2];
		states[0] = "Fan";
		states[1] = "Musician";
		
		credentialAdapter = new ArrayAdapter<String>(this,
				R.layout.spinner, states);
		credentialAdapter.setDropDownViewResource(R.layout.spinner);
		credential_spinner.setAdapter(credentialAdapter);

		//For credential confirm:
		confirm_credential.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						String selected_credential = credential_spinner.getSelectedItem().toString();
						Toast toast = Toast.makeText(getApplicationContext(), selected_credential, Toast.LENGTH_SHORT);
						 toast.show();
						
						 if(selected_credential == "Fan"){
							 Intent intent = new Intent(getApplicationContext(),
										Performances.class);
								startActivity(intent);
						 }else{
							 Intent intent = new Intent(getApplicationContext(),
									 Musician_type.class);
								startActivity(intent);
						 }
					}
				});
		
	}

	
	
}
