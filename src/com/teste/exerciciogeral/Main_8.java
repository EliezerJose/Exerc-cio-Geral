package com.teste.exerciciogeral;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_8 extends Activity {

	EditText sal, salmin;
	Button btncalcular, btnVoltar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_8);
		
		salmin = (EditText) findViewById(R.id.salmin);
		sal = (EditText) findViewById(R.id.sal);
		btncalcular = (Button) findViewById(R.id.btnCalcular);
		btnVoltar = (Button) findViewById(R.id.btnVoltar);
		
		btnVoltar.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent ExercicioGeral = new
								Intent (Main_8.this,Main_1.class);
						Main_8.this.startActivity(ExercicioGeral);
						Main_8.this.finish();
						
					}
				});
	}

	public void calcular(View v){
		double sala = Double.parseDouble(salmin.getText().toString());
		double salt = Double.parseDouble(sal.getText().toString());
		double res;
		
		res=salt/sala;
		
		AlertDialog.Builder dialogo = new AlertDialog.Builder(
				Main_8.this);
		dialogo.setTitle("Aviso");
		dialogo.setMessage("Salário Mínimo: " + sala + "\nSalário Líquido: " + salt+"\nQuantidade de Salários Mínimos: " + res );
		dialogo.setNeutralButton("OK", null);
		dialogo.show();
	}
	
}
