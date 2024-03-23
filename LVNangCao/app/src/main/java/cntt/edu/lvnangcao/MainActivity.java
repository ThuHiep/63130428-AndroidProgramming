package cntt.edu.lvnangcao;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import cntt.edu.lvnangcao.adapters.CountryAdapter;
import cntt.edu.lvnangcao.model.Country;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b1
        dsQG= new ArrayList<Country>();
        dsQG.add(new Country("Vietnam",90,"vn"));
        dsQG.add(new Country("Russia",110,"russia"));
        dsQG.add(new Country("United State",80,"us"));

        ListView listView = findViewById(R.id.lvQG);

        CountryAdapter adapter = new CountryAdapter(this, dsQG);
        listView.setAdapter(adapter);


    }
}