package czadowedziewczyny.igsm2019;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class ActivityTimetable extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timetable);

    }

    public void Navigation(View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("day")) {
            Intent navigation = new Intent(this, ActivityDay.class);
            startActivity(navigation);
        } else if (button_text.equals("Tuesday")) {
            Intent mass = new Intent(this, ActivityDay.class);
            startActivity(mass);

        }
    }
}