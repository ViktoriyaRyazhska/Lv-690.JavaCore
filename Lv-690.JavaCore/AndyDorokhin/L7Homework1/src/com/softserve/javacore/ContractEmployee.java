package com.softserve.javacore;

public class ContractEmployee extends Employee{
    private String federalTaxIdmember;
    private double hourlyRate;
    private int billedHours;

    public ContractEmployee() {}

    public ContractEmployee(String name, String employeeld, String federalTaxIdmember, double hourlyRate, int billedHours) {
        super(name, employeeld);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.billedHours = billedHours;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getBilledHours() {
        return billedHours;
    }

    public void setBilledHours(int billedHours) {
        this.billedHours = billedHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ContractEmployee that = (ContractEmployee) o;

        if (Double.compare(that.hourlyRate, hourlyRate) != 0) return false;
        if (billedHours != that.billedHours) return false;
        return federalTaxIdmember != null ? federalTaxIdmember.equals(that.federalTaxIdmember) : that.federalTaxIdmember == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (federalTaxIdmember != null ? federalTaxIdmember.hashCode() : 0);
        temp = Double.doubleToLongBits(hourlyRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + billedHours;
        return result;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", billedHours=" + billedHours +
                "} " + super.toString();
    }

    @Override
    public double calculatePay() {
        return hourlyRate * billedHours;
    }
}
