package pt.ipb.mostrarfrase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextFrase = findViewById(R.id.editTextFrase);
        Button buttonGerar = findViewById(R.id.buttonGerar);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        buttonGerar.setOnClickListener(view -> {
            String resultado = FraseFormatter.juntarAutor(
                    editTextFrase.getText().toString(),
                    getString(R.string.autor_desconhecido)
            );

            if (resultado.isEmpty()) {
                editTextFrase.setError(getString(R.string.erro_frase_vazia));
                textViewResultado.setVisibility(View.INVISIBLE);
                return;
            }

            editTextFrase.setError(null);
            textViewResultado.setText(resultado);
            textViewResultado.setVisibility(View.VISIBLE);
        });

        editTextFrase.setOnEditorActionListener((textView, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                buttonGerar.performClick();
                return true;
            }
            return false;
        });
    }
}
