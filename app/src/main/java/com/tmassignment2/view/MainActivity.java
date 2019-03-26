package com.tmassignment2.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


import com.tmassignment2.R;
import com.tmassignment2.events.CompatibleQuesEvent;
import com.tmassignment2.model.InformationList;
import com.tmassignment2.model.InformationResponse;
import com.tmassignment2.viewmodel.InformationViewModel;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    ArrayList<InformationList> infoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        InformationViewModel model = ViewModelProviders.of(this).get(InformationViewModel.class);

        model.getInfo().observe(this, new Observer<InformationResponse>() {
            @Override
            public void onChanged(@Nullable InformationResponse informationResponse) {
                initView(informationResponse);
            }
        });


    }

    public void initView(InformationResponse informationResponse) {

        for (int a = 0; a < informationResponse.getCompatibility_questions().size(); a++) {
            infoList.add(new InformationList(InformationList.TYPE_COMP_QUES, informationResponse.getCompatibility_questions().get(a), null, null, null, null, null, null, null, null, null));

        }
        for (int a = 0; a < informationResponse.getProfile_questions().size(); a++) {
            infoList.add(new InformationList(InformationList.TYPE_PRO_QUES, null, informationResponse.getProfile_questions().get(a), null, null, null, null, null, null, null, null));

        }
        for (int a = 0; a < informationResponse.getHiv_statuses().size(); a++) {
            infoList.add(new InformationList(InformationList.TYPE_STRING_LIST, null, null, null, null, null, informationResponse.getHiv_statuses().get(a), null, null, null, null));

        }
        for (int a = 0; a < informationResponse.getTribes().size(); a++) {
            infoList.add(new InformationList(InformationList.TYPE_STRING_LIST, null, null, null, null, null, informationResponse.getTribes().get(a), null, null, null, null));

        }
        for (int a = 0; a < informationResponse.getInterests().size(); a++) {
            infoList.add(new InformationList(InformationList.TYPE_STRING_LIST, null, null, null, null, null, informationResponse.getInterests().get(a), null, null, null, null));

        }
        for (int a = 0; a < informationResponse.getOrientations().size(); a++) {
            infoList.add(new InformationList(InformationList.TYPE_ORIENTATION, null, null, informationResponse.getOrientations().get(a), null, null, null, null, null, null, null));

        }
        for (int a = 0; a < informationResponse.getGroup_leave_reasons().size(); a++) {
            infoList.add(new InformationList(InformationList.TYPE_GRP_LEAVE_REASON, null, null, null, informationResponse.getGroup_leave_reasons().get(a), null, null, null, null, null, null));

        }
        for (int a = 0; a < informationResponse.getGroup_report_reasons().size(); a++) {
            infoList.add(new InformationList(InformationList.TYPE_GRP_LEAVE_REASON, null, null, null, informationResponse.getGroup_report_reasons().get(a), null, null, null, null, null, null));

        }


        for (int a = 0; a < informationResponse.getUser_unmatch_reasons().size(); a++) {
            infoList.add(new InformationList(InformationList.TYPE_USER_UNMATCH_REASON, null, null, null, null, null, null, informationResponse.getUser_unmatch_reasons().get(a), null, null, null));
        }
        for (int a = 0; a < informationResponse.getUser_report_reasons().size(); a++) {
            infoList.add(new InformationList(InformationList.TYPE_USER_UNMATCH_REASON, null, null, null, null, null, null, informationResponse.getUser_report_reasons().get(a), null, null, null));
        }
        for (int a = 0; a < informationResponse.getUser_group_report_reasons().size(); a++) {
            infoList.add(new InformationList(InformationList.TYPE_USER_UNMATCH_REASON, null, null, null, null, null, null, informationResponse.getUser_group_report_reasons().get(a), null, null, null));
        }
        for (int a = 0; a < informationResponse.getDeactivation_reasons().size(); a++) {
            infoList.add(new InformationList(InformationList.TYPE_DEAC_DEL_REASON, null, null, null, null, null, null, null, informationResponse.getDeactivation_reasons().get(a), null, null));
        }
        for (int a = 0; a < informationResponse.getDeletion_reasons().size(); a++) {
            infoList.add(new InformationList(InformationList.TYPE_DEAC_DEL_REASON, null, null, null, null, null, null, null, informationResponse.getDeletion_reasons().get(a), null, null));
        }
        infoList.add(new InformationList(InformationList.TYPE_STATIC_IMG, null, null, null, null, informationResponse.getStatic_images(), null, null, null, null, null));
        infoList.add(new InformationList(InformationList.TYPE_STRING, null, null, null, null, null, null, null, null, informationResponse.getShare_app_text(), null));
        infoList.add(new InformationList(InformationList.TYPE_STRING, null, null, null, null, null, null, null, null, null, informationResponse.getShare_app_link()));


        setupViewPager();

    }

    private void setupViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        for (int i = 0; i < infoList.size(); i++) {
            if (infoList.get(i).viewType == 0)
                adapter.addFragment(new FragmentCompatQues());
            if (infoList.get(i).viewType == 1)
                adapter.addFragment(new FragmentProQues());
            if (infoList.get(i).viewType == 2)
                adapter.addFragment(new FragmentSingleText());
            if (infoList.get(i).viewType == 3)
                adapter.addFragment(new FragmentOrientation());
            if (infoList.get(i).viewType == 4)
                adapter.addFragment(new FragmentGroupLeave());
            if (infoList.get(i).viewType == 5)
                adapter.addFragment(new FragmentUserUnmatchReason());
            if (infoList.get(i).viewType == 6)
                adapter.addFragment(new FragmentDeactivateDelReason());
            if (infoList.get(i).viewType == 7)
                adapter.addFragment(new FragmentSparkImage());
            if (infoList.get(i).viewType == 8)
                adapter.addFragment(new FragmentSingleText());
        }
        viewPager.setAdapter(adapter);


    }

    public int getCurrentItem() {
        return viewPager.getCurrentItem();

    }
    public ArrayList<InformationList>  getInfoLIst() {
        return infoList;

    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();

        private ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        private void addFragment(Fragment fragment) {
            mFragmentList.add(fragment);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return null;
        }
    }


}
