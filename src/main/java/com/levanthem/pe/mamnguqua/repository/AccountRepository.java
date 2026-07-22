package com.levanthem.pe.mamnguqua.repository;

import com.levanthem.pe.mamnguqua.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByEmail(String email);
}