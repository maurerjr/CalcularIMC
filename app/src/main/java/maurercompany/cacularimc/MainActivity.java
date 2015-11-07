package maurercompany.cacularimc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText peso;
    EditText altura;
    TextView txt;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        peso = (EditText) findViewById(R.id.peso);
        altura = (EditText) findViewById(R.id.altura);
        txt = (TextView) findViewById(R.id.textView2);
        // resultado = (TextView) findViewById(R.id.resultado);

        txt.setText("Informe os valores a baixo:");



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float p = Float.parseFloat(peso.getText().toString());
                Float a = Float.valueOf(altura.getText().toString());


                Float imc;

                imc = p/(a*a);

                String result;
                result = String.valueOf(imc);

                //resultado.setText("IMC = " + result);

                Intent intent = new Intent(MainActivity.this, Tela2.class);

                Bundle bundle = new Bundle();
                bundle.putString("result", result);
                intent.putExtras(bundle);

                startActivity(intent);

            }
        });




    }
}
