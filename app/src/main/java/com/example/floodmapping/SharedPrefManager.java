package com.example.floodmapping;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefManager {
    private static SharedPrefManager instance;
    private static Context mctx;
    private static final String SHARED_PREF_NAME = "mysharedpref10";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_USER_FULLNAME = "usernamefullname";
    private static final String KEY_USER_ID = "userid";


    private SharedPrefManager(Context context) {
        mctx = context;


    }

    public static synchronized SharedPrefManager getInstance(Context context) {
        if (instance == null) {
            instance = new SharedPrefManager(context);
        }
        return instance;
    }

    public boolean userLogin(int id, String username, String fullname){

        SharedPreferences sharedPreferences = mctx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt(KEY_USER_ID, id);
        editor.putString(KEY_USER_FULLNAME,fullname);
        editor.putString(KEY_USERNAME, username);
        editor.apply();

        return true;
    }
    public boolean isLoggedIn(){
        SharedPreferences sharedPreferences = mctx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        if (sharedPreferences.getString(KEY_USERNAME, null) != null){
            return true;
        }
        return false;
    }
    public boolean logout(){
        SharedPreferences sharedPreferences = mctx.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        return true;
    }
}
