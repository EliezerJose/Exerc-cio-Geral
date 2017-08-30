package com.teste.exerciciogeral;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_03 extends Activity {

	EditText cargo, salario;
	Button btncalcular, btnVoltar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_3);
		
		cargo = (EditText) findViewById(R.id.cargo);
		salario = (EditText) findViewById(R.id.salario);
		btncalcular = (Button) findViewById(R.id.btnCalcular);
		btnVoltar = (Button) findViewById(R.id.btnVoltar);
		
		btnVoltar.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent ExercicioGeral = new
								Intent (Main_03.this,Main_1.class);
						Main_03.this.startActivity(ExercicioGeral);
						Main_03.this.finish();
						
					}
				});
	}
	public void calcular(View v){
		double car = Double.parseDouble(cargo.getText().toString());
		double sal = Double.parseDouble(salario.getText().toString());
		double res;
		
		if(car == 101){			
			res = sal * 1.13;
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_03.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("PARABÉNS GERENTE !!!" + "\nSalário Antigo: " + sal +"\nNovo Salário: " + res + "\nAumento do salário: " + (res - sal));
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
			
		}
		
			else if(car == 102){			
			res= sal * 1.15;
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_03.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("PARABÉNS TÉCNICO!!!" + "\nSalário Antigo: " + sal +"\nNovo Salário: " + res + "\nAumento do salário: " + (res - sal));
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
		else{
			res = sal * 1.11;
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_03.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("PARABÉNS !!!" + "\nSalário Antigo: " + sal +"\nNovo Salário: " + res + "\nAumento do salário: " + (res - sal));
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
	
	}
	
}
