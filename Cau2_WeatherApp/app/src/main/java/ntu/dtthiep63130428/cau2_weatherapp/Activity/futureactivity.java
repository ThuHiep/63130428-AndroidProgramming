package ntu.dtthiep63130428.cau2_weatherapp.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ntu.dtthiep63130428.cau2_weatherapp.Adapter.HourlyAdapter;
import ntu.dtthiep63130428.cau2_weatherapp.Domains.Hourly;
import ntu.dtthiep63130428.cau2_weatherapp.R;

public class futureactivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterTomorow;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setvariable();
    }

    private void setvariable() {
        ConstraintLayout backbtn = findViewById(R.id)
    }
}
