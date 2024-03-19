// MainContract.java
package com.test.mvpmodel.contract;

public interface MainContract {
    interface View {
        void showData(String data);
    }

    interface Presenter {
        void onButtonClicked();
    }
}
