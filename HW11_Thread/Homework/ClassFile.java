package HW11_Threads;

import java.io.*;
import java.util.ArrayList;

public class ClassFile {
    public static ArrayList <String> readFileToArray(String fileName){

        ArrayList<String> arrayList = null;

        try {
            String line = null;
            arrayList = new ArrayList<String>();
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                arrayList.add(line);
            }
            br.close();

        } catch (FileNotFoundException exception) {
            System.err.println(exception.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        return arrayList;

    }

    public static void toDOPracticeTask(ArrayList <String> arrayList, String findWord){
        int longestLine = 0;
        int shortestLine = Integer.MAX_VALUE;
        String longestLineStr = "";
        String shortestLineStr = "";

        for (String elem : arrayList) {
            //1 count and write the number of symbols in every line
            System.out.println("number of symbols: " + elem.length());
            //2 longestLine and shortestLine
            if (longestLine<elem.length()){
                longestLine = elem.length();
                longestLineStr = elem;
            }
            if (shortestLine>elem.length()){
                shortestLine = elem.length();
                shortestLineStr = elem;
            }
            //3 find and write
            if (elem.contains(findWord)){
                System.out.println(elem);
            }
        }
        System.out.println("longest Line: " + longestLineStr+"("+longestLine+")");
        System.out.println("shortestLine: " + shortestLineStr+"("+shortestLine+")");

    }

    public static void createFile( String fileName){

        String cv = "My name is Yevhen Serdiuk.\n"+
                "My birthday date is 28/10/1983.\n"+
                "I'm studying Java on the Java CORE course.";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(cv);
            bw.close();
            System.out.println("file was wrote successfully");
        } catch (FileNotFoundException exception) {
            System.err.println(exception.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    public static void toDOHomeWork(ArrayList <String> arrayList, String fileName) {

        ArrayList <String> arrayListForRecord = arrayListForRecord(arrayList);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            for (String elem:arrayListForRecord) {
                bw.write(elem);
            }
            bw.close();
            System.out.println("file was wrote successfully");
        } catch (FileNotFoundException exception) {
            System.err.println(exception.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static ArrayList<String> arrayListForRecord(ArrayList<String> arrayList) {

        ArrayList<String> arrayListForRecord = new ArrayList<>();
        int longestLine = 0;
        String longestLineStr="";
        //1
        arrayListForRecord.add("number of lines: "+arrayList.size()+"\n");

        for (String elem : arrayList) {
            //2 longestLine and shortestLine
            if (longestLine<elem.length()){
                longestLine = elem.length();
                longestLineStr = elem;
            }
            //3 find and write
            if (elem.contains("name")){
                arrayListForRecord.add(elem+"\n");
            }
            if (elem.contains("birthday")){
                arrayListForRecord.add(elem+"\n");
            }
        }
        arrayListForRecord.add("the longest line: "+longestLineStr+"\n");

        return  arrayListForRecord;
    }
}

