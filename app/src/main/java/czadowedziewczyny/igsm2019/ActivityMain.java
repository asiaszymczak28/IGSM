package czadowedziewczyny.igsm2019;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import android.support.v4.content.ContextCompat.startActivity;
//import czadowedziewczyny.igsm2019.R.id.textView;

public class ActivityMain extends AppCompatActivity {

    TextView textView;

//    public ActionBar toolbar;
//
//    public ActionBar getToolbar() {
//        ActionBar var1 = this.toolbar;
//        return var1;
//    }
//
//    public void  setToolbar (ActionBar var2){
//        this.toolbar = var2;
//    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
        this.setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return false;
            }
        });

//        ActionBar actionbar = this.getSupportActionBar();
//
//        this.toolbar = actionbar;
//        View view = this.findViewById(R.layout.activity_main);
//        BottomNavigationView bottomNavigation = (BottomNavigationView)view;
    }

    //Navigation Button to Timetable
    public void NaviTimetable(View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();

        Intent navitimetable = new Intent(this, ActivityTimetable.class);
        startActivity(navitimetable);


    }
}
