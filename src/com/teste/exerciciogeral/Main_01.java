package com.teste.exerciciogeral;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_01 extends Activity {
	
	EditText saldo;
	Button btnsomar, btnVoltar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_1);
		
		saldo = (EditText) findViewById(R.id.saldo);
		btnsomar = (Button) findViewById(R.id.btnCalcular);
		btnVoltar = (Button) findViewById(R.id.btnVoltar);
		
btnVoltar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent ExercicioGeral = new
						Intent (Main_01.this,Main_1.class);
				Main_01.this.startActivity(ExercicioGeral);
				Main_01.this.finish();
				
			}
		});
	}

	public void calcular(View v){
		
		double numero1 = Double.parseDouble(saldo.getText().toString());
		double res;
		
		if(numero1>=0 && numero1<=200){
			res = 0;
		}
		
		else if(numero1>=201 && numero1<=400){
			res = numero1 * 0.2;
		}
		
		else if(numero1>=401 && numero1<=600){
			res = numero1 * 0.3;
		}
		else{
			res = numero1*0.4;
		}
		
		
		AlertDialog.Builder dialogo = new AlertDialog.Builder(
				Main_01.this);
		dialogo.setTitle("Aviso");
		dialogo.setMessage("Saldo: " + numero1 + "\nCredito: " + res);
		dialogo.setNeutralButton("OK", null);
		dialogo.show();
	}
}
