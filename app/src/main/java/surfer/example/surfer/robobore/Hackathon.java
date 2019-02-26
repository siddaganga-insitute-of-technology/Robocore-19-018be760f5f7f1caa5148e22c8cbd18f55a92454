package surfer.example.surfer.robobore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.nio.InvalidMarkException;
import java.nio.channels.InterruptedByTimeoutException;

public class Hackathon extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hackathon);
        imageView=findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Hackathon.this,MainActivity.class);
            startActivity(i);
            }

        });
    }
}
