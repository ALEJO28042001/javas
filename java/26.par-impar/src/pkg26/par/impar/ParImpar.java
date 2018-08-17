/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26.par.impar;

/**
 *
 * @author PROFESIONAL
 */
import java.util.Scanner;
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b; 
        System.out.println("ingrese numero a analizar");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=a%2;
        if(b==1){
            System.out.println("es impar");
        }else{
            System.out.println("es par");
        }
    }
    
}
