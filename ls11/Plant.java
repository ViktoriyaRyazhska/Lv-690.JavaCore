package ls11;

public class Plant {
	private Type type;
	private Color color;
	int size;

	public Plant(String type, String color, int size) throws ColorException, TypeException {
		Color c = colorStrToEnum(color);
		Type t = typeStrToEnum(type);
		this.type = t;
		this.color = c;
		this.size = size;
	}

	private Color colorStrToEnum(String color) throws ColorException {	
		switch (color.toLowerCase()) {
		case "blue":
			return Color.Blue;
		case "red":
			return Color.Red;
		case "white":
			return Color.White;
		default:
			throw new ColorException("Input only color blue, red or white");
		}

	}

	

	private Type typeStrToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "daisies":
			return Type.Daisies;
		case "lily":
			return Type.Lily;
		case "rose":
			return Type.Rose;
		default:
			throw new TypeException("Input only type rose, lily or daisies");

		}
	}

	@Override
	public String toString() {
		return "Plant [type=" + type + ", color=" + color + ", size=" + size + "]";
	}
}
