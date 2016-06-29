package com.example.mobileappdevelop.customadapterpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mobile App Develop on 29-6-16.
 */
public class TeamAdapter extends ArrayAdapter<Team>{
    Context context;
    ArrayList<Team> teams;
    public TeamAdapter(Context context, ArrayList<Team> teams) {
        super(context, R.layout.list_row, teams);
        this.context = context;
        this.teams = teams;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(R.layout.list_row, null, true);

        TextView teamNameTextView = (TextView) convertView.findViewById(R.id.TeamNameTextView);
        ImageView teamImageView = (ImageView) convertView.findViewById(R.id.TeamImageView);

        teamNameTextView.setText(teams.get(position).getTeamName());
        teamImageView.setImageResource(teams.get(position).getTeamImageId());

        return convertView;
    }
}
