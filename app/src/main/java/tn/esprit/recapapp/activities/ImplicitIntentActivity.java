package tn.esprit.recapapp.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import tn.esprit.recapapp.R;

public class ImplicitIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
    }

    public void callIntent(View view) {
        Intent intent = null;

        switch (view.getId()){
            case R.id.btn_button1:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
                break;
            case R.id.btn_button2:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:98123456"));
                break;
            case R.id.btn_button3:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:36.899202,10.189615?z=19"));
                break;
            case R.id.btn_button4:
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
//                intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                break;
            case R.id.btn_button5:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                break;
            default:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://esprit.tn"));
                break;

        }

        startActivity(intent);

    }
}
