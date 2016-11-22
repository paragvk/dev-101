package com.example.web.model;

/**
 * Model class that stores a Job listing.
 */
public class JobListing {

    private String jobTitle;

    private double pay;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

}
