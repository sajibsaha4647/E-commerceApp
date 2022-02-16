package com.example.e_commerceapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.e_commerceapp.Adapter.IntroViewPagerAdapter;
import com.example.e_commerceapp.R;

public class IntroActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener , View.OnClickListener {

    private ViewPager viewPager;
    private ImageView indicatorOne,indicatorTwo,indicatorThree;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        viewPager = findViewById(R.id.viewpagerid);

        indicatorOne = findViewById(R.id.first_indicator);
        indicatorTwo = findViewById(R.id.second_indicator);
        indicatorThree = findViewById(R.id.third_indicator);
        textView = findViewById(R.id.skipped);

        IntroViewPagerAdapter introViewPagerAdapter = new IntroViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(introViewPagerAdapter);
        textView.setOnClickListener(this);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        switch (position){
            case 0:
                indicatorOne.setImageResource(R.drawable.active_circle);
                indicatorTwo.setImageResource(R.drawable.disable_circle);
                indicatorThree.setImageResource(R.drawable.disable_circle);
                break;
            case 1:
                indicatorTwo.setImageResource(R.drawable.active_circle);
                indicatorOne.setImageResource(R.drawable.disable_circle);
                indicatorThree.setImageResource(R.drawable.disable_circle);
                break;
            case 2:
                indicatorThree.setImageResource(R.drawable.active_circle);
                indicatorOne.setImageResource(R.drawable.disable_circle);
                indicatorTwo.setImageResource(R.drawable.disable_circle);
                break;
            default:
                indicatorOne.setImageResource(R.drawable.active_circle);
                indicatorTwo.setImageResource(R.drawable.disable_circle);
                indicatorThree.setImageResource(R.drawable.disable_circle);
                break;
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.skipped){
            Intent intent = new Intent(IntroActivity.this,MainActivity.class);
            startActivity(intent);
        }
    }
}