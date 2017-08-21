package com.app.juniorbezerra.appguiaquixada.view;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.app.juniorbezerra.appguiaquixada.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrincipalFragment extends Fragment {

    public PrincipalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_principal, container, false);

        ButterKnife.bind(this,view);


        return view;
    }

    @OnClick(R.id.sobre)
    public void toast (View view){

        Snackbar mySnackbar = Snackbar.make(getView(),"junior", Snackbar.LENGTH_SHORT);
        mySnackbar.show();

    }

}
