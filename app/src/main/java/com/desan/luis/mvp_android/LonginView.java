package com.desan.luis.mvp_android;

/**
 * Created by luis on 3/07/17.
 */

public interface LonginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void AcceptLogin();
}
