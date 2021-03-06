package com.jdjz.testConfig;

import com.jude.utils.JUtils;

import java.time.temporal.JulianFields;

public class SealConst {
    public static final int DISCUSSION_REMOVE_MEMBER_REQUEST_CODE = 1;
    public static final int DISCUSSION_ADD_MEMBER_REQUEST_CODE = 2;
    public static final boolean ISOPENDISCUSSION = false;
    public static final int PERSONALPROFILEFROMCONVERSATION = 3;
    public static final int PERSONALPROFILEFROMGROUP = 4;
    public static final String GROUP_LIST_UPDATE = "GROUP_LIST_UPDATE";
    public static final String EXIT = "EXIT";
    public static final String CHANGEINFO = "CHANGEINFO";
    public static final String SEALTALK_LOGIN_ID = "loginid";
    public static final String SEALTALK_LOGIN_NAME = "loginnickname";
    public static final String SEALTALK_LOGING_PORTRAIT = "loginPortrait";
    public static final String SEALTALK_LOGING_PHONE = "loginphone";
    public static final String SEALTALK_LOGING_PASSWORD = "loginpassword";


    public static final String BATTYER_LEVEL = "batterylevel";
    public static void setSharepreferenct(){
        JUtils.getSharedPreference().edit().putString("loginToken","loginToken123").apply();
        JUtils.getSharedPreference().edit().putString(SealConst.SEALTALK_LOGIN_ID,"loginid123").apply();
    }

}
