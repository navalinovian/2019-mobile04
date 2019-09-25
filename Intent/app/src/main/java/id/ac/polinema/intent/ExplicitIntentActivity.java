package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {
    Button submit;
    TextView output;
    EditText name;
    String nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        submit = findViewById(R.id.button_submit);
        output = findViewById(R.id.text_output);
        name = findViewById(R.id.input_name);
    }


    public void handleSubmit(View view) {
        nama = String.valueOf(name.getText());
        output.setText("Hello" + nama +  ", Congratulations!" );
    }
}
