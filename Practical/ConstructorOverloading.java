package corejava;

class ConstructOverloading {
    String name;
    double gpa;



    ConstructOverloading(String name, double gpa) {
       
       this.name = name;
       this.gpa = gpa;
    }
     ConstructOverloading(String name) {
           this.name = name;
       }
    
    public static void main(String[] args) {
        ConstructOverloading obj=new ConstructOverloading("Priya ", 9.8); 
        ConstructOverloading abc=new ConstructOverloading("Priya"); 
        System.out.println("Name:"+ obj.name +"\t"+ "Gpa:"+obj.gpa);
        System.out.println("Name:"+abc.name);



   }

}
