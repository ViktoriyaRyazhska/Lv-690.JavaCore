package hm7;

public class WrapperMain {

public static void main(String[] args) {
		
		Wrapper<Integer> WrapInt=new Wrapper<>(55);
        Wrapper<String> WrapStr=new Wrapper<>("Stepan Gigabyte");
        Wrapper<Boolean> WrapBoolean=new Wrapper<>(false);
        
        
        
        System.out.println(WrapInt.getValue());
        System.out.println(WrapStr.getValue());
        System.out.println(WrapBoolean.getValue());
	}
	}
	

