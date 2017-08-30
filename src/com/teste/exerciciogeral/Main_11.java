package com.teste.exerciciogeral;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_11 extends Activity {
	
	EditText codigo, peso;
	Button btncalcular, btnVoltar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_11);
		
		codigo = (EditText) findViewById(R.id.codigo);
		peso = (EditText) findViewById(R.id.peso);
		btncalcular = (Button) findViewById(R.id.btnCalcular);
		btnVoltar = (Button) findViewById(R.id.btnVoltar);
		
		btnVoltar.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent ExercicioGeral = new
								Intent (Main_11.this,Main_1.class);
						Main_11.this.startActivity(ExercicioGeral);
						Main_11.this.finish();
						
					}
				});
	}

	public void calcular(View v){
		double cod = Double.parseDouble(codigo.getText().toString());
		double pterra = Double.parseDouble(peso.getText().toString());
		double pplaneta;
		
		if(cod==1){
			pplaneta = pterra/ 10 * 0.37;
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_11.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("O seu peso no planeta Mercúrio é: " + pplaneta);
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
		if(cod==2){
			pplaneta = pterra/ 10 * 0.88;
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_11.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("O seu peso no planeta Vênus é: " + pplaneta);
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
		if(cod==3){
			pplaneta = pterra/ 10 * 0.38;
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_11.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("O seu peso no planeta Marte é: " + pplaneta);
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
		if(cod==4){
			pplaneta = pterra/ 10 * 2.64;
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_11.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("O seu peso no planeta Júpiter é: " + pplaneta);
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
		if(cod==5){
			pplaneta = pterra/ 10 * 1.15;
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_11.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("O seu peso no planeta Saturno é: " + pplaneta);
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
		if(cod==6){
			pplaneta = pterra/ 10 * 1.17;
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_11.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("O seu peso no planeta Urano é: " + pplaneta);
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
		
		
}
	
}
