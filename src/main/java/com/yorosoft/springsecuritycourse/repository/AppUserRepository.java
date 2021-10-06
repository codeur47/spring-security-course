package com.yorosoft.springsecuritycourse.repository;

import com.yorosoft.springsecuritycourse.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findAppUserByUsername(String username);
}
