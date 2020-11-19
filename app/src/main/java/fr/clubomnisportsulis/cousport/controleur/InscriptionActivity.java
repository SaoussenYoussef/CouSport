package fr.clubomnisportsulis.cousport.controleur;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import fr.clubomnisportsulis.cousport.R;

public class InscriptionActivity extends AppCompatActivity {

    private Button mAdhesionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        mAdhesionButton = findViewById(R.id.activity_Inscription_adherer_Btn);

        Toast.makeText(this, "SI vous n'êtes pas encore inscrit(e), cliquez sur le Bouton :" +
                        " Je ne suis pas encore adhérent(e) au COU ",
                Toast.LENGTH_LONG).show();

        mAdhesionButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               //TODO pourquoi cela engendre une erreur ?
             //  Toast.makeText(this, "WRONG ANSWER!", Toast.LENGTH_SHORT).show();

               String url = "https://club-omnisports-des-ulis.assoconnect.com/billetterie/offre/146926-a-adhesion-karate-2020-2021";
               Intent i = new Intent(Intent.ACTION_VIEW);
               i.setData(Uri.parse(url));
               startActivity(i);

            }
        });


    }

    public void GetUrlCampagneAdhesion(View view) {
        String url = "https://club-omnisports-des-ulis.assoconnect.com/billetterie/offre/146926-a-adhesion-karate-2020-2021";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}