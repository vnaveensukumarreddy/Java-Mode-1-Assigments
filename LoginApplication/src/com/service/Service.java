package com.service;

import java.util.List;
import java.util.Scanner;

import com.pojo.UserLogin;

public interface  Service {
 
 public String userPassword();
 public String confirmUserPassword(String userPassword);
 public boolean signInService(String userEmail,String userPassword,List<UserLogin> userLogins);
}
