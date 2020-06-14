package com.chenjl.performance;

import java.util.List;

public class BlankDisc implements CompactDisc{
    private String artist;
    private String title;
    private List<String> tracks;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("正在播放第 "+ trackNumber + "首音乐！");
    }
}
