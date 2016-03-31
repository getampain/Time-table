package uk.com.schedule;


import java.util.Calendar;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart()//if app is start find day of week and paint
    {
        Calendar date =Calendar.getInstance();
        LinearLayout thur = (LinearLayout)findViewById(R.id.thursday);
        LinearLayout mon = (LinearLayout)findViewById(R.id.monday);
        LinearLayout tue = (LinearLayout)findViewById(R.id.tuesday);
        LinearLayout wed = (LinearLayout)findViewById(R.id.wednesday);
        LinearLayout fri = (LinearLayout)findViewById(R.id.friday);

        int t=date.get(Calendar.DAY_OF_WEEK);//check day of week

        if(t==2){
            mon.setBackgroundColor(Color.YELLOW);
            tue.setBackgroundColor(Color.WHITE);
            wed.setBackgroundColor(Color.WHITE);
            thur.setBackgroundColor(Color.WHITE);
            fri.setBackgroundColor(Color.WHITE);
        }
        else if(t==3){
            mon.setBackgroundColor(Color.WHITE);
            tue.setBackgroundColor(Color.YELLOW);
            wed.setBackgroundColor(Color.WHITE);
            thur.setBackgroundColor(Color.WHITE);
            fri.setBackgroundColor(Color.WHITE);
        }
        else if(t==4){
            mon.setBackgroundColor(Color.WHITE);
            tue.setBackgroundColor(Color.WHITE);
            wed.setBackgroundColor(Color.YELLOW);
            thur.setBackgroundColor(Color.WHITE);
            fri.setBackgroundColor(Color.WHITE);
        }
        else if(t==5){
            mon.setBackgroundColor(Color.WHITE);
            tue.setBackgroundColor(Color.WHITE);
            wed.setBackgroundColor(Color.WHITE);
            thur.setBackgroundColor(Color.YELLOW);
            fri.setBackgroundColor(Color.WHITE);
        }
        else if(t==6){
            mon.setBackgroundColor(Color.WHITE);
            thur.setBackgroundColor(Color.WHITE);
            tue.setBackgroundColor(Color.WHITE);
            wed.setBackgroundColor(Color.WHITE);
            fri.setBackgroundColor(Color.YELLOW);
        }
        else {
            mon.setBackgroundColor(Color.WHITE);
            thur.setBackgroundColor(Color.WHITE);
            tue.setBackgroundColor(Color.WHITE);
            wed.setBackgroundColor(Color.WHITE);
            fri.setBackgroundColor(Color.WHITE);
        }

        super.onStart();

    }



}
