package com.company;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("########################## task 1 ##################################");
        System.out.println();
        String s = " Offer     your  top      candidates      take-home    projects to generate deeper\n " +
                "insight as     a   final step    in the   interview    process. Create your own\n " +
                "real-world    assignments       that you    can    view, run,   and analyze   on the\n " +
                "web via    our integration                with      GitHub.";

        System.out.println(s);
        System.out.println();

        String s1 = s.replaceAll(" +", " ");
        System.out.println(s1);
        System.out.println();
        System.out.println("################################### task 2 #####################################");
        System.out.println();

        String s2 = " Offer $1243.56767465    your  top $123.5465     candidates      take-home    projects to generate deeper\n " +
                "insight as     a   final step    in the $1223443.57465  interview    process. Create your own\n " +
                "real-world    assignments     $3.565  that you    can    view, run,   and analyze   on the\n " +
                "web via    our integration  $18793.561113365        with      GitHub.";

        Pattern p = Pattern.compile("\\$([1-9][0-9]*|0)*([.]\\d{2})?");
        Matcher m = p.matcher(s2);

        while (m.find()){
            System.out.print(s2.substring(m.start(), m.end()) + "\n");
        }
    }
}
