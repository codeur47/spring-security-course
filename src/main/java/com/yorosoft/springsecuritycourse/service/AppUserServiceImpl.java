package com.yorosoft.springsecuritycourse.service;

import com.yorosoft.springsecuritycourse.model.AppUser;
import com.yorosoft.springsecuritycourse.model.Role;
import com.yorosoft.springsecuritycourse.repository.AppUserRepository;
import com.yorosoft.springsecuritycourse.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class AppUserServiceImpl implements AppUserService{

    private final AppUserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public AppUser saveAppUser(AppUser user) {
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToAppUser(String username, String roleName) {
        AppUser user = userRepository.findAppUserByUsername(username);
        Role role = roleRepository.findRoleByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public AppUser getUser(String username) {
        return userRepository.findAppUserByUsername(username);
    }

    @Override
    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }
}
