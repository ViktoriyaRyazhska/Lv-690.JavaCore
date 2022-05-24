package Homework93;

public class NameComparator implements java.util.Comparator {
	private int sortBy;  //0 - sort by name/course, 1 - sort course/name

	public NameComparator(int sortBy) {
		this.sortBy = sortBy;
	}

	public int getSortBy() {
		return sortBy;
	}

	public void setSortBy(int sortBy) {
		this.sortBy = sortBy;
	}

	@Override
	public int compare(Object o1, Object o2) {
		Student s1= (Student) o1;
		Student s2= (Student) o2;
		if (sortBy==1) { 
			if (s1.getCourse()>s2.getCourse()) {return 1;}
			if (s1.getCourse()<s2.getCourse()) {return -1;}		
			int result = s1.getName().compareTo(s2.getName());
			return result;
		}
		else {
			int result = s1.getName().compareTo(s2.getName());
			if (result!=0) {
				return result;
			}
			else {
				if (s1.getCourse()>s2.getCourse()) {return 1;}
				if (s1.getCourse()<s2.getCourse()) {return -1;}				
			}
				
			
		}
		return 0;
	}

}
