/*
Vazquez Anya - Prosper Playoust
TDB-2
27/09/2021
TP0
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author anyavazquez
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercice 2
        System.out.println("Please enter the operator:\n 1) Add\n 2) Substract\n 3) multiply\n 4) divide\n 5) Modulo");
        System.out.println("hello");
        // Exercice 3
        int operateur;
        Scanner sc = new Scanner(System.in);
        operateur=sc.nextInt();
        if (operateur >5 || operateur < 1) {
            System.out.println("Erreur, veuillez entrer un nombre entre 1 et 5");
            System.exit(0);
        }
        // Bonjour
        //System.out.println(operateur);//on vérifie que operateur correspond bien à la valeur entrée par l'utilisateur
        
        // Exercice 4
        int operand1;
        System.out.println("\n Entrer une valeur entière:");
        operand1=sc.nextInt();
        //System.out.println(operand1); //on vérifie que operand1 correspond bien à la valeur entrée par l'utilisateur
        
        // Exercice 5
        int operand2;
        System.out.println("\n Entrer une valeur entière:");
        operand2=sc.nextInt();
        //System.out.println(operand2); //on vérifie que operand1 correspond bien à la valeur entrée par l'utilisateur
        
        // Exercice 6
        if (operateur == 1) {
            System.out.println("Le résultat de la somme est: ");
            System.out.println(operand1+operand2);
        }
        if (operateur == 2) {
            System.out.println("Le résultat de la soustraction est: ");
            System.out.println(operand1-operand2);
        }
        if (operateur == 3) {
            System.out.println("Le résultat de la multiplication est: ");
            System.out.println(operand1*operand2);
        }
        if (operateur == 4) {
            System.out.println("Le résultat de la division est: ");
            System.out.println(operand1/operand2);
        }
        if (operateur == 5) {
            System.out.println("Le reste de la division est: ");
            System.out.println(operand1%operand2);
        }
        
       // salut grosse pute
    }
    
}

