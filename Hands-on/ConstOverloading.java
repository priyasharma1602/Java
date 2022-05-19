package corejava;

public class ConstOverloading {
	int id;
	String name;
    

	public ConstOverloading(int id,String name) {
		this.id = id;
	       this.name = name;
	    }
	     ConstOverloading(String name) {
	           this.name = name;
	       }
	    
	    public static void main(String[] args) {
	    	ConstOverloading obj=new ConstOverloading(136, "Priya "); 
	    	ConstOverloading abc=new ConstOverloading("Priya"); 
	        System.out.println("ID:"+ obj.id +"\t"+ "NAME:"+obj.name);
	        System.out.println("Name:"+abc.name);
	}

}
