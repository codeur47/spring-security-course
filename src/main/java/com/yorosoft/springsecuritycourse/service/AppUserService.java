package com.yorosoft.springsecuritycourse.service;

import com.yorosoft.springsecuritycourse.model.AppUser;
import com.yorosoft.springsecuritycourse.model.Role;

import java.util.List;

public interface AppUserService {
    AppUser saveAppUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToAppUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
