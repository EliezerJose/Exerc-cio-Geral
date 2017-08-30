package com.teste.exerciciogeral;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_5 extends Activity {

	
	EditText salbase, tempo, codigo;
	Button btnCalcular, btnVoltar;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_5);
		
		salbase = (EditText) findViewById(R.id.salbase);
		tempo = (EditText) findViewById(R.id.tempo);
		codigo = (EditText) findViewById(R.id.codigoo);
		btnCalcular = (Button) findViewById(R.id.btnCalcular);
		btnVoltar = (Button) findViewById(R.id.btnVoltar);
		
		btnVoltar.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent ExercicioGeral = new
								Intent (Main_5.this,Main_1.class);
						Main_5.this.startActivity(ExercicioGeral);
						Main_5.this.finish();
						
					}
				});
	}
		public void calcular (View v){
			double sal = Double.parseDouble(salbase.getText().toString());
			double time = Double.parseDouble(tempo.getText().toString());
			
			double imposto;
			double gratificacao=0;
			double liquido;
			
			if(sal<200){
				imposto= sal*0;
			}
			
			else if(sal>=200 && sal<=450){
				imposto=sal*0.3;
			}
			else if(sal>=451 && sal<700){
				imposto=sal*0.8;
			}
			else{
				imposto=sal*0.12;
			}
		
		
			if(sal>500 && time <=3){
				gratificacao = 20;
			}
		
			else if(sal>500 && time > 3){
				gratificacao = 30;
			}
			else if(sal<=500 && time <=3){
				gratificacao = 23;
			}
			else if(sal<=500 && time>3 && time<=6){
				gratificacao = 35;
			}
			else if(sal<=500 && time > 6){
				gratificacao = 33;
			}
		
			
			liquido=sal-imposto+gratificacao;
		
		if(liquido<=350){
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_5.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("CLASSE A !!!" +
					"\nSalário Bruto:R$ " + sal +
					"\nTempo de Serviço: " + time + " anos" +
			"\nImposto cobrado:R$ " + imposto +
			"\nGratificação:R$ " + gratificacao +
			"\nSalário Líquido:R$ " + liquido);
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
		else if(liquido>=351 && liquido<=600 ){
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_5.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("CLASSE B !!!" +
					"\nSalário Bruto:R$ " + sal +
					"\nTempo de Serviço: " + time + " anos"+
			"\nImposto cobrado:R$ " + imposto +
			"\nGratificação:R$ " + gratificacao +
			"\nSalário Líquido:R$ " + liquido);
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
		else{
			AlertDialog.Builder dialogo = new AlertDialog.Builder(
					Main_5.this);
			dialogo.setTitle("Aviso");
			dialogo.setMessage("CLASSE C !!!" +
					"\nSalário Bruto:R$ " + sal +
					"\nTempo de Serviço: " + time + " anos"+
			"\nImposto cobrado:R$ " + imposto +
			"\nGratificação:R$ " + gratificacao +
			"\nSalário Líquido:R$ " + liquido);
			dialogo.setNeutralButton("OK", null);
			dialogo.show();
		}
		}	
}
