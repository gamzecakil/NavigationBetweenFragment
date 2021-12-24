package com.konfides.payment.foodcard.navigation.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.konfides.payment.foodcard.navigation.R;


public class FirstFargment extends Fragment {

//First fragment tan second fargment ta age verisini gonderelim.

    public FirstFargment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_fragment, container, false);
    }
    //Uygulamanın patlamaması için findById leri  onViewCreatediçine yazmak gerekir

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button=view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSecond(view);
            }
        });
    }

    public void goToSecond(View view){
     //ikinci fragmetta gecmeyi saglayalım
        //NavDirections action=FirstFargmentDirections.actionFirstFargmentToSecondFragment();

        FirstFargmentDirections.ActionFirstFragmentToSecondFragment action=FirstFargmentDirections.actionFirstFragmentToSecondFragment(50);
        //action.setAge(50);
        Navigation.findNavController(view).navigate(action);
    }
}