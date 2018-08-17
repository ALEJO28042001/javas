/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcion.potencia;

/**
 *
 * @author PROFESIONAL
 */
import java.util.Scanner;
public class FuncionPotencia {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("digite base: ");
        int x=sc.nextInt();
        System.out.println("digite base: ");
        int y=sc.nextInt();
        int resultado=potencia(x,y);
        System.out.println(x+" elevado a "+y+" es:"+resultado);
        
    }
    public static int potencia( int x, int y){
        
        if (y==1){
            return x;
        }else{
            return x*potencia(x,y-1);
        }
    }
}
