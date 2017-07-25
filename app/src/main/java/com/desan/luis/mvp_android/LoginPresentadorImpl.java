package com.desan.luis.mvp_android;

/**
 * Created by luis on 3/07/17.
 */

public class LoginPresentadorImpl implements LoginPresentador,LoginInteractorImpl.OnLoginFinishedListener{

    private LonginView  loginView;
    private LoginInteractor loginInteractor;
    //Recibe la clase loginview
    public LoginPresentadorImpl(LonginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginInteractorImpl();
    }
    @Override
    public void validateUsers(String username, String password) {
        //Checar que la clase que se e¿recibio no esta vacia
        if (loginView==null){
            loginView.showProgress();
        }
        loginInteractor.login(username,password,this);
    }

    @Override
    public void onDestroy() {
        loginView=null;
    }

    @Override
    public void onUsernameError() {
        if (loginView!=null){
            loginView.setUsernameError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (loginView!=null){
            loginView.setPasswordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView!=null){
            loginView.AcceptLogin();
        }
    }
}
