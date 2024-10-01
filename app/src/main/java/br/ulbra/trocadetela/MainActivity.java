package br.ulbra.trocadetela;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    Button bttelaprincipal, bttela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarregarTelaPrincipal();
    }
    public void CarregarTelaPrincipal() {
        setContentView(R.layout.activity_main);
        bttela2 = (Button) findViewById(R.id.bttela2);
        bttela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTela2(); } });
    }

    public void CarregarTela2() {
        setContentView(R.layout.tela2);
        bttelaprincipal = (Button) findViewById (R.id.tela_principal);
        bttelaprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaPrincipal();
            }
        });
    } }




