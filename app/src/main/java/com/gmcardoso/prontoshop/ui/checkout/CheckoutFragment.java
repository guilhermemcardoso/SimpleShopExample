package com.gmcardoso.prontoshop.ui.checkout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmcardoso.prontoshop.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CheckoutFragment extends Fragment {
    private View mRootView;

    public CheckoutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_checkout, container, false);
        return mRootView;
    }

}
