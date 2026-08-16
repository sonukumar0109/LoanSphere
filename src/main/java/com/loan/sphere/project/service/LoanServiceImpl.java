package com.loan.sphere.project.service;

import com.loan.sphere.project.dto.CreateLoanRequest;
import com.loan.sphere.project.dto.LoanResponse;
import com.loan.sphere.project.entity.LoanApplication;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class LoanServiceImpl implements LoanService{

    private final AtomicLong idGenerator = new AtomicLong(1000);

    @Override
    public LoanResponse createLoan(CreateLoanRequest request) {
        Long loanId = idGenerator.incrementAndGet();

        LoanApplication loan = new LoanApplication(
                loanId,
                request.getCustomerId(),
                request.getLoanType(),
                request.getAmount(),
                request.getTenure(),
                "DRAFT"
        );
        return new LoanResponse(
                loan.getId(),
                loan.getCustomerId(),
                loan.getLoanType(),
                loan.getAmount(),
                loan.getTenure(),
                loan.getStatus()
        );
    }

    @Override
    public LoanApplication getLoan(Long id) {
        return null;
    }
}
