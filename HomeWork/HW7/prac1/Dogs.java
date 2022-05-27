package HW7.prac1;


public class Dogs implements Animals {
	   private String name;

	    public Dogs(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @Override
	    public void voice() {
	        System.out.println(getName()+ "  Dog make voice Haw!");
	    }

	    @Override
	    public void feed() {
	        System.out.println(getName()+ "  Dog is eating");
	    }
	}