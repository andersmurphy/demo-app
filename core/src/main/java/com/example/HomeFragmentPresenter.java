package com.example;

public final class HomeFragmentPresenter {

    private final HomeFragmentView view;

    public HomeFragmentPresenter(HomeFragmentView view) {
        this.view = view;
    }

    public void onViewCreated() {
        view.setTextViewText(this.getClass().getName());
    }
}
