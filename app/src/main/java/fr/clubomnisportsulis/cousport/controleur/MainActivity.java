package fr.clubomnisportsulis.cousport.controleur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import fr.clubomnisportsulis.cousport.R;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    private TextView mBienvenueText;
    private Button mConnexionBtn;
    private Button mInscriptionBtn;
    private Button mDecouverteBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBienvenueText = findViewById(R.id.activiy_main_greeting_text);
        mConnexionBtn = findViewById(R.id.activity_Connexion_Btn);
        mInscriptionBtn = findViewById(R.id.activity_Inscription_Btn);
        mDecouverteBtn = findViewById(R.id.activity_Decouvrir_Btn);


        // When Click on Decouverte Button

        mDecouverteBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent decouvActivityIntent = new Intent (MainActivity.this, DecouverteActivity.class);
                startActivity(decouvActivityIntent);
            }
        });


        // When Click on Inscription Button

        mInscriptionBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inscripActivityIntent = new Intent (MainActivity.this, InscriptionActivity.class);
                startActivity(inscripActivityIntent);
            }

        });

        // When Click on Connexion Button

        mConnexionBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent conexActivityIntent = new Intent(MainActivity.this, ConnexionActivity.class);
                startActivity(conexActivityIntent);

            }
        });



    }
}