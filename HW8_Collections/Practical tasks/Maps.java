package HW8_Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;



public class Maps {

    public static void main(String[] args) throws Exception {

        HashMap <Integer,String> employeeMap = returnMap();

        printMap(employeeMap);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputKey = insertID("insert ID:",br);

        if (employeeMap.containsKey(inputKey)) {
            System.out.println(employeeMap.get(inputKey));
        } else {
            System.err.println("invalid ID");
        }

        String inputValue = insertName("insert name:",br);

        if (employeeMap.containsValue(inputValue)) {
            for (HashMap.Entry<Integer, String> entry:employeeMap.entrySet())
            if (inputValue.equals(entry.getValue())){
                System.out.println("ID=" + entry.getKey());
            }
        } else {
            System.err.println("invalid name");
        }
    }

    public static HashMap <Integer,String> returnMap(){
        HashMap <Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(1,"Jack");
        employeeMap.put(2,"John");
        employeeMap.put(3,"Jimmy");
        employeeMap.put(4,"Jay");
        employeeMap.put(5,"Joan");
        employeeMap.put(6,"Jin");
        employeeMap.put(7,"Jolly");

        return employeeMap;
    }

    public static void printMap(HashMap <Integer,String> map){
        for (HashMap.Entry<Integer, String> entry:map.entrySet())
            System.out.println("ID=" + entry.getKey() + ", name=" + entry.getValue());
    }

    public static int insertID(String txt, BufferedReader br)throws IOException {
        System.out.println(txt);
        int input = Integer.parseInt(br.readLine());
        return input;
    }
    public static String insertName(String txt, BufferedReader br)throws IOException {
        System.out.println(txt);
        return br.readLine();
    }
}
