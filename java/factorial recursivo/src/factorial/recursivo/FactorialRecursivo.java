/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.recursivo;

/**
 *
 * @author PROFESIONAL
 */
import java.util.Scanner;
public class FactorialRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("digite un numero: ");
        int n=sc.nextInt();
        int factorial=factorialrecursivo(n);
        System.out.println("el factorial es:"+factorial);
    }
    public static int factorialrecursivo(int numero){
        int res;
        if (numero==1){
           return 1; 
        }else{
            res=numero*factorialrecursivo(numero-1);
        }
        return res;
    }
}
