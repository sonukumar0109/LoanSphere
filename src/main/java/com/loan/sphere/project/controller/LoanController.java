package com.loan.sphere.project.controller;

import com.loan.sphere.project.dto.CreateLoanRequest;
import com.loan.sphere.project.dto.LoanResponse;
import com.loan.sphere.project.entity.LoanApplication;
import com.loan.sphere.project.repo.LoanRepository;
import com.loan.sphere.project.service.LoanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService, LoanRepository loanRepository) {
        this.loanService = loanService;
    }

    @PostMapping("/create")
    ResponseEntity<LoanResponse> createLoan(@RequestBody CreateLoanRequest createLoanRequest) {
        LoanResponse response = loanService.createLoan(createLoanRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/get/{id}")
    ResponseEntity<String> getLoan(@PathVariable Long id) {
        LoanApplication loanApplication = loanService.getLoan(id);
        if(loanApplication!=null){
            return ResponseEntity.ok("Data fetched successfully");
        }
        return new ResponseEntity<>("Data not Found",HttpStatus.NOT_FOUND);
    }
}
