package com.ljh.projectboardadmin.repository;

import com.ljh.projectboardadmin.domain.AdminAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminAccountRepository extends JpaRepository<AdminAccount, String> {
}
