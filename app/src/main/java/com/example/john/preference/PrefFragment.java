package com.example.john.preference;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by john on 2017/4/15.
 */
public class PrefFragment extends PreferenceFragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
