package dtthiep.usingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewData;
    RecyclerView recyclerViewLandScape;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewData = getDataForRecyclerView();
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
        //layout theo chieu dung
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(linearLayoutManager);
        //
        //layout theo chieu ngang
        //RecyclerView.LayoutManager linearLayoutHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        //recyclerViewLandScape.setLayoutManager(linearLayoutHorizonal);
        //
        //layout theo chieu dung
        //RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this,2);
        //recyclerViewLandScape.setLayoutManager(layoutGrid);
        //
        landScapeAdapter = new LandScapeAdapter(this,recyclerViewData);
        //
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }

    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        dsDuLieu.add(new LandScape("flag_tower","Cột cờ Hà Nội"));
        dsDuLieu.add(new LandScape("eiffel","Tháp Eiffel"));
        dsDuLieu.add(new LandScape("bck","Cung điện BuckingHam"));
        dsDuLieu.add(new LandScape("statueofliberty","Tượng nữ thần tự do"));
        return dsDuLieu;
    }

}