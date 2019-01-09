package com.example.py.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import static android.support.v7.widget.DividerItemDecoration.VERTICAL;

public class MainActivity extends AppCompatActivity {


    private List<User> users = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private TaskAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);
        prepareUserData();
        mRecyclerView.setHasFixedSize(true);
        mAdapter = new TaskAdapter(users);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

    }

    private void prepareUserData(){

        User user = new User("John Doe", "Writer", "29");
        users.add(user);

        user = new User("Peter Parkar", "Saviour", "45");
        users.add(user);

        user = new User("Bruce Banner", "Hulk", "34");
        users.add(user);

        user = new User("Tony Stark", "Mechanic", "90");
        users.add(user);

        user = new User("Pepper", "Manager", "56");
        users.add(user);

        user = new User("Happy", "Advisor", "34");
        users.add(user);

        user = new User("Cable", "Electrician", "57");
        users.add(user);

        user = new User("Thor Odinson", "Carpenter", "23");
        users.add(user);

        user = new User("Jane Aurthr", "Researcher", "90");
        users.add(user);

        user = new User("Sheldon Cooper", "Physicist", "45");
        users.add(user);

        user = new User("Joey Tribiani", "Actor", "14");
        users.add(user);

        user = new User("Chandler Bing", "CA", "56");
        users.add(user);

        user = new User("Ross Geller", "PhD", "89");
        users.add(user);

        user = new User("Monica Geller", "Chef", "45");
        users.add(user);

        user = new User("Rachael Green", "Assistant Buyer", "34");
        users.add(user);

        user = new User("Phoebe Buffay", "Musician", "38");
        users.add(user);

        //mAdapter.notifyDataSetChanged();
    }
}
