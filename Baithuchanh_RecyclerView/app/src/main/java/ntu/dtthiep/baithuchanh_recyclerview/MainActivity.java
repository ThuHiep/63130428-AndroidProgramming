package ntu.dtthiep.baithuchanh_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Exam List");
        setSupportActionBar(toolbar);


        List<testexamdata> list= new ArrayList<testexamdata>();
        list.add(new testexamdata("First Exam","May 23, 2015","Best Of Luck"));
        list.add(new testexamdata("Second Exam","June 09, 2015","b of l"));
        list.add(new testexamdata("My Test Exam","April 27, 2017","This is testing exam .."));


        recyclerView = findViewById(R.id.recycler);

        adapter = new Adapter(list,getApplication());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}