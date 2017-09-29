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
import android.widget.TextView;

/**
 * Created by HanBeo on 09/29/2017.
 */

public class Fragment_Student extends Fragment {
    TextView txtHienTen;
    EditText edtQue, edtNgaySinh, edtGioiTinh, edtLop, edtKhoaHoc;
    Button btnChuyen;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.studentfragment, container, false);

        txtHienTen = (TextView) v.findViewById(R.id.txtHienTen);
        edtQue = (EditText) v.findViewById(R.id.edtQue);
        edtNgaySinh = (EditText) v.findViewById(R.id.edtNgaySinh);
        edtGioiTinh = (EditText) v.findViewById(R.id.edtGioiTinh);
        edtLop = (EditText) v.findViewById(R.id.edtLop);
        edtKhoaHoc = (EditText) v.findViewById(R.id.edtKhoaHoc);
        btnChuyen = (Button) v.findViewById(R.id.btnChuyen);

        Bundle bundle = getArguments();
        if (bundle != null){
            txtHienTen.setText(bundle.getString("Ten"));
        }

        android.app.FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment_StudentDetail fragmentStudentDetail = new Fragment_StudentDetail();
                fragmentTransaction.replace(R.id.frame_content, fragmentStudentDetail);
                fragmentTransaction.commit();

                Bundle bundleInfor = new Bundle();
                bundleInfor.putString("HoTen", txtHienTen.getText().toString() );
                bundleInfor.putString("Que", edtQue.getText().toString());
                bundleInfor.putString("NgaySinh", edtNgaySinh.getText().toString());
                bundleInfor.putString("GioiTinh", edtGioiTinh.getText().toString());
                bundleInfor.putString("Lop", edtLop.getText().toString());
                bundleInfor.putString("KhoaHoc", edtKhoaHoc.getText().toString());

                fragmentStudentDetail.setArguments(bundleInfor);



            }
        });
        return v;
    }
}
