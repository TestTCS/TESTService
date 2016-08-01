package com.afzal.javaapi;

import java.util.ArrayList;
import java.util.List;


public class UserDao {
	
	public List<User> getAllUsers(){
	      List<User> userList = null;
	      try {
	         
	            User user = new User(1, "Mahesh", "Teacher");
	            userList = new ArrayList<User>();
	            userList.add(user);
	            
	             user = new User(2, "Mahesh 2", "Teacher 2");
	             userList.add(user);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      return userList;
	   }

}
