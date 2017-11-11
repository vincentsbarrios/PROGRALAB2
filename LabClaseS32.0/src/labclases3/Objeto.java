package labclases3;
public class Objeto {
    protected String nombre;
    protected int tamano;

    public Objeto(String n,int y){
        this.nombre = n;
        this.tamano = y;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    Objeto buscar_Objeto(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
