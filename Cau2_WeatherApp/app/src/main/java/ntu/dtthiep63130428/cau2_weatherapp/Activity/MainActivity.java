package ntu.dtthiep63130428.cau2_weatherapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import ntu.dtthiep63130428.cau2_weatherapp.Adapter.HourlyAdapter;
import ntu.dtthiep63130428.cau2_weatherapp.Domains.Hourly;
import ntu.dtthiep63130428.cau2_weatherapp.R;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterHourLy;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecycleview();
    }

    private void initRecycleview() {
        ArrayList<Hourly> items = new ArrayList<>();
        items.add(new Hourly("9 Am",28,"cloudy"));
        items.add(new Hourly("10 Am",29,"sunny"));
        items.add(new Hourly("11 Am",30,"wind"));
        items.add(new Hourly("12 Am",31,"rain"));
        items.add(new Hourly("1 Am",32,"storm"));

        recyclerView=findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterHourLy = new HourlyAdapter(items);
        recyclerView.setAdapter(adapterHourLy);
    }

}