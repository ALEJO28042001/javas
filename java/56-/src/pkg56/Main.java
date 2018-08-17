
package pkg56;


import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int[] A=new int [5];
        int[] B=new int [5];
        int x=0;
        
        System.out.println("ingrese el numero base");
	x= entrada.nextInt();
	for (int i=0;i<5;i++)
	{
		x=x++;
		A[i]=x++;
	}
	for (int i=0;i<5;i++)
	{
		B[i]=A[i];
	}
	for (int i=0;i<5;i++)
	{
            System.out.print(A[i]+" ");
	}
	       System.out.println("");
	for (int i=0;i<5;i++)
	{
            System.out.print(B[i]+ " ");
	}
        System.out.println("");   
        
    }
    
}
