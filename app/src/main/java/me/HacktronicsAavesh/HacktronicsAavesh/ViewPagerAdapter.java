package me.HacktronicsAavesh.HacktronicsAavesh;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> listFragment = new ArrayList<>();
    private final List<String> Titles = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return  listFragment.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    public void AddFragment (Fragment fragment, String title){
        listFragment.add(fragment);
        Titles.add(title);

    }
}
