package HW7.task1;


public class SalariedEmployee extends Employee implements Payment {
    private String name;
   private int socialSecurityNumber;
   private int paymentForHour;
   private int hour;

    public SalariedEmployee(String employeeID,String name,int socialSecurityNumber,int hour,int paymentForHour) {
        super(employeeID);
        this.socialSecurityNumber=socialSecurityNumber;
        this.hour=hour;
        this.paymentForHour=paymentForHour;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getPaymentForHour() {
        return paymentForHour;
    }

    public void setPaymentForHour(int paymentForHour) {
        this.paymentForHour = paymentForHour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public int calculatePay(){
        return getHour()*getPaymentForHour();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber=" + socialSecurityNumber +
                ", paymentForHour=" + paymentForHour +
                ", hour=" + hour +" Salary:  "+calculatePay()+
                '}';
    }
   }