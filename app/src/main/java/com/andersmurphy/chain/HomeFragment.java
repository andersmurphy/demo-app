package com.andersmurphy.chain;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.HomeFragmentPresenter;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomeFragment extends Fragment {

    private HomeFragmentPresenter presenter;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        presenter = new HomeFragmentPresenter();

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
