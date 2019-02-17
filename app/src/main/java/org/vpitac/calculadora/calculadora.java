package org.vpitac.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }

    public void Sumar (View view){
        TextView Resultado =(TextView) findViewById(R.id.Resultado);
        EditText PrimerNumero=(EditText) findViewById(R.id.PrimerNumero);
        EditText SegundoNumero=(EditText) findViewById(R.id.SegundoNumero);
        Button suma=(Button)findViewById(R.id.Sumar);

        Double a =Double.parseDouble(String.valueOf(PrimerNumero.getText()));
        Double b =Double.parseDouble(String.valueOf(SegundoNumero.getText()));

        Resultado.setText("la suma es "+ (a+b));
    }

    public void Restar (View view){
        TextView Resultado =(TextView) findViewById(R.id.Resultado);
        EditText PrimerNumero=(EditText) findViewById(R.id.PrimerNumero);
        EditText SegundoNumero=(EditText) findViewById(R.id.SegundoNumero);
        Button resta=(Button)findViewById(R.id.Restar);

        Double a =Double.parseDouble(String.valueOf(PrimerNumero.getText()));
        Double b =Double.parseDouble(String.valueOf(SegundoNumero.getText()));

        Resultado.setText("la resta es "+ (a-b));
    }

    public void Convertir (View view){
        TextView Resultado =(TextView) findViewById(R.id.Resultado);
        EditText PrimerNumero=(EditText) findViewById(R.id.PrimerNumero);
        Button convertir=(Button)findViewById(R.id.Convertir);

        Double a =Double.parseDouble(String.valueOf(PrimerNumero.getText()));
        Resultado.setText("el numero en Farenheit es "+ (a*33.8));
    }
}
