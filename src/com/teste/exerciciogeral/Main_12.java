package com.teste.exerciciogeral;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_12 extends Activity {
	
	EditText cargo, salario;
	Button btncalcular, btnVoltar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_12);
		
		cargo = (EditText) findViewById(R.id.cargo);
		salario = (EditText) findViewById(R.id.salario);
		btncalcular = (Button) findViewById(R.id.btnCalcular);
		btnVoltar = (Button) findViewById(R.id.btnVoltar);
		
		btnVoltar.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent ExercicioGeral = new
								Intent (Main_12.this,Main_1.class);
						Main_12.this.startActivity(ExercicioGeral);
						Main_12.this.finish();
						
					}
				});
	}
 
	public void calcular(View v){
		double car = Double.parseDouble(cargo.getText().toString());
		double sal = Double.parseDouble(salario.getText().toString());
		double res;
		
		if(car == 101){			
			res = sal * 1.1;
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_12.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("PARABÉNS GERENTE !!!" + "\nSalário Antigo: " + sal +"\nNovo Salário: " + res + "\nAumento do salário: " + (res - sal));
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
			
		}
		
		else if(car == 102){			
			res= sal * 1.2;
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_12.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("PARABÉNS ENGENHEIRO !!!" + "\nSalário Antigo: " + sal +"\nNovo Salário: " + res + "\nAumento do salário: " + (res - sal));
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
		else if(car == 103){			
			res= sal * 1.3;
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_12.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("PARABÉNS TÉCNICO!!!" + "\nSalário Antigo: " + sal +"\nNovo Salário: " + res + "\nAumento do salário: " + (res - sal));
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
		else{
			res = sal * 1.4;
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_12.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("PARABÉNS !!!" + "\nSalário Antigo: " + sal +"\nNovo Salário: " + res + "\nAumento do salário: " + (res - sal));
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
	
	}
	
}
