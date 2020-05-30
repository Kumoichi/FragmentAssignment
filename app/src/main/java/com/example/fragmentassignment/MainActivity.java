package com.example.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.TextView;

import com.example.fragmentassignment.dummy.DummyContent;


public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener {

    TextView dummyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dummyText = findViewById(R.id.dummyText);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

        dummyText.setText(item.content);
    }

    public void onListFragmentInteraction(String item) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        ItemFragment blankFragment = (ItemFragment) fragmentManager.findFragmentById(R.id.detail_fragment);
        blankFragment.update(item);
    }
}
