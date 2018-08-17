/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg56.vectores;

/**
 *
 * @author PROFESIONAL
 */
import java.util.Scanner;
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a[]=new int[5];
      int b[]=new int[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("ingrese numero base: ");
      int x=sc.nextInt();
      for(int i=0;i<5;i++){
          x=x++;
          a[i]=x++;
      }
      for(int i=0;i<5;i++){
          b[i]=a[i];
      }
      for(int i=0;i<5;i++){
          System.out.print(a[i]+"\t");
      }
      System.out.println("\n");
      for(int i=0;i<5;i++){
          System.out.print(b[i]+"\t");
      }
    }
    
}
