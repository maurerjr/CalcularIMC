package maurercompany.cacularimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Tela2 extends AppCompatActivity {

    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        String txt = bundle.getString("result");

        TextView txtResultado2 = (TextView) findViewById(R.id.txtResultado);

        txtResultado2.setText("IMC = " + txt);

    }
}
