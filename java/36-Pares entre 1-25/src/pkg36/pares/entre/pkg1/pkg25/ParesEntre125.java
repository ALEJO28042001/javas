/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg36.pares.entre.pkg1.pkg25;

/**
 *
 * @author alexh
 */
public class ParesEntre125 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i =1, a;
        do{
            a=i%2;
            if (a!=0){
                i++;
            }
            else{
                System.out.println(i);
                i++;
            }
        }
        while (i<26);
        // TODO code application logic here
    }
    
}
