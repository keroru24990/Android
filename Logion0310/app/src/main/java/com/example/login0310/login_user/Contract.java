package com.example.login0310.login_user;

import com.example.login0310.lst_peliculas.model.entities.User;

public interface Contract {
    public interface View {
        // Validación de datos
        public void successLogin(User user);
        void failureLogin(String err);
        // void failureLogin(MyException err);
    }

    public interface Presenter {
        void login(User user); // MODEL
        // void login(String email, String password);
        // void login(ViewUser user); BEAN
    }

    public interface Model{
        interface OnLoginUserL{
            void onFinished(User user);
            void onFailure(String err);
        }
        void loginAPI(User user,
                      OnLoginUserL onLoginUserL);
    }
}
