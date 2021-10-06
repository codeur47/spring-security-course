package com.yorosoft.springsecuritycourse.repository;

import com.yorosoft.springsecuritycourse.model.AppUser;
import com.yorosoft.springsecuritycourse.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findRoleByName(String name);
}
