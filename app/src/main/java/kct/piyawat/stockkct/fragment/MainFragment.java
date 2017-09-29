package kct.piyawat.stockkct.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import kct.piyawat.stockkct.R;

/**
 * Created by masterung on 9/26/2017 AD.
 */

public class MainFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //NewRegister Controller
        newRegisterController();


    }

    private void newRegisterController() {
        TextView textView = getView().findViewById(R.id.txtNewRegister);    // Initial View
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Move to RegisterFragment
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentOfFragment, new RegisterFragment())
                        .addToBackStack(null)
                        .commit();

            }
        });
    }


}    //Main Class
