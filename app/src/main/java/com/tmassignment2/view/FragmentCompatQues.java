package com.tmassignment2.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.tmassignment2.R;
import com.tmassignment2.events.CompatibleQuesEvent;
import com.tmassignment2.model.InformationList;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by Sumedha Vats on 13-02-2019.
 */

public class FragmentCompatQues extends Fragment {
    @BindView(R.id.imgMedium)
    ImageView imgMedium;
    @BindView(R.id.question)
    TextView question;
    @BindView(R.id.id)
    TextView id;
    @BindView(R.id.tick)
    TextView tick;
    @BindView(R.id.cross)
    TextView cross;

    ArrayList<InformationList> infoList;
    public static boolean firstLoad = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setUserVisibleHint(false);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_compatibility_question, container, false);
        ButterKnife.bind(this, view);
        if (firstLoad)
            initView();
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
            id.setText(String.valueOf(infoList.get(currentItem).compatibilityQuestions.getId()));
            question.setText(infoList.get(currentItem).compatibilityQuestions.getQuestion());
            tick.setText(infoList.get(currentItem).compatibilityQuestions.getTick());
            cross.setText(infoList.get(currentItem).compatibilityQuestions.getCross());
            //Image url is showing access denied
            Picasso.with(getActivity()).load(infoList.get(currentItem).compatibilityQuestions.getStyle().getThumb()).placeholder(R.drawable.ic_launcher_foreground).into(imgMedium);
            firstLoad = false;
        }

    }


}
