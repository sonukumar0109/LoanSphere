package com.loan.sphere.project.dto;

public class LoanResponse {
    private Long loanId;
    private Long customerId;
    private String loanType;
    private Double amount;
    private Integer tenure;
    private String status;

    public LoanResponse(Long loanId, Long customerId, String loanType,
                        Double amount, Integer tenure, String status) {
        this.loanId = loanId;
        this.customerId = customerId;
        this.loanType = loanType;
        this.amount = amount;
        this.tenure = tenure;
        this.status = status;
    }

    public Long getLoanId() {
        return loanId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getLoanType() {
        return loanType;
    }

    public Double getAmount() {
        return amount;
    }

    public Integer getTenure() {
        return tenure;
    }

    public String getStatus() {
        return status;
    }
}
