package com.avijit.musicianprofile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends Activity{

	Button submit;
	EditText email, password, conPassword;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		submit = (Button) findViewById(R.id.buttonRegSubmit);
		email = (EditText) findViewById(R.id.editTextEmail);
		password = (EditText) findViewById(R.id.editTextPassword);
		conPassword = (EditText) findViewById(R.id.editTextconPassword);
		
		//For register first page confirm:
		submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						Credential.class);
				startActivity(intent);
			}
		});
		
	}
	
	

}
