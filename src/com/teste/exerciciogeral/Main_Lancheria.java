package com.teste.exerciciogeral;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_Lancheria extends Activity {

	EditText qtd, codigo;
	Button btnCalcular, btnVoltar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lancheria);
		
		qtd = (EditText) findViewById(R.id.qtd);
		codigo = (EditText) findViewById(R.id.codigo);
		btnCalcular = (Button) findViewById(R.id.btnCalcular);
		btnVoltar = (Button) findViewById(R.id.btnVoltar);
		
		btnVoltar.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent ExercicioGeral = new
								Intent (Main_Lancheria.this,Main_1.class);
						Main_Lancheria.this.startActivity(ExercicioGeral);
						Main_Lancheria.this.finish();
						
					}
				});
	}

		public void calcular (View v){
			double quanti = Double.parseDouble(qtd.getText().toString());
			double cod = Double.parseDouble(codigo.getText().toString());
					double res;
					
			if(cod == 100){
				res= quanti*1.50;
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_Lancheria.this);
				dialogo.setTitle("Comanda");
				dialogo.setMessage( "Cachorro quente" + " \nQuantidade: " + quanti + " \nTotal:R$ " + res);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}
			else if(cod == 101){
				res= quanti*2.00;
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_Lancheria.this);
				dialogo.setTitle("Comanda");
				dialogo.setMessage( "Bauru Simples" + " \nQuantidade: " + quanti + " \nTotal:R$ " + res);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}
			else if(cod == 102){
				res= quanti*2.30;
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_Lancheria.this);
				dialogo.setTitle("Comanda");
				dialogo.setMessage( "Bauru com ovo" + " \nQuantidade: " + quanti + " \nTotal:R$ " + res);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}
			else if(cod == 103){
				res= quanti*2.00;
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_Lancheria.this);
				dialogo.setTitle("Comanda");
				dialogo.setMessage( "Hambúrguer" + " \nQuantidade: " + quanti + " \nTotal:R$ " + res);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}
			else if(cod == 104){
				res= quanti*2.40;
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_Lancheria.this);
				dialogo.setTitle("Comanda");
				dialogo.setMessage( "Cheeseburguer" + " \nQuantidade: " + quanti + " \nTotal:R$ " + res);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}
			else if(cod == 105){
				res= quanti*1.50;
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_Lancheria.this);
				dialogo.setTitle("Comanda");
				dialogo.setMessage( "Refrigerante" + " \nQuantidade: " + quanti + " \nTotal:R$ " + res);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}
		}
}
