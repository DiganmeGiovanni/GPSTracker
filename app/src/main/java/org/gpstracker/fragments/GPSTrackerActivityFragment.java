package org.gpstracker.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.gpstracker.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class GPSTrackerActivityFragment extends Fragment {

    public GPSTrackerActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gpstracker, container, false);
    }
}
