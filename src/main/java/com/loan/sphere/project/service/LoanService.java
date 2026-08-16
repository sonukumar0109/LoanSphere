package com.loan.sphere.project.service;

import com.loan.sphere.project.dto.CreateLoanRequest;
import com.loan.sphere.project.dto.LoanResponse;
import com.loan.sphere.project.entity.LoanApplication;

public interface LoanService {
    LoanResponse createLoan(CreateLoanRequest request);
    LoanApplication getLoan(Long id);
}
