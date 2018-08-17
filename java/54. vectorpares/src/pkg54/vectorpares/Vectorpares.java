/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg54.vectorpares;

/**
 *
 * @author PROFESIONAL
 */
import java.util.Scanner;
public class Vectorpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int pares=0;
        int j=0;
        for(int i=1;i<101;i++){
            a=i%2;
            if(a==0){
                pares++;
            }
        }
        int m1[]=new int[pares];
        for(int i=1;i<101;i++){
            a=i%2;
            if(a==0){
                m1[j]=i;
                j++;
            }
        }
        for(j=0;j<pares;j++){
            System.out.print(m1[j]+"\t");
        }
    }
    
}
