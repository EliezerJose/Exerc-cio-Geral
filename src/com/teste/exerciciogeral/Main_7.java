package com.teste.exerciciogeral;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_7 extends Activity {

	EditText num;
	Button btncalcular, btnVoltar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_7);
		
		num = (EditText) findViewById(R.id.num);
		btncalcular = (Button) findViewById(R.id.btnCalcular);
		btnVoltar = (Button) findViewById(R.id.btnVoltar);
		
		btnVoltar.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent ExercicioGeral = new
								Intent (Main_7.this,Main_1.class);
						Main_7.this.startActivity(ExercicioGeral);
						Main_7.this.finish();
						
					}
				});
	}
	public void calcular(View v){
		
		double numero = Double.parseDouble(num.getText().toString());
		double res;
		
		for(int i=0; i<=10; i++){
			
			res = numero * i;
			
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_7.this);
			dialogo.setTitle("Resultado do Cálculo");
			dialogo.setMessage( " " + numero + " X " + i + " = " + res);
			dialogo.setNeutralButton("OK", null);
			dialogo.show();	
		}
		
	}
	
}
