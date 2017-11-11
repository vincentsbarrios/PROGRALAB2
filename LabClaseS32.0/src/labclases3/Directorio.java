package labclases3;

import java.util.ArrayList;

public class Directorio extends Objeto{
    
    protected String permisos;
    private ArrayList<Objeto> direct;
    private ArrayList<Directorio> directx;
    
    public Directorio(String n, int y){
        super(n, y);
        this.direct = null;
        this.directx = null;
    }
    public Directorio(String n,int y,ArrayList<Objeto> directorio,ArrayList<Directorio> directoriox,String permisos){
        super(n,y);
        this.nombre = n;
        this.tamano = y;
        this.direct = directorio;
        this.directx = directoriox;
        this.permisos = permisos;
    }
    
    public void addDirectorio(Directorio nuevo){
        if(direct != null){
            direct.add(nuevo);
        }
        else{
            direct = new ArrayList<>();
            direct.add(nuevo);
        }
    }
    public void addObjeto(Objeto nuevo){
        if(directx != null){
            directx.add((Directorio) nuevo);
        }
        else{
            directx = new ArrayList<>();
            directx.add((Directorio) nuevo);
        }
    }
    @Override
    public Objeto buscar_Objeto(String nombre){
        if(nombre.equals(this.nombre))
            return this;
        
        if(this.direct == null)
            return null;
        else
        {
            for(int i = 0; i < direct.size(); i++)
            {
                Objeto tmp = direct.get(i);
                tmp = tmp.buscar_Objeto(nombre);
                if(tmp != null)
                    return tmp;
            }
        }
        
        return null;
    }
    
    
    public void addArchivo(String tipo,Directorio nuevo)
    {
        if(tipo.endsWith("USUARIO"))
            directx = new ArrayList<Directorio>();
        else
        {
            directx = new ArrayList<Directorio>();
            directx.add(nuevo);
        }
    }
    
    
    
}
