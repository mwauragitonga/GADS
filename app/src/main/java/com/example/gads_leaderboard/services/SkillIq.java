package com.example.gads_leaderboard.services;

import  com.example.gads_leaderboard.model.LearnersLeadersInfo;
import  com.example.gads_leaderboard.model.SkillIqLeadersInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SkillIq {


    @GET("/api/skilliq")
    Call<List<SkillIqLeadersInfo>> getLearners();
}
