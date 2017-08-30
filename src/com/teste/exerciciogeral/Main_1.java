package com.teste.exerciciogeral;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main_1 extends ActionBarActivity {

		Button btlancheria, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8,
		bt10, bt11, bt12;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_1);
		
		btlancheria = (Button) findViewById(R.id.btlancheria);
		bt1 = (Button) findViewById(R.id.bt1);
		bt2 = (Button) findViewById(R.id.bt2);
		bt3 = (Button) findViewById(R.id.bt3);
		bt4 = (Button) findViewById(R.id.bt4);
		bt5 = (Button) findViewById(R.id.bt5);
		bt6 = (Button) findViewById(R.id.bt6);
		bt7 = (Button) findViewById(R.id.bt7);
		bt8 = (Button) findViewById(R.id.bt8);
		bt10 = (Button) findViewById(R.id.bt10);
		bt11 = (Button) findViewById(R.id.bt11);
		bt12 = (Button) findViewById(R.id.bt12);
		
		
		btlancheria.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent ExercicioGeral = new
						Intent (Main_1.this,Main_Lancheria.class);
				Main_1.this.startActivity(ExercicioGeral);
				Main_1.this.finish();
				
			}
		});
bt1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent ExercicioGeral = new
						Intent (Main_1.this,Main_01.class);
				Main_1.this.startActivity(ExercicioGeral);
				Main_1.this.finish();
				
			}
		});
bt2.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		Intent ExercicioGeral = new
				Intent (Main_1.this,Main_02.class);
		Main_1.this.startActivity(ExercicioGeral);
		Main_1.this.finish();
		
	}
});

bt3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		Intent ExercicioGeral = new
				Intent (Main_1.this,Main_03.class);
		Main_1.this.startActivity(ExercicioGeral);
		Main_1.this.finish();
		
	}
});

bt4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		Intent ExercicioGeral = new
				Intent (Main_1.this,Main_04.class);
		Main_1.this.startActivity(ExercicioGeral);
		Main_1.this.finish();
		
	}
});
bt5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		Intent ExercicioGeral = new
				Intent (Main_1.this,Main_5.class);
		Main_1.this.startActivity(ExercicioGeral);
		Main_1.this.finish();
		
	}
});

bt6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		Intent ExercicioGeral = new
				Intent (Main_1.this,Main_6.class);
		Main_1.this.startActivity(ExercicioGeral);
		Main_1.this.finish();
		
	}
});

bt7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		Intent ExercicioGeral = new
				Intent (Main_1.this,Main_7.class);
		Main_1.this.startActivity(ExercicioGeral);
		Main_1.this.finish();
		
	}
});

bt8.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		Intent ExercicioGeral = new
				Intent (Main_1.this,Main_8.class);
		Main_1.this.startActivity(ExercicioGeral);
		Main_1.this.finish();
		
	}
});
bt10.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		Intent ExercicioGeral = new
				Intent (Main_1.this,Main_10.class);
		Main_1.this.startActivity(ExercicioGeral);
		Main_1.this.finish();
		
	}
});

bt11.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		Intent ExercicioGeral = new
				Intent (Main_1.this,Main_11.class);
		Main_1.this.startActivity(ExercicioGeral);
		Main_1.this.finish();
		
	}
});

bt12.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		Intent ExercicioGeral = new
				Intent (Main_1.this,Main_12.class);
		Main_1.this.startActivity(ExercicioGeral);
		Main_1.this.finish();
		
	}
});
	}
	
	
	
		@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_1, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
