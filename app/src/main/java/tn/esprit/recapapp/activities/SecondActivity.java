package tn.esprit.recapapp.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import tn.esprit.recapapp.R;
import tn.esprit.recapapp.fragments.FragmentOne;
import tn.esprit.recapapp.fragments.FragmentTwo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtNP, txtE, txtPh;
    Button btnF1, btnF2, btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtNP = findViewById(R.id.tvNomPrenom);
        txtE = findViewById(R.id.tvEmail);
        txtPh = findViewById(R.id.tvPhone);
        btnF1 = findViewById(R.id.btnFrag1);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnF2 = findViewById(R.id.btnFrag2);

        if(getIntent().hasExtra("nom") && getIntent().hasExtra("prenom") ){
            String nomPrenom ;

            nomPrenom = getIntent().getStringExtra("prenom")
                    + " "
                    + getIntent().getStringExtra("nom");

            txtNP.setText(nomPrenom);
        }

        if(getIntent().hasExtra("email") ){
            txtE.setText( getIntent().getStringExtra("email"));
        }

        if(getIntent().hasExtra("phone") ){
            txtPh.setText( getIntent().getStringExtra("phone"));
        }

        btnF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment(new FragmentOne());
            }
        });

        btnF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment frag = new FragmentTwo();

                Bundle bundle = new Bundle();

                bundle.putCharSequence("numTel",txtPh.getText().toString());

                frag.setArguments(bundle);

                showFragment(frag);
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Update Profile

            }
        });

        showFragment(new FragmentOne());

    }

    public void showFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,fragment)
                .commit();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //TODO Update Profile

    }

    public void callIntent(View view) {
        switch (view.getId()) {
            case R.id.btn_button4:
                startActivity(new Intent("android.media.action.IMAGE_CAPTURE"));
//                intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                break;
            default:
                startActivity(new Intent(this, ImplicitIntentActivity.class));
                break;
        }
    }

}
