/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenusa;

/**
 *
 * @author PROFESIONAL
 */
import java.util.Scanner;
public class Hipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el valor del primer lado: ");
        a=sc.nextDouble();
        System.out.println("ingrese el valor del segundo lado: ");
        b=sc.nextDouble();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("el valor de la hipotenusa es:\t"+c);
    }
    
}
