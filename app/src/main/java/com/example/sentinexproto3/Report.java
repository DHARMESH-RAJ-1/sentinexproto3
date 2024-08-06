// Report.java
package com.example.sentinexproto3;

public class Report {
    private String description;
    private String location;
    private String time;
    private String date;

    public Report() {
        // Default constructor required for Firebase
    }

    public Report(String description, String location, String time, String date) {
        this.description = description;
        this.location = location;
        this.time = time;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetails() {
        return "\nDescription: " + description + "\nLocation: " + location + "\nTime: " + time+"\nDate:"+date;
    }
}
