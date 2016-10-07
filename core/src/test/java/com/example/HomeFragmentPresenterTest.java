package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HomeFragmentPresenterTest {

    private HomeFragmentView view;
    private HomeFragmentPresenter presenter;

    @Before
    public void setUp() {
        view = mock(HomeFragmentView.class);
        presenter = new HomeFragmentPresenter(view);
    }

    @Test
    public void name() {
        presenter.onViewCreated();
        verify(view).setTextViewText("com.example.HomeFragmentPresenter");
    }
}