package com.test.pluto.model;

public class User {
    private String id;
    private String command;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", command='" + command + '\'' +
                '}';
    }
}