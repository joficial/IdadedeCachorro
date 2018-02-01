package br.ufma.lsdi.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Por mim
    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Por mim
        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String textoDigitado = caixaTexto.getText().toString();

                if (textoDigitado.isEmpty()){
                    //Mensagem de erro
                }else{
                    final int valorDigitado = Integer.parseInt(textoDigitado);
                    final int resultado = valorDigitado * 7;

                    resultadoIdade.setText("A idade do cachorro em anos humanos é " + resultado + " anos!");
                }

            }
        });

    }
}
