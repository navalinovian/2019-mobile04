package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.polinema.model.User;

import static id.ac.polinema.intent.ParcelableActivity.USER_KEY;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here

        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        User dataUser = getIntent().getParcelableExtra(USER_KEY);

        if (dataUser != null) {

            // TODO: display value here
            String username = dataUser.getUsername();
            String name = dataUser.getName();
            String age = Integer.toString(dataUser.getAge());
            usernameText.setText(username);
            nameText.setText(name);
            ageText.setText(age);


        }
    }
}
