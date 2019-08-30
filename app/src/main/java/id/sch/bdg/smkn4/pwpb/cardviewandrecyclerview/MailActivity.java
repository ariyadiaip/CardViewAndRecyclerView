package id.sch.bdg.smkn4.pwpb.cardviewandrecyclerview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MailActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Mail> mailList;
    private MailAdapter mailAdapter;

    String[][] mailContent = {{"A","Abdul Ghani", "Inviting for Party", "Let's come to My Birthday Party","12:33pm"},
            {"G","Gravity Falls", "Activation Code", "Hello Gravity Mania!!\n" +
                    "Thanks for join on Pre-Register of Gravity Falls AR-Game!\n" +
                    "Submit your unique Code ; 190321 for the Pre Register Gift","11:54am"},
            {"C","Codashop", "Winter Sale has Started!!", "Winter Sale has Started!! Recharge now and you will get 100% Bonus Recharge!!","02:44am"},
            {"M","Microsoft", "Labor Day Sale!!", "Long Weekend, big savings!! All product are discount 80%, buy now and you will get !00% cashback!!","05:13pm"},
            {"T","Travelmedia", "Happy Holiday!!", "Booking tickets?? Travelmedia is your best solution","01:22pm"},
            {"S","Steam", "Notification", "Your Account : Access from new Computer!! Click ere if you need help for recovery your account","10:01am"},
            {"V","VP Game", "Rewards Game", "Congratulations, you get free $1000!! Click here to claim your reward!!","11:12am"}};

    int[] logoMail = {
            R.drawable.blue_rounded,
            R.drawable.red_rounded,
            R.drawable.green_rounded,
            R.drawable.grey_rounded,
            R.drawable.brown_rounded,
            R.drawable.pink_rounded,
            R.drawable.orange_rounded
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("My Mail");

        mRecyclerView = (RecyclerView)findViewById(R.id.main_contentProject);

        //seeting untuk improve performance
        //content tidak dapat mengubah size layout recyclerview
        if (mRecyclerView != null) {
            mRecyclerView.setHasFixedSize(true);
        }

        //using a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //initializing an arraylist called maillist
        mailList = new ArrayList<>();

        //add project list
        for (int i = 0; i < mailContent.length; i++) {
            //int pic = Integer.parseInt(projectContent[i][4]);
            Mail mail = new Mail(mailContent[i][0], mailContent[i][1], mailContent[i][2],
                    mailContent[i][3], mailContent[i][4],logoMail[i]);
            mailList.add(mail);
        }

        //initializing adapter
        mailAdapter = new MailAdapter(mailList);

        //specifying an adapter to access data, create views and replace the content
        mRecyclerView.setAdapter(mailAdapter);
        mailAdapter.notifyDataSetChanged();
    }
}
