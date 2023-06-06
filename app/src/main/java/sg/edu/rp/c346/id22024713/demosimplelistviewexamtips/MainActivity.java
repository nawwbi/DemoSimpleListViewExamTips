package sg.edu.rp.c346.id22024713.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

        String[] list;
        list = new String[5];

        list[0] = "Don't just read the code, code it as much as possible during each practical session";
        list[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        list[2] = "Prepare your template source code for each topic";
        list[3] = "Create a few empty Android projects to speed up your coding during the exam";
        list[4] = "Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        lvExamTips.setAdapter(adapter);

    }
}