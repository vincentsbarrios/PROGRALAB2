package hotel;

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {
        
        Scanner anubis = new Scanner(System.in);
        String rooms[][] = new String[6][6];
        int opc;
        int opd;
        String nombre;

        int avalaible_simple=12;
        int avalaible_double=12;
        int avalaible_suites=6;
        int revenue=0;
        
        try{
            do{

                System.out.println("\n******BIENVENIDO AL HOTEL VOX INC******");
                System.out.println("1. RESERVAR HABITACION");
                System.out.println("2. CHECKOUT");
                System.out.println("3. REPORTE");
                System.out.println("4. SALIR");
                System.out.print("\n ESCOJA LA OPCION: ");
                opc = anubis.nextInt();

            

                switch(opc){

                    case 1:
                        System.out.println("\n******TIPO DE HABITACION******");
                        System.out.println("1. SENCILLA - $1,200");
                        System.out.println("2. DOBLE - $3,400");
                        System.out.println("3. SUITE - $5,000");
                        System.out.print("\nINGRESE TIPO DE HABITACION: ");
                        opd = anubis.nextInt();

                        switch(opd){
                            case 1:
                                System.out.print("\nNOMBRE: ");
                                nombre = anubis.next().toUpperCase();

                                if(avalaible_simple != 0){         
                                    for(int x=0;x<6;x++){
                                        if(rooms[x][1] == null){
                                            rooms[x][1] = nombre;
                                            avalaible_simple--;
                                            revenue= revenue + 1200;
                                            break;
                                        }
                                        else if(rooms[x][2] == null){
                                            rooms[x][2] = nombre;
                                            avalaible_simple--;
                                            revenue= revenue + 1200;
                                            break;
                                        }
                                    }//END FOR
                                }
                                else{
                                    System.out.println("\n\"NO HAY HABITANCIONES SENCILLAS DISPONIBLES\"");
                                }

                                break;
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
                            case 2:
                                System.out.print("\nNOMBRE: ");
                                nombre = anubis.next().toUpperCase();

                                if(avalaible_double != 0){         
                                    for(int x=0;x<6;x++){

                                        if(rooms[x][3] == null){
                                            rooms[x][3] = nombre;
                                            avalaible_double--;
                                            revenue= revenue+3400;
                                            break;
                                        }
                                        else if(rooms[x][4] == null){
                                            rooms[x][4] = nombre;
                                            avalaible_double--;
                                            revenue= revenue+3400;
                                            break;
                                        }
                                    }//END FOR
                                }
                                else{
                                  System.out.println("\n\"NO HAY HABITANCIONES DOBLES DISPONIBLES\"");
                                }

                                break;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                            case 3:
                                System.out.print("\nNOMBRE: ");
                                nombre = anubis.next().toUpperCase();

                                if(avalaible_suites != 0){         
                                    for(int x=0;x<6;x++){

                                        if(rooms[x][5] == null){
                                            rooms[x][5] = nombre;
                                            avalaible_suites--;
                                            revenue= revenue+5000;
                                            break;
                                        }
                                    }//END FOR
                                }
                                else{
                                  System.out.println("\n\"NO HAY HABITANCIONES DOBLES DISPONIBLES\"");
                                }
                                break;
                        }
                        break;
    /*************************************************************************************************************************/
                    case 2:
                        int z = 0;
                        System.out.println("\n******CHECKOUT******");
                        System.out.print("\nNUMERO DE PISO: ");
                        int y = anubis.nextInt();
                        System.out.print("NUMERO DE HABITACION: ");
                        z = anubis.nextInt();
                        z = z - 1;
                        System.out.println("\nHUESPED: " + rooms[z][y]);
                        rooms[z][y] = null;
                        System.out.println("\nCHEKOUT SE A REALIZADO");

                        if(y == 1 || y == 2)
                            avalaible_simple++;
                        if(y == 3 || y == 4)
                            avalaible_double++;
                        if(y == 5)
                            avalaible_suites++;

                        break;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                        
                    case 3:
                        System.out.println("\n*******HABITACIONES SENCILLAS*******");
                        System.out.println("   FLOOR 1" +"                      FLOOR 2");
                        for(int x=0;x<6;x++){
                            System.out.println("ROOMS "+(x+1)+": " + rooms[x][1] + "     ROOMS "+(x+1)+": "+ rooms[x][2]);  
                        }

                        System.out.println("\n*******HABITACIONES DOBLES*******");
                        System.out.println("   FLOOR 3" +"                      FLOOR 4");
                        for(int x=0;x<6;x++){
                            System.out.println("ROOMS "+(x+1)+": " + rooms[x][3] + "     ROOMS "+(x+1)+": "+ rooms[x][4]);  
                        }

                        System.out.println("\n*******HABITACIONES SUITES*******");
                        System.out.println("                    FLOOR 5");
                        for(int x=0;x<6;x++){
                            System.out.println("                ROOMS "+(x+1)+": " + rooms[x][5]);  
                        }

                        System.out.println("\n***HANITACIONES OCUPADAS***");
                        System.out.println("SENCILLAS: " + avalaible_simple);
                        System.out.println("DOBLES: " + avalaible_double);
                        System.out.println("SUITES: " + avalaible_suites);
                        System.out.println("TOTAL DE GANANCIAS SON: " + revenue);

                        break;

                }//END SWITCH
            
          
        
        }while(opc != 4);
        //END DO
        
        }catch(Exception e){
            System.out.println("/nPROGRAMA NO RECIBE PALABRAS");
        }
        
    }
    
}
