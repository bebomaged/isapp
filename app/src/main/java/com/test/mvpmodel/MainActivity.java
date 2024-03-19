// MainActivity.java
package com.test.mvpmodel;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.test.mvpmodel.contract.MainContract;
import com.test.mvpmodel.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private MainContract.Presenter presenter;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        presenter = new MainPresenter(this);

        button.setOnClickListener(v -> presenter.onButtonClicked());
    }

    @Override
    public void showData(String data) {
        textView.setText(data);
    }
}
