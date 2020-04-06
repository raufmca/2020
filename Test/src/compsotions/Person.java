package compsotions;

public class Person {

	// composition has-a relationship
	
	private Job job;
	
	
	public Person() {
		this.job = new Job();
		job.setSalary(145300);
		
	}
	
	public long getSalary() {
		return job.getSalary();
	}
}
