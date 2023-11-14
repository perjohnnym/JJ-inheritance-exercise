package com.coderscampus.base;

public class User {
    private String username;
    private String password;
    private String name;
    private Boolean readAccess;
    private Boolean writeAccess;
    private Boolean superUser;

    public User() {
        this.readAccess = true;
        this.writeAccess = false;
        this.superUser = false;

//    System.out.println("User");



    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getReadAccess() {
        System.out.println("- Read Access is granted");
        return readAccess;
    }

    public void setReadAccess(Boolean readAccess) {
        this.readAccess = readAccess;
    }

    public Boolean getWriteAccess() {
        System.out.println("- Write Access is denied");
        return writeAccess;
    }

    public void setWriteAccess(Boolean writeAccess) {
        this.writeAccess = writeAccess;
    }

    public Boolean getSuperUser() {
        System.out.println("- Super User Access is denied");
        return superUser;
    }

    public void setSuperUser(Boolean superUser) {
        this.superUser = superUser;
    }
}
