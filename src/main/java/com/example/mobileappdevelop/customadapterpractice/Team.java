package com.example.mobileappdevelop.customadapterpractice;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 29-6-16.
 */
public class Team {
    private String teamName;
    private int teamImageId;

    public String getTeamName() {
        return teamName;
    }

    public int getTeamImageId() {
        return teamImageId;
    }

    public Team(String teamName, int teamImageId) {
        this.teamImageId = teamImageId;
        this.teamName = teamName;
    }

    public Team() {
    }

    public ArrayList<Team> getAllTeam(){
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(new Team("Australia",R.drawable.australia));
        teams.add(new Team("Bangladesh", R.drawable.bangladesh));
        teams.add(new Team("England", R.drawable.england));
        return teams;
    }
}
