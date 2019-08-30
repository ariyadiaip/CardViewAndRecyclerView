package id.sch.bdg.smkn4.pwpb.cardviewandrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class CardViewActivity extends AppCompatActivity {

    ImageView icGuide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        icGuide = (ImageView) findViewById(R.id.icguide);
        icGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this, MailActivity.class);
                startActivity(i);
            }
        });
    }
}
