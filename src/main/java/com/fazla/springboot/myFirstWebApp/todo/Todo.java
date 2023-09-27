package com.fazla.springboot.myFirstWebApp.todo;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean done;

    static class Builder{
        private Todo todo;
        public Builder(){
            todo=new Todo();
        }

        public Builder setId(int id){
            todo.id = id;
            return this;
        }

        public Builder setUsername(String username){
            todo.username = username;
            return this;
        }

        public Builder setDescription(String description){
            todo.description = description;
            return this;
        }

        public Builder setTargetDate(LocalDate targetDate){
            todo.targetDate = targetDate;
            return this;
        }

        public Builder setDone(boolean done){
            todo.done = done;
            return this;
        }

        public Todo build(){
            return todo;
        }
    }

    public Todo(){}

    public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }
}
