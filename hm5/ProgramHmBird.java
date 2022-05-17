package hm5;

public class ProgramHmBird {
public static void main(String[] args) {
	Eagle eagle1 = new Eagle();
	Swallow swallow1 = new Swallow();
	Penguin penguin1 = new Penguin();
	Kiwi kiwi1 = new Kiwi();
	
Bird[] birds = {
		eagle1, swallow1, penguin1, kiwi1
		
};
for(Bird bird: birds) {
	System.out.println(bird.toString());
	bird.fly();
}
}
}
