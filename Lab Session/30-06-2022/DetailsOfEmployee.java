package corejava;

class DetailsOfEmployee 
{ 
	//Creating an attributes
    private long employeeId,employeephone; 
    private String employeeName,employeeAddress; 
    private double basicSalary,specialAllowance,Hra;
//Create a class Employee with the following instance variables
    DetailsOfEmployee() 
    {
    
        employeeId = 0; 
        employeephone = 0; 
        employeeName = ""; 
        employeeAddress=""; 
        basicSalary=0.0; 
        specialAllowance=250.00; 
        Hra = 1000.50; 
    } 
    //Create an overloaded constructor in the employee class
    DetailsOfEmployee(long id,String n,String a,long p,double s) 
    {
        employeeId = id; 
        employeephone = p; 
        employeeName = n; 
        employeeAddress=a; 
        basicSalary=s; 
        specialAllowance=250.00; 
        Hra = 1000.50; 
    }

    public double getBasicSalary()
    {
        return basicSalary;
    }
// Create a method calculateSalary 
    public double calculateSalary()
    {
        double salary = basicSalary+(basicSalary*specialAllowance*0.01)+(basicSalary* Hra/100);
        return salary;
    }

    public double calculateTransportAllowance()
    {
        return 0.01*basicSalary;
    }
}