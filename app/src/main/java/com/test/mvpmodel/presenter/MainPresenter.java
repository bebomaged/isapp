// MainPresenter.java
package com.test.mvpmodel.presenter;

import com.test.mvpmodel.contract.MainContract;
import com.test.mvpmodel.model.MainModel;

public class MainPresenter implements MainContract.Presenter {
    private final MainContract.View view;
    private final MainModel model;

    public MainPresenter(MainContract.View view) {
        this.view = view;
        this.model = new MainModel();
    }

    @Override
    public void onButtonClicked() {
        // Retrieve data from the model
        String data = model.fetchData();
        view.showData(data);
    }
}
