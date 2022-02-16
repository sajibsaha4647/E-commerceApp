package com.example.e_commerceapp.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.e_commerceapp.Fragments.IntroFirstFragment;
import com.example.e_commerceapp.Fragments.IntroSecondFragment;
import com.example.e_commerceapp.Fragments.IntroThirdFragment;

public class IntroViewPagerAdapter extends FragmentStatePagerAdapter {

    public IntroViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new IntroFirstFragment();
            case 1:
               return new IntroSecondFragment();
            case 2:
               return new IntroThirdFragment();
            default:
               return new IntroFirstFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
