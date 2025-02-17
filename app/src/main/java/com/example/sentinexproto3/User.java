package com.example.sentinexproto3;

public class User {
    private String username;
    private String phoneNumber;
    private double latitude;
    private double longitude;

    private boolean isAD;


    public User() {
        // Default constructor required for Firebase
    }

    public User(String username, String phoneNumber, double latitude, double longitude, boolean isAD) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.latitude = latitude;
        this.longitude = longitude;
        this.isAD = isAD;
    }

    public String getUsername() {
        return username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public boolean getisAD() { return isAD;}
}
