package com.example.gads_leaderboard.services;

import  com.example.gads_leaderboard.model.LearnersLeadersInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LearningLeaders {


    @GET("/api/hours")
    Call<List<LearnersLeadersInfo>> getLearners();
}
