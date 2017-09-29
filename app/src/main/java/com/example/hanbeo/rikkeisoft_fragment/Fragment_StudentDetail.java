package com.example.hanbeo.rikkeisoft_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by HanBeo on 09/29/2017.
 */

public class Fragment_StudentDetail extends Fragment {
    TextView txtHienTenInfor, txtQueQuan, txtNgaySinh, txtGioiTinh, txtLop, txtKhoaHoc;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.studentdetailfragment, container, false);


        txtHienTenInfor = (TextView) v.findViewById(R.id.txtHienTenInfor);
        txtQueQuan = (TextView) v.findViewById(R.id.txtQueQuan);
        txtNgaySinh = (TextView) v.findViewById(R.id.txtNgaySinh);
        txtGioiTinh = (TextView) v.findViewById(R.id.txtGioiTinh);
        txtLop = (TextView) v.findViewById(R.id.txtLop);
        txtKhoaHoc = (TextView) v.findViewById(R.id.txtKhoaHoc);

        Bundle bundleReceive = getArguments();
        if (bundleReceive != null){
            txtHienTenInfor.setText(bundleReceive.getString("HoTen"));
            txtQueQuan.setText(bundleReceive.getString("Que"));
            txtNgaySinh.setText(bundleReceive.getString("NgaySinh"));
            txtGioiTinh.setText(bundleReceive.getString("GioiTinh"));
            txtLop.setText(bundleReceive.getString("Lop"));
            txtKhoaHoc.setText(bundleReceive.getString("KhoaHoc"));


        }
        return v;

    }
}
