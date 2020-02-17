package tn.esprit.recapapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import tn.esprit.recapapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtNom, txtPrenom, txtEmail, txtPhone ;

    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNom = findViewById(R.id.txtNom);
        txtPrenom = findViewById(R.id.txtPrenom);
        txtEmail = findViewById(R.id.txtEmail);
        txtPhone = findViewById(R.id.phone);
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("nom", txtNom.getText().toString());
                intent.putExtra("prenom", txtPrenom.getText().toString());
                intent.putExtra("email", txtEmail.getText().toString());
                intent.putExtra("phone", txtPhone.getText().toString());

                startActivity(intent);

            }
        });

    }
}
