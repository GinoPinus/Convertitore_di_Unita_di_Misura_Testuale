package lasalvia.simone.diceeandroid;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Link delle View
        Button rollButton = (Button) findViewById(R.id.rollButton);
        ImageView leftDice = (ImageView) findViewById(R.id.imageLeftDice);
        ImageView RightDice = (ImageView) findViewById(R.id.imageRightDice);
        int[] diceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Log.d("Dicee","Button Pressed")
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("Dicee","The random number is : " + number);
                leftDice.setImageResource(diceArray[number]);
                number = randomNumberGenerator.nextInt(6);
                Log.d("Dicee","The random number is : " + number);
                RightDice.setImageResource(diceArray[number]);

            }
        });
    }
}