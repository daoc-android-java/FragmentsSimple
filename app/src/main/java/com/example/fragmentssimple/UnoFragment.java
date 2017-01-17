package com.example.fragmentssimple;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class UnoFragment extends Fragment {
	private Button b;
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragment =  inflater.inflate(R.layout.fragment_uno, container, false);
    	b = (Button) fragment.findViewById(R.id.boton);
    	b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
		    	b.setText(String.valueOf(Math.random()));
			}
		});        
        
        return fragment;
    }

    public void cambiaTexto(String txt) {
    	b.setText(txt);
    }

}
