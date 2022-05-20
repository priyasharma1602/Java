package corejava;

//Java Program to illustrate how to declare, instantiate, initialize  

//and traverse the Java array.  

class SingleDimensionArray{  

public static void main(String args[]){  

int a[]=new int[6];//declaration and instantiation  

a[0]=20;//initialization  

a[1]=25;  

a[2]=30;  

a[3]=35;  

a[4]=40;

a[5]=45;

//traversing array  

for(int i=0;i<a.length;i++)//length is the property of array  

System.out.println(a[i]);  
}
}