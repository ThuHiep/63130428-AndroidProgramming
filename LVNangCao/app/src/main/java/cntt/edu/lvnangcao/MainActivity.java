package cntt.edu.lvnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import cntt.edu.lvnangcao.model.Country;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b1
        dsQG = new ArrayList<>();
        dsQG.add(new Country("VietNam",99000000,"vn"));
        dsQG.add(new Country("Russia",300000000,"russia"));
        dsQG.add(new Country("VietNam",2000000,"US"));



    }
}