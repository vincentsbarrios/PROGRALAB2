package LabEx3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner anubis = new Scanner(System.in);
        
        System.out.println("INGRESE LOS NUMEROS");
        System.out.print("NUM 1: ");
        int num = anubis.nextInt();
        System.out.print("NUM 2: ");
        int num2 = anubis.nextInt();
        System.out.print("NUM 3: ");
        int num3 = anubis.nextInt();
        
        Calculos_Matematicos pc = new Calculos_Matematicos(num,num2,num3);
        
        System.out.println("El MCD ES: " + pc.mcd_euclides(num,num2,num3));
        
    }
}
