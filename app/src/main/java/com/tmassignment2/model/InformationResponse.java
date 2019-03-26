package com.tmassignment2.model;

import java.util.ArrayList;

/**
 * Created by Sumedha Vats on 26-03-2019.
 */
public class InformationResponse {
    ArrayList<CompatibilityQuestions> compatibility_questions;
    ArrayList<ProfileQuestions> profile_questions;
    ArrayList<String> hiv_statuses;
    ArrayList<String> tribes;
    ArrayList<String> interests;
    ArrayList<Orientations> orientations;
    ArrayList<GroupLeaveReportReasons> group_leave_reasons;
    ArrayList<GroupLeaveReportReasons> group_report_reasons;
    ArrayList<UserUnmatchReportReasons> user_unmatch_reasons;
    ArrayList<UserUnmatchReportReasons> user_report_reasons;
    ArrayList<UserUnmatchReportReasons> user_group_report_reasons;
    ArrayList<DeactivationDeleteReasons> deactivation_reasons;
    ArrayList<DeactivationDeleteReasons> deletion_reasons;
    StaticImages static_images;
    String share_app_text;
    String share_app_link;

    public ArrayList<CompatibilityQuestions> getCompatibility_questions() {
        return compatibility_questions;
    }

    public void setCompatibility_questions(ArrayList<CompatibilityQuestions> compatibility_questions) {
        this.compatibility_questions = compatibility_questions;
    }

    public ArrayList<ProfileQuestions> getProfile_questions() {
        return profile_questions;
    }

    public void setProfile_questions(ArrayList<ProfileQuestions> profile_questions) {
        this.profile_questions = profile_questions;
    }

    public ArrayList<String> getHiv_statuses() {
        return hiv_statuses;
    }

    public void setHiv_statuses(ArrayList<String> hiv_statuses) {
        this.hiv_statuses = hiv_statuses;
    }

    public ArrayList<String> getTribes() {
        return tribes;
    }

    public void setTribes(ArrayList<String> tribes) {
        this.tribes = tribes;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;
    }

    public ArrayList<Orientations> getOrientations() {
        return orientations;
    }

    public void setOrientations(ArrayList<Orientations> orientations) {
        this.orientations = orientations;
    }

    public ArrayList<GroupLeaveReportReasons> getGroup_leave_reasons() {
        return group_leave_reasons;
    }

    public void setGroup_leave_reasons(ArrayList<GroupLeaveReportReasons> group_leave_reasons) {
        this.group_leave_reasons = group_leave_reasons;
    }

    public ArrayList<GroupLeaveReportReasons> getGroup_report_reasons() {
        return group_report_reasons;
    }

    public void setGroup_report_reasons(ArrayList<GroupLeaveReportReasons> group_report_reasons) {
        this.group_report_reasons = group_report_reasons;
    }

    public ArrayList<UserUnmatchReportReasons> getUser_unmatch_reasons() {
        return user_unmatch_reasons;
    }

    public void setUser_unmatch_reasons(ArrayList<UserUnmatchReportReasons> user_unmatch_reasons) {
        this.user_unmatch_reasons = user_unmatch_reasons;
    }

    public ArrayList<UserUnmatchReportReasons> getUser_report_reasons() {
        return user_report_reasons;
    }

    public void setUser_report_reasons(ArrayList<UserUnmatchReportReasons> user_report_reasons) {
        this.user_report_reasons = user_report_reasons;
    }

    public ArrayList<UserUnmatchReportReasons> getUser_group_report_reasons() {
        return user_group_report_reasons;
    }

    public void setUser_group_report_reasons(ArrayList<UserUnmatchReportReasons> user_group_report_reasons) {
        this.user_group_report_reasons = user_group_report_reasons;
    }

    public ArrayList<DeactivationDeleteReasons> getDeactivation_reasons() {
        return deactivation_reasons;
    }

    public void setDeactivation_reasons(ArrayList<DeactivationDeleteReasons> deactivation_reasons) {
        this.deactivation_reasons = deactivation_reasons;
    }

    public ArrayList<DeactivationDeleteReasons> getDeletion_reasons() {
        return deletion_reasons;
    }

    public void setDeletion_reasons(ArrayList<DeactivationDeleteReasons> deletion_reasons) {
        this.deletion_reasons = deletion_reasons;
    }

    public StaticImages getStatic_images() {
        return static_images;
    }

    public void setStatic_images(StaticImages static_images) {
        this.static_images = static_images;
    }

    public String getShare_app_text() {
        return share_app_text;
    }

    public void setShare_app_text(String share_app_text) {
        this.share_app_text = share_app_text;
    }

    public String getShare_app_link() {
        return share_app_link;
    }

    public void setShare_app_link(String share_app_link) {
        this.share_app_link = share_app_link;
    }

    public class CompatibilityQuestions {
        int id;
        String question;
        String tick;
        String cross;
        Style style;



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getTick() {
            return tick;
        }

        public void setTick(String tick) {
            this.tick = tick;
        }

        public String getCross() {
            return cross;
        }

        public void setCross(String cross) {
            this.cross = cross;
        }

        public Style getStyle() {
            return style;
        }

        public void setStyle(Style style) {
            this.style = style;
        }
    }

    public class Style {
        String medium;
        String large;
        String thumb;
        String original;

        public Style(String medium, String large, String thumb, String original) {
            this.medium = medium;
            this.large = large;
            this.thumb = thumb;
            this.original = original;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getOriginal() {
            return original;
        }

        public void setOriginal(String original) {
            this.original = original;
        }
    }

    public class ProfileQuestions {
        int id;
        String question;
        String suggestion;



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getSuggestion() {
            return suggestion;
        }

        public void setSuggestion(String suggestion) {
            this.suggestion = suggestion;
        }
    }


    public class Orientations {
        int id;
        String name;



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class GroupLeaveReportReasons {
        int id;
        String name;
        int rank;
        String type;



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }


    public class UserUnmatchReportReasons {
        int id;
        String created_at;
        String updated_at;
        String name;
        String type;
        int rank;



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }
    }


    public class DeactivationDeleteReasons {
        String reason;
        String next_action_text;
        String click_action;


        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getNext_action_text() {
            return next_action_text;
        }

        public void setNext_action_text(String next_action_text) {
            this.next_action_text = next_action_text;
        }

        public String getClick_action() {
            return click_action;
        }

        public void setClick_action(String click_action) {
            this.click_action = click_action;
        }
    }


    public class StaticImages {
        public String getSpark() {
            return spark;
        }

        public void setSpark(String spark) {
            this.spark = spark;
        }

        String spark;
    }
}


