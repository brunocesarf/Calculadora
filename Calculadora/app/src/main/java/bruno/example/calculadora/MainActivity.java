package bruno.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);

            Button btnSomarProg = (Button) findViewById(R.id.btnSomar);

            btnSomarProg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {

                    EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
                    EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
                    EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);

                    double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                    double num2 = Double.parseDouble(edtValor2Prog.getText().toString());

                    double resultado = num1 + num2;

                    edtResultadoProg.setText(String.valueOf(resultado));
                }
            });

            Button btnSubtrairProg = (Button) findViewById(R.id.btnSubtrair);

            btnSubtrairProg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {

                    EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
                    EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
                    EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);

                    double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                    double num2 = Double.parseDouble(edtValor2Prog.getText().toString());

                    double resultado = num1 - num2;

                    edtResultadoProg.setText(String.valueOf(resultado));
                }
            });

            Button btnMultiplicarProg = (Button) findViewById(R.id.btnMultiplicar);

            btnMultiplicarProg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {

                    EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
                    EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
                    EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);

                    double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                    double num2 = Double.parseDouble(edtValor2Prog.getText().toString());

                    double resultado = num1 * num2;

                    edtResultadoProg.setText(String.valueOf(resultado));
                }
            });

            Button btnDividirProg = (Button) findViewById(R.id.btnDividir);

            btnDividirProg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {

                    EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
                    EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
                    EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);

                    double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                    double num2 = Double.parseDouble(edtValor2Prog.getText().toString());

                    double resultado = num1 / num2;

                    edtResultadoProg.setText(String.valueOf(resultado));
                }
            });
        }
    }
