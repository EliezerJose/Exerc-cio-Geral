package com.teste.exerciciogeral;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_6 extends Activity {
	
	EditText gasolina, Km;
	Button btncalcular, btnVoltar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_6);
		
		gasolina = (EditText) findViewById(R.id.gasolina);
		Km = (EditText) findViewById(R.id.Km);
		btncalcular = (Button) findViewById(R.id.btnCalcular);
		btnVoltar = (Button) findViewById(R.id.btnVoltar);
		
		btnVoltar.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent ExercicioGeral = new
								Intent (Main_6.this,Main_1.class);
						Main_6.this.startActivity(ExercicioGeral);
						Main_6.this.finish();
						
					}
				});
	}

		public void calcular(View v){
			
			double Quilometros = Double.parseDouble(Km.getText().toString());
			double Litros = Double.parseDouble(gasolina.getText().toString());
			double res;
			
			res= Quilometros / Litros;
			
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_6.this);
			dialogo.setTitle("Quantidade de combustível gasto por KM");
			dialogo.setMessage("Total:" + res);
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
			
		}
	
}
