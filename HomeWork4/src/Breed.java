public enum Breed {
    LAB("L"), SHEPPARD("S"), DOBERMAN("D");

    Breed (String abbreviation){
        this.abbreviation= abbreviation;
    }
    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }
}
