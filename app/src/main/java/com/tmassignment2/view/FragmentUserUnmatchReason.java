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

public class FragmentUserUnmatchReason extends Fragment {
    @BindView(R.id.updated_at)
    TextView updated_at;
    @BindView(R.id.id)
    TextView id;
    @BindView(R.id.created_at)
    TextView created_at;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.type)
    TextView type;
    ArrayList<InformationList> infoList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setUserVisibleHint(false);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_user_unmatch_reason, container, false);
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
            id.setText(String.valueOf(infoList.get(currentItem).userUnmatchReportReasons.getId()));
            name.setText(infoList.get(currentItem).userUnmatchReportReasons.getName());
            type.setText(infoList.get(currentItem).userUnmatchReportReasons.getType());
            created_at.setText(infoList.get(currentItem).userUnmatchReportReasons.getCreated_at());
            updated_at.setText(infoList.get(currentItem).userUnmatchReportReasons.getUpdated_at());
        }

    }


}
