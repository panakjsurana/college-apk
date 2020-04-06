package com.example.dashboard;


public class Youtubevideos {

    String videoUrl;

    public Youtubevideos() {

    }

    public Youtubevideos(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}