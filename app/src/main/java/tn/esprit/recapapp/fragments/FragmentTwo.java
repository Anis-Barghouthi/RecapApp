package tn.esprit.recapapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import tn.esprit.recapapp.R;

public class FragmentTwo extends Fragment {

    TextView tcv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView ;

        rootView = inflater.inflate(R.layout.frag_two, container, false);

        tcv = rootView.findViewById(R.id.tcv);

        tcv.setText(getArguments().getCharSequence("numTel"));

        return rootView;
    }
}
