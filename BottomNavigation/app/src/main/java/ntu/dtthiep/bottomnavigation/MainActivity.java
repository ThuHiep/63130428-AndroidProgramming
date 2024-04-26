package ntu.dtthiep.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigation);
        frameLayout = findViewById(R.id.framelayout);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId = item.getItemId();

                if(itemId==R.id.navHome){
                    LoadFragment(new HomeFragment(),false);

                    
                } else if (itemId==R.id.navSearch) {
                    LoadFragment(new searchfragment(),false);
                    
                } else if (itemId==R.id.navNot) {
                    LoadFragment(new notififragment(),false);
                    
                }else {
                    LoadFragment(new profilefragment(),false);

                }

                return true;
            }
        });
        LoadFragment(new HomeFragment(),true);

    }
    private void LoadFragment(Fragment fragment, boolean isAppInnitiallized){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(isAppInnitiallized){
            fragmentTransaction.add(R.id.framelayout, fragment);
        }
        else {
            fragmentTransaction.replace(R.id.framelayout, fragment);
        }
        fragmentTransaction.commit();
    }
}