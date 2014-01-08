package com.bluemner.hotelbroker;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Main extends BluemnerSplash implements OnClickListener {
	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	
	RelativeLayout RlMain;
	Button BtInfo;
	Button BtAnfrage;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		  setContentView(R.layout.main);
		  initUiElements();
	}
	
	private void initUiElements(){
		RlMain = (RelativeLayout) findViewById(R.id.RlMain);
		
		
		BtInfo = (Button) findViewById(R.id.BtInfo);
		BtInfo.setOnClickListener(this);
		
		BtAnfrage = (Button) findViewById(R.id.BtAnfrage);
		BtAnfrage.setOnClickListener(this);
		

		
	}

	@Override
	public void onClick(View v){
		switch(v.getId()){
		case R.id.BtInfo:
			startActivity(new Intent(Main.this,
					Info.class));
			break;
		case R.id.BtAnfrage:
			startActivity(new Intent(Main.this,
					Anfrage.class));
			break;
		}
			
	}
		
}
