package com.example.golfier.android_youtube_api;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class YoutubeUser {

    private String accountMail;
    private String possibleUserName;
    private List<String> listId;
    private List<String> listTitle;
    private List<String> listChannelIdUpload;
    private List<String> listUpload;
    private List<BigInteger> listViewCount;

    public YoutubeUser() {
        accountMail="";
        possibleUserName="";
        listId = new ArrayList<>();
        listTitle = new ArrayList<>();
        listChannelIdUpload = new ArrayList<>();
        listViewCount = new ArrayList<>();
        listUpload = new ArrayList<>();
    }

    public String getPossibleUserName() {
        return possibleUserName;
    }

    public List<String> getListTitle() {
        return listTitle;
    }

    public String getAccountMail() {
        return accountMail;
    }

    public List<String> getListId() {
        return listId;
    }

    public List<String> getListChannelIdUpload() {
        return listChannelIdUpload;
    }

    public List<BigInteger> getListViewCount() {
        return listViewCount;
    }

    public List<String> getListUpload() {

        return listUpload;
    }

    public void setListUpload(List<String> listUpload) {
        this.listUpload = listUpload;
    }

    public void setAccountMail(String accountMail) {
        this.accountMail = accountMail;
    }

    public void setPossibleUserName(String possibleUserName) {
        this.possibleUserName = possibleUserName;
    }

    public void setListId(List<String> listId) {
        this.listId = listId;
    }

    public void setListTitle(List<String> listTitle) {
        this.listTitle = listTitle;
    }

    public void setListChannelIdUpload(List<String> listChannelIdUpload) {
        this.listChannelIdUpload = listChannelIdUpload;
    }

    public void setListViewCount(List<BigInteger> listViewCount) {
        this.listViewCount = listViewCount;
    }

    public void addInformation (String id, String title, BigInteger viewCount, String listChannelIdUpload) {
        this.listId.add(id);
        this.listTitle.add(title);
        this.listChannelIdUpload.add(listChannelIdUpload);
        this.listViewCount.add(viewCount);
    }

    public void addVideoContent(List<String> videoId) {
        this.listUpload.addAll(videoId);
    }
}