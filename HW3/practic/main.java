package practic;

public class main {

    public static void main(String[] args) {

        int num1 = 13;
        int num2 = 34;
        int num3 = 41;


        OddNumber(num1, num2, num3);

        DayOfTheWeek(2);

        Country("Spain");


    }

    public static void OddNumber(int num1, int num2, int num3) {

        int[] numArra = new int[3];
        numArra[0] = num1;
        numArra[1] = num2;
        numArra[2] = num3;
        for (int i = 0; i < numArra.length; i++) {
            if (numArra[i] % 2 != 0) {
                System.out.println(numArra[i] + " is odd number");
            } else {
                System.out.println(numArra[i] + " is even number");
            }
        }
    }

    public static void DayOfTheWeek(int day) {

        switch (day) {
            case 1:
                System.out.println("Понеділок,Monday,Poniedziałek");
                break;
            case 2:
                System.out.println("Вівторок,Tuesday,Wtorek");
                break;
            case 3:
                System.out.println("Середа,Wednesday,Środa");
                break;
            case 4:
                System.out.println("Четвер,Thursday,Czwartek");
                break;
            case 5:
                System.out.println("Пятниця,Friday,Piątek");
                break;
            case 6:
                System.out.println("Субота,Saturday,Sobota");
                break;
            case 7:
                System.out.println("Неділя,Sunday,Niedziela");
                break;
            default:
                System.out.println("Wrong number");

        }

    }

    public static void Country(String count) {
        allContinent continent = null;

        switch (count) {
            case "Paris":
            case "Germany":
            case "Spain":
                continent = allContinent.EUROPE;
                break;
            case "Argentina":
            case "Brazil":
            case "Columbia":
                continent = allContinent.SOUTH_AMERICA;
                break;
            case "Japan":
            case "China":
            case "Turkey":
                continent = allContinent.ASIA;
                break;
            case "Nigeria":
            case "Egypt":
            case "Tanzania":
                continent = allContinent.AFRICA;
                break;
            case "Australia":
            case "New zealand":
            case "Fiji":
                continent = allContinent.AUSTRALIA;
                break;
            case "United States":
            case "Canada":
            case "Mexico":
                continent = allContinent.NORTH_AMERICA;
                break;
            default:
                System.out.println("Wrong input");

        }
        System.out.println(continent);
    }

    public enum allContinent {
        NORTH_AMERICA, SOUTH_AMERICA, EUROPE, ASIA, AFRICA, AUSTRALIA;

    }


}
