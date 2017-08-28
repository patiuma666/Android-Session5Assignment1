package com.example.iis5.blinkingeffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /* Called when the activity is first created. */
    TextView textView;
    Button button;
    Animation animation; //Animation

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("onCreate()", "Execution Started");  //checks whether the Execution is started debug the code
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        //txtMessage = (TextView) findViewById(R.id.txtMessage);
        textView = (TextView) findViewById(R.id.textView);


        // here it  load the animation
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        //  code for blink
        button.setOnClickListener(new View.OnClickListener() {
            // sets the onclick button event

            @Override
            public void onClick(View view) {
                //shows the visibility of the textview
                textView.setVisibility(View.VISIBLE);

                //Start the animation
                textView.startAnimation(animation);
                Toast.makeText(getApplicationContext(),"Started Blinking Animation",Toast.LENGTH_SHORT).show();
            }

        });

    }
}