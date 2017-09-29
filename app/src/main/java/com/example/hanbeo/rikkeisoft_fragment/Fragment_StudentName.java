package com.example.hanbeo.rikkeisoft_fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by HanBeo on 09/29/2017.
 */

public class Fragment_StudentName extends Fragment {
    EditText edtTen;
    Button btnNhap;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.studentnamefragment, container, false);
        edtTen = (EditText) v.findViewById(R.id.edtTen);
        btnNhap = (Button) v.findViewById(R.id.btnNhap);
        android.app.FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment_Student fragmentStudent = new Fragment_Student();
                fragmentTransaction.replace(R.id.frame_content, fragmentStudent);
                fragmentTransaction.commit();

                Bundle bundle = new Bundle();
                bundle.putString("Ten", edtTen.getText().toString());
                fragmentStudent.setArguments(bundle);





            }
        });
        return v;
    }
}
