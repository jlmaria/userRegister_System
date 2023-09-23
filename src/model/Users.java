package model;

public class Users {

    //private int id;
    private String usr_name;
    private String password;
    private String name;
    private String email;
    //private String last_session;
    private int id_type;

    /**public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    public String getUser() {
        return usr_name;
    }

    public void setUser(String usr_name) {
        this.usr_name = usr_name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**public String getLast_session() {
        return last_session;
    }

    public void setLast_session(String last_session) {
        this.last_session = last_session;
    }*/

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

}