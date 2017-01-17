package com.example.fragmentssimple;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void toggleFragmento(View v) {
    	ToggleButton tb = (ToggleButton)findViewById(R.id.tb);
    	if(tb.isChecked()) {
    		getFragmentManager().beginTransaction().add(R.id.fragment_container, new UnoFragment(), "PRUEBA").commit();
    	} else {
    		Fragment f = getFragmentManager().findFragmentByTag("PRUEBA");
    		getFragmentManager().beginTransaction().remove(f).commit();
    	}
    }
    
    public void poneTextoFragmento(View v) {
    	Fragment f = getFragmentManager().findFragmentByTag("PRUEBA");
    	if(f == null) {
    		Toast.makeText(this, "El fragmento NO está cargado", Toast.LENGTH_SHORT).show();
    	} else {
    		((UnoFragment) f).cambiaTexto("HOLA");
    	}
    }
    
}
