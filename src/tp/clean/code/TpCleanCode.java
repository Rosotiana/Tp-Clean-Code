/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.clean.code;

import java.util.Scanner;

/**
 *
 * @author Inclusiv-PC05
 */
public class TpCleanCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int [] entier = {};
         entier = tableauvaleur(entier);
         System.out.println("Liste des entiers ");
         affichage (entier);
         entier = triageCroissant(entier);
         System.out.println("par ordre croissant");
         affichage (entier);
         entier = triageDecroissant(entier);
         System.out.println("par ordre decroissant");
         affichage (entier);
    
}
    public static int [] tableauvaleur(int [] entier) {

        Scanner scan = new Scanner(System.in);

        int tailletableau;

        System.out.print("donner la taille du tableau : ");
        tailletableau = scan.nextInt();

        entier = new int[tailletableau];

        int a;

        for (int i = 0; i < tailletableau; i++) {
            System.out.print("n°: ");
            a = scan.nextInt();
        }
        return entier;
    }
    
    public static int [] triageCroissant (int[]entier){
        
        for (int i = 0; i < entier.length; i++) {
            
            
            for (int j = 0; j < entier.length-1; j++) {
                if(entier[j]>entier[j+1]){
                    int temp = entier[j];
                    entier[j] = entier[j+1];
                    entier[j+1] = temp;
                }
            }
        }
        return entier; 
    }
    
    public static int [] triageDecroissant (int[] entier){
        
        for (int i = 0; i < entier.length; i++){
        
        for (int j = 0; j < entier.length-1; j++) {
                if(entier[j]<entier[j+1]){
                    int temp = entier[j];
                    entier[j] = entier[j+1];
                    entier[j+1] = temp;
                }
            }
        }
        return entier;
    }
    
    public static void affichage (int[]entier){
     
        for (int element : entier) {
            System.out.print(element + "," );
        }
        System.out.println("\n");
    
    }
}    

