package com.desan.luis.mvp_android;

/**
 * Created by luis on 3/07/17.
 */

public interface LoginPresentador {

    void validateUsers(String username, String password);

    void onDestroy();

}
