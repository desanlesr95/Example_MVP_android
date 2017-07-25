package com.desan.luis.mvp_android;

/**
 * Created by luis on 3/07/17.
 */

public class LoginInteractorImpl implements LoginInteractor{
    @Override
    public void login(String username, String password, OnLoginFinishedListener listener) {
        if(username.equals("Luis")&&password.equals("123")){
            listener.onSuccess();
        }
        else{
            if(!username.equals("Luis")){
                listener.onUsernameError();
            }
            else{
                listener.onPasswordError();
            }
        }
    }
}
