package com.coderscampus.base;

public class NormalUser extends User {

    private String username;
    private String password;
    private String name;
    private Boolean readAccess;
    private Boolean writeAccess;
    private Boolean superUser;

    public NormalUser(){

  //      System.out.println("Normal User");
        this.readAccess = true;
        this.writeAccess = true;
        this.superUser = false;

    }

    public Boolean getReadAccess() {
        System.out.println("- Read Access is granted");
        return readAccess;
    }

    public void setReadAccess(Boolean readAccess) {
        this.readAccess = readAccess;
    }

    public Boolean getWriteAccess() {
        System.out.println("- Write Access is granted");
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
