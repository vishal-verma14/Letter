package com.example.vikas.letter;

import android.provider.BaseColumns;

/**
 * Created by vikas on 28/7/16.
 */
public class UserData {
    public UserData() {

    }
    public static abstract class UserInfo implements BaseColumns{
        public static final String USER_NAME = "user_name";
        public static final String USER_ADDRESS = "user_address";
        public static final String PHONE_NO = "phone_name";
        public static final String EMAIL_ID = "email_id";
        public static final String DATABASE_NAME = "user_info";
        public static final String TABLE_NAME = "reg_info";


    }
}
