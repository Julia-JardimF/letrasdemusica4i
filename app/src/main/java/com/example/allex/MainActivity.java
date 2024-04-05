package com.example.allex;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sortear(View view){

    String[] musicas = {
            "Don't know why farewell is always pathetic \n Don't know why death means the end of the tragic \n After all, after the storm, none will be left \n How ironic \n - Orange Killer",
            "Undo! \n The memories i have to live through \n A whisper from a different time \n When love was on the line \n Undo - YOHIO",
            "Tears falling down at the party \n Saddest little baby in the room \n Fears, tell me fears, don't get me started \n I get little grey hair for every scare you share \n Oh Klahoma - Jack Stauber",
            "They call him Hermit the Frog \n He's looking for a dog \n Did you find you bitch in me? \n Oh, you're abominable socially \n You're just a little bit too much like me \n Hermit the Frog - MARINA",
            "I don't wanna hear you've got a boyfriend \n Sometimes you're better of alone \n Girls / Girls / Boys - Panic! At The Disco",
    };

    Random musica = new Random();

    int musicaRandom = musica.nextInt(musicas.length);

    String stringRandom = musicas[musicaRandom];

        TextView textResultado = findViewById(R.id.textResultado);
        textResultado.setText(stringRandom);

    }
}