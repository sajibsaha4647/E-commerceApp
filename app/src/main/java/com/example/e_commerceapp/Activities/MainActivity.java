package com.example.e_commerceapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.e_commerceapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


    private Fragment fragment ;
    private ImageView DrowerIcon;
    private TextView TitleText;
    private SharedPreferences SavedatastatePref;
    private SharedPreferences.Editor editor;
    private CardView middleCard;
    private DrawerLayout drawerLayout ;
    private BottomNavigationView navView;

    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        middleCard = findViewById(R.id.hom);




        //bottom layout
        //Initialize Bottom Navigation View.
        BottomNavigationView navView = findViewById(R.id.bottom_nav_view);//bottom navigation

        //Pass the ID's of Different destinations
        appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.wishlistFragment, R.id.categoryFragment2,R.id.wishlistFragment, R.id.cartFragment, R.id.accountFragment,R.id.homeFragment2)
                .build();

        //Initialize NavController. Bottom tab
        NavController navController = Navigation.findNavController(this, R.id.Navhostid);
        NavigationUI.setupWithNavController(navView, navController);

        middleCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(MainActivity.this,R.id.Navhostid).navigate(R.id.homeFragment2);
            }
        });



    }

}