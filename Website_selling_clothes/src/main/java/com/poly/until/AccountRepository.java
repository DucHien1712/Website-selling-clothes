package com.poly.until;



import org.springframework.data.jpa.repository.JpaRepository;
import com.poly.mode.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, String> {
}

