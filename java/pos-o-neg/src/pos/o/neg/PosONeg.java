/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.o.neg;

/**
 *
 * @author PROFESIONAL
 */
import java.util.Scanner;
public class PosONeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i=0,neg=0,zero=0,pos=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("digite cantidad de enteros a analizar");
        n=sc.nextInt();
        while(i<n){
            System.out.println("digite valor a analizar");
            int num=sc.nextInt();
            if(num>0){
                System.out.println("es positivo");
                pos++;
            }else{
                if(num<0){
                    System.out.println("es negativo");
                    neg++;
                }else{
                    System.out.println("es cero");
                    zero++;
                }
            }
            i++;
        }
        System.out.println("la cantidad de numeros positivos es:\t"+pos);
        System.out.println("la cantidad de numeros negativos es:\t"+neg);
        System.out.println("la cantidad de ceros es:\t"+zero);
    }
    
}
