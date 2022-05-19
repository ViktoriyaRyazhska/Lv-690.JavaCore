package ls6.Homework6;

public class FlyingBird extends Bird{
		private boolean migratory;
		private String habitat;

		public FlyingBird(String feathers, int layEggs, String habitat, boolean migratory) {
			super(feathers, layEggs);
			this.habitat = habitat;
			this.migratory = migratory;
		}

		public boolean isMigratory() {
			return migratory;
		}

		public void setMigratory(boolean migratory) {
			this.migratory = migratory;
		}

		public String getHabitat() {
			return habitat;
		}

		public void setHabitat(String habitat) {
			this.habitat = habitat;
		}

	@Override
	void fly() {
		System.out.println("I want fly");
		
	}
	

}
