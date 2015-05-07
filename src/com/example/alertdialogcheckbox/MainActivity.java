package com.example.alertdialogcheckbox;

import com.example.alertdialog_radiobutton.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button alert;
	String[] toppings = { "Onion", "Lettuce", "Tomato" };
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		alert = (Button) findViewById(R.id.button1);

		alert.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);	
				dialog.setTitle("Choose Your Toppings");
				// dialog.setSingleChoiceItems(items, checkedItem, listener)
				//dialog.setSingleChoiceItems(level, -1,new DialogInterface.OnClickListener()
				dialog.setMultiChoiceItems(toppings, null,new OnMultiChoiceClickListener() 
				{
					
					@Override
					public void onClick(DialogInterface dialog, int which, boolean isChecked) 
					{
						// TODO Auto-generated method stub
						if (isChecked)
						{
							//Action To be performed for items checked
						}
						
						else 
						{
							
						}
					}
				});
				dialog.setPositiveButton("OK",new DialogInterface.OnClickListener() 
						
				{

							@Override
							public void onClick(DialogInterface dialog,
									int which)
							{
								// TODO Auto-generated method stub

							}
						});
				dialog.setNegativeButton("Cancel",new DialogInterface.OnClickListener() 
				{
	
					@Override
					public void onClick(DialogInterface dialog, int which) 
					{
						// TODO Auto-generated method stub
		
					}
				});
				dialog.create();
				dialog.show();

			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
