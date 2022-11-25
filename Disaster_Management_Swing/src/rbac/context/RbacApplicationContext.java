/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rbac.context;

import rbac.application.user.User;
import rbac.role.Role;

/**
 *
 * @author rohitpanicker
 */
public class RbacApplicationContext {
    private static RbacApplicationContext rbacApplicationContext = null;
     private Role roleContext = null ;
     private User user = null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    private RbacApplicationContext()
    {
       
    }
    
    public static RbacApplicationContext getInstance() 
    { 
        if (rbacApplicationContext == null) 
            rbacApplicationContext = new RbacApplicationContext(); 
  
        return rbacApplicationContext; 
    } 
   

    public Role getRoleContext() {
        return roleContext;
    }

    public void setRoleContext(Role role) {
        this.roleContext = role;
    }

   
    
}
