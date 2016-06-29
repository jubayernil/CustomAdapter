package com.example.mobileappdevelop.customadapterpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView teamListView;
    ArrayList<Team> teams;
    TeamAdapter teamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamListView = (ListView) findViewById(R.id.TeamListView);

        Team team = new Team();

        teams = team.getAllTeam();

        teamAdapter = new TeamAdapter(this, teams);

        teamListView.setAdapter(teamAdapter);
    }
}
