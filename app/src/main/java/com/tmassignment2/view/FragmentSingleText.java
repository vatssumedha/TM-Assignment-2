package com.tmassignment2.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tmassignment2.R;
import com.tmassignment2.model.InformationList;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by Sumedha Vats on 13-02-2019.
 */

public class FragmentSingleText extends Fragment {

    @BindView(R.id.text)
    TextView text;

    ArrayList<InformationList> infoList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setUserVisibleHint(false);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_single_text, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void setMenuVisibility(final boolean visible) {
        super.setMenuVisibility(visible);
        if (visible) {
            initView();
        }

    }


    public void initView() {
        if (((MainActivity) getActivity()) != null) {
            int currentItem = ((MainActivity) getActivity()).getCurrentItem();
            infoList = ((MainActivity) getActivity()).getInfoLIst();
            text.setText(String.valueOf(infoList.get(currentItem).stringsList));
        }

    }




}
