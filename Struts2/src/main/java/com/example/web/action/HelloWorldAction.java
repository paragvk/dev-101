package com.example.web.action;

import com.example.web.model.JobListing;

/**
 * Struts2 does not require implement <code>Action<code> but can optionally
 * implement <code>ActionSupport<code> if you need some ready made support (but
 * is totally optional).
 * 
 * Tip: Objects of such classes with nothing special are sometimes referred to
 * as POJO (Plain Old Java Object)
 *
 */
public class HelloWorldAction {

    /**
     * The model class that stores the message to display in the view.
     */
    private JobListing job;

    public JobListing getJob() {
        return job;
    }

    public void setJob(JobListing job) {
        this.job = job;
    }

    /*
     * Creates the JobListing model object and returns success. The JobListing
     * model object will be available to the view.
     */
    public String execute() {

        // TODO: May be get this from database
        job = new JobListing();
        job.setJobTitle("This is Job Title comming from model object on action class");
        job.setPay(1000.50);

        /*
         * The returned String is actually the result name in mapped in
         * struts.xml
         */
        return "success";

    }

}
