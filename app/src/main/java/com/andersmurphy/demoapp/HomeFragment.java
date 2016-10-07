package com.andersmurphy.demoapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.HomeFragmentPresenter;
import com.example.HomeFragmentView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomeFragment extends Fragment implements HomeFragmentView {

    @BindView(R.id.text)
    TextView textView;

    private HomeFragmentPresenter presenter;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        presenter = new HomeFragmentPresenter(this);
        presenter.onViewCreated();
        return view;
    }

    @Override
    public void setTextViewText(String text) {
        textView.setText(text);
    }
}
