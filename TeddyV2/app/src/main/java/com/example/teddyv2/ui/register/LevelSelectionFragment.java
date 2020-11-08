package com.example.teddyv2.ui.register;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.teddyv2.R;
import com.example.teddyv2.domain.user.User;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LevelSelectionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LevelSelectionFragment extends Fragment {

    private RegisterActivity registerActivity;
    private User user;

    private void setRegisterActivity(RegisterActivity registerActivity){
        this.registerActivity = registerActivity;
    }

    private void setUser(User user){
        this.user = user;
    }

    public LevelSelectionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment RegisterCongratsFragment.
     */
    public static LevelSelectionFragment newInstance(RegisterActivity registerActivity, User user) {
        LevelSelectionFragment fragment = new LevelSelectionFragment();
        fragment.setRegisterActivity(registerActivity);
        fragment.setUser(user);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.single_spinner_fragment, container, false);
    }
}