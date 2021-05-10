package me.franciscofl12e.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity<button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, buttonAdd, buttonmas, buttonmenos, buttonpor, buttondividir, buttonresultado> extends AppCompatActivity {

    float valorPrimero = 0, valorSegundo = 0; // Partes de la operación
    boolean suma = false,resta = false,multiplicacion = false,division = false; // Valores booleanos para comprobar que acción vamos a hacer

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button button0 = findViewById(R.id.button0); // Declaramos cada boton
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonmas = findViewById(R.id.buttonmas);
        Button buttonmenos = findViewById(R.id.buttonmenos);
        Button buttonpor = findViewById(R.id.buttonpor);
        Button buttondividir = findViewById(R.id.buttondividir);
        Button buttonresultado = findViewById(R.id.buttonresultado);

        TextView resultado = findViewById(R.id.textView);



        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText() + "0");
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText() + "9");
            }
        });

        buttonmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (resultado == null) {
                    resultado.setText(""); //Utilizaremos esto por si el usuario quiere introducir el valor del primer valor
                } else {
                    valorPrimero = Float.parseFloat(resultado.getText() + "");
                    suma = true;
                    resultado.setText(null);
                }
            }
        });

        buttonmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPrimero = Float.parseFloat(resultado.getText() + "");
                resta = true;
                resultado.setText(null);
            }
        });

        buttonpor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPrimero = Float.parseFloat(resultado.getText() + "");
                multiplicacion = true;
                resultado.setText(null);
            }
        });

        buttondividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPrimero = Float.parseFloat(resultado.getText() + "");
                division = true;
                resultado.setText(null);
            }
        });

        buttonresultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorSegundo = Float.parseFloat(resultado.getText() + "");

                if (suma == true) {
                    resultado.setText(valorPrimero + valorSegundo + "");
                    suma = false;
                }

                if (resta == true) {
                    resultado.setText(valorPrimero - valorSegundo + "");
                    resta = false;
                }

                if (multiplicacion == true) {
                    resultado.setText(valorPrimero * valorSegundo + "");
                    multiplicacion = false;
                }

                if (division == true) {
                    resultado.setText(valorPrimero / valorSegundo + "");
                    division = false;
                }
            }
        });

    }


}