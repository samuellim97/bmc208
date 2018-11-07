package com.example.samuellim.testviewpager;

import java.util.Date;

public class ServiceRequest {

    private static int count = 1000;
    private int requestID;
    private Date requiredDate;
    private String notes;
    private String status;

    public ServiceRequest(Date inDate, String inNotes, String inStatus){
        this.requiredDate = inDate;
        this.notes= inNotes;
        this.status = inStatus;
        requestID = count++;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public String getNotes() {
        return notes;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ServiceRequest{" +
                "requestID=" + requestID +
                ", requiredDate=" + requiredDate +
                ", notes='" + notes + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
