package com.pdaProjet.Service;

import com.sun.jmx.mbeanserver.Repository;

public class UserService {
    private RepoUser repoUser = new RepoUser();
    public int login(String email , String password){
          return  repoUser.login(email,password);
    }
}
