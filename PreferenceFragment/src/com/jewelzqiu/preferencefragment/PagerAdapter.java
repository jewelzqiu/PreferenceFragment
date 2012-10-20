package com.jewelzqiu.preferencefragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

	PreferenceFragment[] fragments;
    String[] titles;
    
    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        fragments = new PreferenceFragment[2];
        fragments[0] = new PreferenceFragment(R.xml.settings1);
        fragments[1] = new PreferenceFragment(R.xml.settings2);
        
        titles = new String[2];
        titles[0] = context.getString(R.string.settings1);
        titles[1] = context.getString(R.string.settings2);
        
    }
	
	@Override
	public Fragment getItem(int position) {
		return fragments[position];
	}

	@Override
	public int getCount() {
		return fragments.length;
	}
	
	@Override
	public String getPageTitle(int position) {
		return titles[position];
	}

}
