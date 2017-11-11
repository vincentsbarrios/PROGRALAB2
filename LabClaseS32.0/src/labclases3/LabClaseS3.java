package labclases3;
import java.util.ArrayList;
import java.util.Scanner;

//*****************VINCENT BARRIOS**********BRYAN ALTAMIRANO***************

public class LabClaseS3 {
    public static void main(String[] args) {
     Scanner anubis = new Scanner(System.in);  
     int kk = anubis.nextInt();
     Directorio raiz = new Directorio("c:/", 1, null,null,"general");
    
     do{
    System.out.println("MENU PRINCIPAL");
    System.out.println("1. BUSCAR CARPETA");
    System.out.println("2. CREAR CARPETA");
    System.out.println("3. CREAR ARCHIVO");
    System.out.println("4. SALIR");
    
    switch(kk){
            case 1:
                
                break;
            case 2:
                System.out.println("\n*** CREAR CARPETA ****");
                System.out.print("NOMBRE DE LA CARPETA: ");
                String c = anubis.next();
                System.out.print("TAMANO DE LA CARPETA: ");
                int t = anubis.nextInt();
                System.out.print("TIPO DE ACCESO: ");
                String tp = anubis.next();
                
                raiz.addDirectorio(new Directorio(c,t, null, null,tp));
                
                break;
            case 3:
                System.out.println("TIPO DE ARCHIVO");
                System.out.println("SYSTEMA o USUARIO");
                System.out.print(">>>");
                String op = anubis.next();
                break;
        }
    
     }while(kk != 4);
     
    }
}
