////3.Create method to validate date according to format"mm.dd.yy".
//
//
//package HomeWork;
//
//import java.time.DateTimeException;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.format.ResolverStyle;
//
//public class HW3 {
//    public static void main(String[] args) {
//     final   String data="10.10.10";
////        dateValidate(data);
//        System.out.println(dateValidate(data));
//
//    }
//
//    public static boolean dateValidate(final String data) {
//      boolean valid =false;
//
//      try {
//          LocalDate.parse(data, DateTimeFormatter.ofPattern("mm.dd.yy").withResolverStyle(ResolverStyle.STRICT));
//          valid =true;
//      }catch (DateTimeException e){
//          e.printStackTrace();
//          valid=false;
//      }
//      return valid;
//    }
//}
