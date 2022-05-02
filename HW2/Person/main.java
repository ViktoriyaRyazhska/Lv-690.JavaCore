package Person;

public class main {
    public static void main(String[] args) {

        person user1 = new person("Mark","Lenigan");
        user1.SetYear(1978);
        person user2 = new person("Peter","Steel");
        user2.SetYear(1963);
        person user3 = new person("Mikael","Akerfeld");
        user3.SetYear(1974);
        person user4 = new person("Aron","Turner");
        user4.SetYear(1977);

        person[] personArayys = {user1,user2,user3,user4};

        for(int i = 0;i<personArayys.length;i++)
        {
            System.out.println("----------");
            System.out.println(personArayys[i]);

        }

        System.out.println("----------");
        user4.nameChange("Kate","Winslet");
        System.out.println(user4);










    }
}
