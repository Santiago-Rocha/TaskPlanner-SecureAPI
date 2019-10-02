package edu.eci.ieti.tablero.model;

public class Task {
    private String title;
    private String description;
    private String status;
    private String dueDate;
    private User responsible;

    /*public Task() {
        
    }

    public Task(String title, String description, String status, Date dueDate, User responsible) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
        this.responsible = responsible;
    }

    public Task(String title, String description, String status, Date dueDate) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
    }*/


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public User getResponsible() {
        return responsible;
    }

    public void setResponsible(User responsible) {
        this.responsible = responsible;
    }

    
    


    
}