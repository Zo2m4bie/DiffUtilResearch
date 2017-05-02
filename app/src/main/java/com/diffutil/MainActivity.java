package com.diffutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button mFirstListBtn, mSecondListBtn, mSortCurrentList;
    private RecyclerView mRecyclerView;
    private Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirstListBtn = (Button) findViewById(R.id.first_list);
        mSecondListBtn = (Button) findViewById(R.id.second_list);
        mSortCurrentList = (Button) findViewById(R.id.sort);
        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mAdapter = new Adapter();
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mFirstListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                analizeAndShowNewList(DataUtils.getFirstData());
            }
        });

        mSecondListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                analizeAndShowNewList(DataUtils.getFirstDataDeletedAndInsertedAndUpdated());
            }
        });

        mSortCurrentList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<CityModel> clone = cloneList(mAdapter.getData());
                Collections.shuffle(clone);
                analizeAndShowNewList(clone);
            }
        });
    }
    public static List<CityModel> cloneList(List<CityModel> list) {
        List<CityModel> clone = new ArrayList<CityModel>(list.size());
        for (CityModel item : list)
            try {
                clone.add(item.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        return clone;
    }

    private void analizeAndShowNewList(List<CityModel> data) {
        CityDiffUtil callback = new CityDiffUtil(mAdapter.getData(), data);
        DiffUtil.DiffResult result = DiffUtil.calculateDiff(callback);
        mAdapter.setData(data);
        result.dispatchUpdatesTo(mAdapter);
    }
}
