package com.doubleclick.visualizer;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import androidx.preference.PreferenceFragmentCompat;

public class SettingFragment  extends PreferenceFragmentCompat {
    @Override
    //to create new xml file in Activity
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.prerf_visualizer);
    }
}
