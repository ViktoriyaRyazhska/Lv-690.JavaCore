package work5.task1;

public class Demonstrating {

	public static void main(String[] args) {
		String[] col1= {"black", "brown", "white"};
		String[] col2= {"black", "blue", "white"};
		String[] col3= {"black", "white"};
		String[] col4= {"grey", "white"};
		
		Bird[] bird=new Bird[4];
		bird[0] = new Eagle(col1,5);
		bird[1] = new Swallow(col2,12);
		bird[2] = new Penguin(col3,11);
		bird[3] = new Chicken(col4,31);
		
		for(int i=0;i<bird.length;i++) {
			bird[i].fly();
		}
		for(int i=0;i<bird.length;i++) {
			System.out.println(bird[i]);
		}
	}

}
