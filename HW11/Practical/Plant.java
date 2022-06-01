package Practical;

import Practical.Main.Colors;
import Practical.Main.Types;

public class Plant {
	 int size; 
	 Colors color;
	 Types type;
	 
	public Plant(int size, String colorStr, String typeStr) throws ColorException,TypeException, ColorTypeException {
		this.size = size;
		int exp=0;
		
		try {
			this.color = StrToColor(colorStr);
		} catch (ColorException e1) {
			exp=1;			
		}
		try {
			this.type = StrToType(typeStr);
		} catch (TypeException e2) {
			exp = exp+2;
		}
		switch (exp) {
			case 1: throw new ColorException();
        	case 2: throw new TypeException();
        	case 3: throw new ColorTypeException();
		}
	}

	

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}



	private Colors StrToColor(String colorStr) throws ColorException {
		 switch (colorStr) {
	        case "red": return Colors.red;
	        case "blue": return Colors.blue;
	        case "green": return Colors.green;
		 }
		 throw new ColorException();
	}
	
	private Types StrToType(String typeStr)  throws TypeException {
		 switch (typeStr) {
	        case "type1": return Types.type1;
	        case "type2": return Types.type2;
	        case "type3": return Types.type3;
		 }
		 throw new TypeException();
	}
	
	 
}
