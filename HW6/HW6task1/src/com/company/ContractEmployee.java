package com.company;

public class ContractEmployee extends Employee implements Payment{
    private int fixedMonthlyPayment;
    private String federalTaxIdmember;

    public ContractEmployee(String employeeId , String name , String federalTaxIdmember, int fixedMonthlyPayment) {
        super(employeeId , name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return getFixedMonthlyPayment();
    }
}
