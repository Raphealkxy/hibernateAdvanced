package com.timmy.advanced;

import java.util.HashSet;
import java.util.Set;

public class Role {
       private int rid;
       private String rolename;
       private Set<User> users=new HashSet<User>();
       
       
       
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
       
}
