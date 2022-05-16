package homework3;

public class Methods {
	Dog pes1 = new Dog("Bobik",Enumbreed.Affenpinscher,3);
	Dog pes2 = new Dog("Marsik",Enumbreed.Beagle,20);
	Dog pes3 = new Dog("Rex",Enumbreed.Sloughi,5);
	
	public void getBreeds() {
	
	}
	
	public void oldDog() {
		if (pes1.getAge()>pes2.getAge() && pes1.getAge()>pes3.getAge()) {
			System.out.println(pes1.getAge()+" the oldest dog");
			}else {
				if (pes2.getAge()>pes1.getAge() && pes2.getAge()>pes3.getAge()) {
				System.out.println(pes2.getAge()+" the oldest dog");	
					}else {
						if (pes3.getAge()>pes1.getAge() && pes3.getAge()>pes2.getAge()) {
						System.out.println(pes3.getAge()+" the oldest dog");	
						}
					}
			}
	}
	public void checkName() {
		if(pes1.getAge()==pes2.getAge() || pes2.getAge()==pes3.getAge() || pes1.getAge()==pes3.getAge()) {
			System.out.println("Identical name");	
			}else {
				System.out.println("Not the same name");
		}
		
	}
}

