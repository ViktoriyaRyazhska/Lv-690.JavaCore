package Homework.lesson5;

public enum CarType {
    CABRIO ("Convertible roof"), COUPE ("Two doors"), SEDAN ("Four doors"), SUV ("Sport Utility Vehicle"),
    WAGON ("Similar to sedan, but have an extended roofline"), FREIGHTLINER ("Super cool old school truck"),
    SCANIA ("King of trucks");
    private String desc;
    CarType (String desc) {
        this.desc = desc;
    }
}

