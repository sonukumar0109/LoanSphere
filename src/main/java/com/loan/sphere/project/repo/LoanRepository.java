package com.loan.sphere.project.repo;

import com.loan.sphere.project.entity.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoanRepository extends JpaRepository<LoanApplication,Long> {
    LoanApplication save(LoanApplication loanApp);
    Optional<LoanApplication>findById(long id);


}
