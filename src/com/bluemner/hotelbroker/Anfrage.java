package com.bluemner.hotelbroker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

public class Anfrage extends BluemnerSplash  {
	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	
	RelativeLayout RlAnfrage;
	ScrollView SvAnfrage;
	LinearLayout LlAnfrage;
	TextView TvKaufenVerkaufen;
	Spinner SpKaufenVerkaufen;
	EditText EtZimmer;
	RadioGroup RgBetreiber;
	RadioButton RbMit;
	RadioButton RbOhne;
	RatingBar RbSterne;
	Spinner SpLand;
	EditText EtStadt;
	Spinner SpLage;
	EditText EtName;
	EditText EtTel;
	EditText EtEmail;
	EditText EtZusatz;
	Button BtSend;
	
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anfrage);
        
		initUIElements();     
	}
	
	private void initUIElements(){
		RlAnfrage = (RelativeLayout) findViewById(R.id.Rlanfrage);
		
		SvAnfrage = (ScrollView) findViewById(R.id.SvAnfrage);
		
		LlAnfrage = (LinearLayout) findViewById(R.id.LlAnfrage);
		
		TvKaufenVerkaufen = (TextView) findViewById(R.id.TvKaufenVerkaufen);
		
	    SpKaufenVerkaufen = (Spinner) findViewById(R.id.SpKaufenVerkaufen);
	   
		
		EtZimmer = (EditText) findViewById(R.id.EtZimmer);
		
		RgBetreiber = (RadioGroup) findViewById(R.id.RgBetreiber);
		
		RbMit = (RadioButton) findViewById(R.id.RbMit);
		
		RbOhne = (RadioButton) findViewById(R.id.RbOhne);
		
		RbSterne = (RatingBar) findViewById(R.id.RbSterne);
		
		SpLand = (Spinner) findViewById(R.id.SpLand);
		SpLand.setOnItemSelectedListener(null);
		
		
		EtStadt = (EditText) findViewById(R.id.EtStadt);
		
		SpLage = (Spinner) findViewById(R.id.SpLage);
		
		EtName = (EditText) findViewById(R.id.EtName);
		
		EtTel = (EditText) findViewById(R.id.EtTel);
		
		EtEmail = (EditText) findViewById(R.id.EtEmail);
		
		EtZusatz = (EditText) findViewById(R.id.EtZusatz);
		
		BtSend = (Button) findViewById(R.id.BtSend);
	
		
		
	}
	
	String Land1 = SpLand.getSelectedItem().toString();
	//String Lage = SpLage.getSelectedItem().toString();
	//String KaufenVerkaufen = SpKaufenVerkaufen.getSelectedItem().toString(); 
	//String Stadt = EtStadt.getText().toString();
	//String Zimmer = EtZimmer.getText().toString();
	//int Betreiber = RgBetreiber.getCheckedRadioButtonId();
	//String Name = EtName.getText().toString();
	//String Tel = EtTel.getText().toString();
	//String Email = EtEmail.getText().toString();
	//String Zusatz = EtZusatz.getText().toString();
	//float Sterne = RbSterne.getRating();
	
	private void email(View view){
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.setType("plain/text");  
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"marc.bluemner@googlemail.com"});  
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Hotel App");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,Land1);
		
		//"Hallo Mein über alles geliebter Papi der Herr"
		//+Name+"möchte ein Hotel" +KaufenVerkaufen +Betreiber+" Betreiber" +Zimmer+"Zimmern"+Sterne 
			//+"Sterne Seine Telefonnummer ist"+Tel+"seine Email"+Email+"Das Hotel möchte er in"+Land1
			//+"haben und zwar in"+Stadt+"Er hat noch die folgenden Sonderwünsche"+Zusatz
			//+"Ich hoffe so sehr das du bei diesem Geschäft Erfolg haben wirst ich liebe dich " +
			//"Papi dein Sohn Marci");
		startActivity(Intent.createChooser(emailIntent, "Send mail..."));
	}
	
	
}
