package com.konfides.payment.foodcard.navigation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.konfides.payment.foodcard.navigation.R;

public class SecondFragment extends Fragment {
    Button btn;
    TextView txtAge;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_second_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn=view.findViewById(R.id.button2);
        txtAge=view.findViewById(R.id.textView);
        btn.setOnClickListener(view1 ->
                {
                    Toast.makeText(requireContext(),"First fragment a geciliyor",Toast.LENGTH_LONG).show();
                    goToFirst(view1);
                }
                );

        //gonderilen veriyı alalım
        if(getArguments()!=null){
            int age=SecondFragmentArgs.fromBundle(getArguments()).getAge();//age verisini aldık
            txtAge.setText("Age :"+age);
        }
    }

    public void goToFirst(View view){
        NavDirections action=SecondFragmentDirections.actionSecondFragmentToFirstFargment();
        Navigation.findNavController(view).navigate(action);
    }
}
