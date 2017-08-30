package com.teste.exerciciogeral;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_04 extends Activity {

	EditText nota1, nota2, nota3, mediaex, ra;
	Button btncalcular, btnVoltar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_4);
		
		ra = (EditText) findViewById(R.id.ra);
		nota1 = (EditText) findViewById(R.id.nota1);
		nota2 = (EditText) findViewById(R.id.nota2);
		nota3 = (EditText) findViewById(R.id.nota3);
		mediaex = (EditText) findViewById(R.id.mediaex);
		btncalcular = (Button) findViewById(R.id.btnCalcular);
		btnVoltar = (Button) findViewById(R.id.btnVoltar);
		
		btnVoltar.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent ExercicioGeral = new
								Intent (Main_04.this,Main_1.class);
						Main_04.this.startActivity(ExercicioGeral);
						Main_04.this.finish();
						
					}
				});
	}

		public void calcular(View v){
			double id = Double.parseDouble(ra.getText().toString());
			double n1 = Double.parseDouble(nota1.getText().toString());
			double n2 = Double.parseDouble(nota2.getText().toString());
			double n3 = Double.parseDouble(nota3.getText().toString());
			double me = Double.parseDouble(mediaex.getText().toString());			
			double res;
			
			
			{
			
			res = ((n1 + (n2*2) + (n3*3) + me) / 7);
			}
			
		
			if(res >= 90 ){
			
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_04.this);
				dialogo.setTitle("Boletim Escolar");
				dialogo.setMessage("Código do Aluno: " + id +
						"\nNota da 1ª Avaliação: " + n1 +
						"\nNota da 2ª Avaliação: " + n2 +
						"\nNota da 3ª Avaliação: " + n3 +
						"\nNota dos Exercícios: " + me +
					"\nNota Final: " + res + "\nConceito: A" + "\n\nPARABÉNS, VOCÊ FOI APROVADO !!!" );
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			
			}
			
			else if(res >= 75 && res < 90 ){
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_04.this);
				dialogo.setTitle("Boletim Escolar");
				dialogo.setMessage( "Código do Aluno: " + id +
						"\nNota da 1ª Avaliação: " + n1 +
						"\nNota da 2ª Avaliação: " + n2 +
						"\nNota da 3ª Avaliação: " + n3 +
						"\nNota dos Exercícios: " + me +
					"\nNota Final: " + res + "\nConceito: B" + "\n\nPARABÉNS, VOCÊ FOI APROVADO !!!");
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			
			}
			
			else if(res >= 60 && res < 75 ){
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_04.this);
				dialogo.setTitle("Boletim Escolar");
				dialogo.setMessage("Código do Aluno: " + id +
						"\nNota da 1ª Avaliação: " + n1 +
						"\nNota da 2ª Avaliação: " + n2 +
						"\nNota da 3ª Avaliação: " + n3 +
						"\nNota dos Exercícios: " + me +
					"\nNota Final: " + res + "\nConceito: C" + "\n\nPARABÉNS, VOCÊ FOI APROVADO !!!");
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			
			}
			
			else if(res >= 40 && res < 60 ){
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_04.this);
				dialogo.setTitle("Boletim Escolar");
				dialogo.setMessage("Código do Aluno: " + id +
						"\nNota da 1ª Avaliação: " + n1 +
						"\nNota da 2ª Avaliação: " + n2 +
						"\nNota da 3ª Avaliação: " + n3 +
						"\nNota dos Exercícios: " + me +
					"\nNota Final: " + res + "\nConceito: D" + "\n\nREPROVADO !!!");
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			
			}
			
			else{
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						Main_04.this);
				dialogo.setTitle("Boletim Escolar");
				dialogo.setMessage("Código do Aluno: " + id +
						"\nNota da 1ª Avaliação: " + n1 +
						"\nNota da 2ª Avaliação: " + n2 +
						"\nNota da 3ª Avaliação: " + n3 +
						"\nNota dos Exercícios: " + me +
					"\nNota Final: " + res + "\nConceito: E" + "\n\nREPROVADO !!!");
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			
			}
			
		}

}
