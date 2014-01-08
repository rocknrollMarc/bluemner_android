package com.bluemner.hotelbroker;



import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Info extends BluemnerSplash {
	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	
	RelativeLayout RlInfo;
	ScrollView scrollinfo;
	LinearLayout linearinfo;
	TextView weroderwas;
	TextView jocheninfo;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info);
        initUIElements();     
	}
	
	private void initUIElements(){
		RlInfo = (RelativeLayout) findViewById(R.id.RlInfo);
		
		scrollinfo = (ScrollView) findViewById(R.id.scrollinfo);
		
		linearinfo = (LinearLayout) findViewById(R.id.linearinfo);
		
		weroderwas = (TextView) findViewById(R.id.weroderwas);
		
		jocheninfo = (TextView) findViewById(R.id.jocheninfo);
		
	}
}
