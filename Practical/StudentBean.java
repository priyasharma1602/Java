package corejava;

public class StudentBean
{
		private int id;
		private String name;
		private boolean active;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isActive() {
			return active;
		}

		public void setActive(boolean active) {
			this.active = active;
		}
		
		public static void main(String [] args) {
			
			StudentBean  student = new StudentBean();

			//setting bean values
			student.setId(101);
			student.setName("PRIYA");
			student.setActive(true);
			//getting bean value
			System.out.println("Student Id     : "+student.getId());
			System.out.println("Student name   : "+student.getName());
			System.out.println("Student active : "+student.isActive());

		}
}
