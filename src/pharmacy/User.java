/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

/**
 *
 * @author Shazly
 */
public class User {
    
    public int id;
    public String name;
    public String username;
    public String password;
    public boolean isAdmin;

    public User(int id, String name, String username, String password) {
        this.id=id;
        this.name = name;
        this.username = username;
        this.password = password;
        isAdmin = false;
    }

    boolean login(String username, String password)
    {
     return (username == this.username && password == this.password);   
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    
    
    
    
    
}
