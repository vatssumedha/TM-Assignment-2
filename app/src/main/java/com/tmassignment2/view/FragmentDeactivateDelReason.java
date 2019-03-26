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

public class FragmentDeactivateDelReason extends Fragment {

    @BindView(R.id.reason)
    TextView reason;
    @BindView(R.id.next_action_text)
    TextView next_action_text;
    @BindView(R.id.click_action)
    TextView click_action;
    ArrayList<InformationList> infoList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setUserVisibleHint(false);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_deactivate_delete_reason, container, false);
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
            reason.setText(String.valueOf(infoList.get(currentItem).deactivationDeleteReasons.getReason()));
            next_action_text.setText(infoList.get(currentItem).deactivationDeleteReasons.getNext_action_text());
            click_action.setText(infoList.get(currentItem).deactivationDeleteReasons.getClick_action());
        }

    }





}
