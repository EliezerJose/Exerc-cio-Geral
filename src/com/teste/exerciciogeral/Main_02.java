package com.teste.exerciciogeral;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_02 extends Activity {

	EditText codigo, qtd;
	Button btncalcular, btnVoltar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2);
		
		codigo = (EditText) findViewById(R.id.codig);
		qtd = (EditText) findViewById(R.id.quanti);
		btncalcular = (Button) findViewById(R.id.btnCalcular);
		btnVoltar = (Button) findViewById(R.id.btnVoltar);
		
		btnVoltar.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent ExercicioGeral = new
								Intent (Main_02.this,Main_1.class);
						Main_02.this.startActivity(ExercicioGeral);
						Main_02.this.finish();
						
					}
				});
			}

	public void calcular(View v){
	
		double cod = Double.parseDouble(codigo.getText().toString());
		double quantidade = Double.parseDouble(qtd.getText().toString());
		double res=0;
		
		if(cod == 1001){
			res = quantidade * 5.32;
		}
		if(cod == 1324){
			res = quantidade * 6.45;
		}
		if(cod == 6548){
			res = quantidade * 2.37;
		}
		if(cod == 1987){
			res = quantidade * 5.32;
		}
		if(cod == 7623){
			res = quantidade * 6.45;
		}
		
		AlertDialog.Builder dialogo = new AlertDialog.Builder(
				Main_02.this);
		dialogo.setTitle("Aviso");
		dialogo.setMessage("Código: " + cod +"\nQuantidade: " + quantidade + "\nTotal: " + res);
		dialogo.setNeutralButton("OK", null);
		dialogo.show();
		}
}
