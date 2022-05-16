package corejava;

public class EncapsTwo {

	public static void main(String[] args) {
		
		//Creating objects of encapsOn
		EncapsOne en = new EncapsOne();
		
		en.setId(101);
		en.setName("Priya");
		en.setAddress("Mumbai,3 street,LBS Marg");
		
		System.out.println("Id: "+en.getId());
		System.out.println("Name: "+en.getName());
		System.out.println("Adress: "+en.getAddress());
		
		
	}

}