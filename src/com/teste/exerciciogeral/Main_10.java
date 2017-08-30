package com.teste.exerciciogeral;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_10 extends Activity {

	EditText num1, num2, valori;
	Button btncalcular, btnVoltar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_10);
		
		num1 = (EditText) findViewById(R.id.num1);
		num2 = (EditText) findViewById(R.id.num2);
		valori = (EditText) findViewById(R.id.val);
		btncalcular = (Button) findViewById(R.id.btnCalcular);
		btnVoltar = (Button) findViewById(R.id.btnVoltar);
		
		btnVoltar.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent ExercicioGeral = new
								Intent (Main_10.this,Main_1.class);
						Main_10.this.startActivity(ExercicioGeral);
						Main_10.this.finish();
						
					}
				});
	}

		public void calcular(View v){
			double n1 = Double.parseDouble(num1.getText().toString());
			double n2 = Double.parseDouble(num2.getText().toString());
			double valor = Double.parseDouble(valori.getText().toString());
			double res;
			
			if(valor == 0){
				res = n1+n2;
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_10.this);
				dialogo.setTitle("Aviso");
				dialogo.setMessage("Resultado: " + res);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}
			else if(valor == 1){
				res = n1-n2;
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_10.this);
				dialogo.setTitle("Aviso");
				dialogo.setMessage("Resultado: " + res);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}
			else if(valor == 2){
				res = n1*n2;
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_10.this);
				dialogo.setTitle("Aviso");
				dialogo.setMessage("Resultado: " + res);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}
			else if(valor == 3){
				res = n1/n2;
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_10.this);
				dialogo.setTitle("Aviso");
				dialogo.setMessage("Resultado: " + res);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();}
			else if(valor == 4){
				res = (n1+n2)/2;
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_10.this);
				dialogo.setTitle("Aviso");
				dialogo.setMessage("Resultado: " + res);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}
			else{
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_10.this);
				dialogo.setTitle("Aviso");
				dialogo.setMessage("Número de avaliação errado. Programa encerrado sem cálculos !!!");
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}
			
		}
		
		}
