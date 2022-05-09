package homework3;

public class Methods {
	Enumbreed br1=Enumbreed.Affenpinscher;
	Enumbreed br2=Enumbreed.Beagle;
	Enumbreed br3=Enumbreed.Sloughi;
	Dog pes1=new Dog("Bobik","Streetpes",3);
	Dog pes2=new Dog("Marsik","Hotdog",20);
	Dog pes3=new Dog("Rex","Colddog",5);
	
	public void getBreeds() {
	
	}
	
	public void oldDog() {
		if (pes1.age>pes2.age && pes1.age>pes3.age) {
			System.out.println(pes1.name+" the oldest dog");
			}else {
				if (pes2.age>pes1.age && pes2.age>pes3.age) {
				System.out.println(pes2.name+" the oldest dog");	
					}else {
						if (pes3.age>pes1.age && pes3.age>pes2.age) {
						System.out.println(pes3.name+" the oldest dog");	
						}
					}
			}
	}
	public void checkName() {
		if(pes1.name==pes2.name || pes2.name==pes3.name || pes1.name==pes3.name) {
			System.out.println("Identical name");	
			}else {
				System.out.println("Not the same name");
		}
	
	}
}

