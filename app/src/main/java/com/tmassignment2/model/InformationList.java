package com.tmassignment2.model;

/**
 * Created by Sumedha Vats on 26-03-2019.
 */
public class InformationList {
    public static final int TYPE_COMP_QUES = 0;
    public static final int TYPE_PRO_QUES = 1;
    public static final int TYPE_STRING_LIST = 2;
    public static final int TYPE_ORIENTATION = 3;
    public static final int TYPE_GRP_LEAVE_REASON = 4;
    public static final int TYPE_USER_UNMATCH_REASON = 5;
    public static final int TYPE_DEAC_DEL_REASON = 6;
    public static final int TYPE_STATIC_IMG = 7;
    public static final int TYPE_STRING = 8;

   public int viewType;
    public InformationResponse.CompatibilityQuestions compatibilityQuestions;
    public  InformationResponse.ProfileQuestions profileQuestions;
    public InformationResponse.Orientations orientations;
    public InformationResponse.GroupLeaveReportReasons groupLeaveReportReasons;
    public  InformationResponse.StaticImages staticImages;
    public String stringsList;
    public InformationResponse.UserUnmatchReportReasons userUnmatchReportReasons;
    public InformationResponse.DeactivationDeleteReasons deactivationDeleteReasons;
    public String share_app_text;
    public String share_app_link;

    public InformationList() {

    }

    public InformationList(int viewType, InformationResponse.CompatibilityQuestions compatibilityQuestions,
                           InformationResponse.ProfileQuestions profileQuestions, InformationResponse.Orientations orientations
            , InformationResponse.GroupLeaveReportReasons groupLeaveReportReasons,InformationResponse.StaticImages staticImages,
                           String stringsList, InformationResponse.UserUnmatchReportReasons userUnmatchReportReasons
            , InformationResponse.DeactivationDeleteReasons deactivationDeleteReasons, String share_app_text, String share_app_link) {
        this.compatibilityQuestions = compatibilityQuestions;
        this.profileQuestions = profileQuestions;
        this.orientations = orientations;
        this.groupLeaveReportReasons = groupLeaveReportReasons;
        this.staticImages = staticImages;
        this.stringsList = stringsList;
        this.userUnmatchReportReasons = userUnmatchReportReasons;
        this.deactivationDeleteReasons = deactivationDeleteReasons;
        this.share_app_text = share_app_text;
        this.share_app_link = share_app_link;
        this.viewType = viewType;

    }


}
