package lasalvia.simone.convertitorediunitdimisuratestuale;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class ConversionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        /*Map<String, Double> metri = new HashMap<String, Double>();
        metri.put("mm", 0.001);
        metri.put("cm", 0.01);
        metri.put("dm", 0.1);
        metri.put("m", 1.0);
        metri.put("dam", 10.0);
        metri.put("hm", 100.0);
        metri.put("km", 1000.0);

        boolean lunghezza, peso, temperatura;
        double valore = Double.parseDouble(String.valueOf(findViewById(R.id.edtxtValore)));
        double risultato = Double.parseDouble(String.valueOf(findViewById(R.id.edtxtRisultato)));
        String unitaArrivo = String.valueOf(findViewById(R.id.edtxtUnitaArrivo));
        String unitaPartenza = String.valueOf(findViewById(R.id.edtxtUnitaPartenza));
        Button btnConverti = findViewById(R.id.btnConverti);
        TextView txtError = findViewById(R.id.txtError);

        Intent intent = getIntent();
        lunghezza = intent.getExtras().getBoolean("Lunghezza");
        peso = intent.getExtras().getBoolean("Peso");
        temperatura = intent.getExtras().getBoolean("Temperatura");

        btnConverti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lunghezza)
                {
                }
            }
        });*/
    }
}
