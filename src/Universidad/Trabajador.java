package Universidad;

import java.util.ArrayList;

public class Trabajador {
    private String tipo; //Administrativo o No Administrativo
    private int ID;

    public Trabajador(String tipo, int ID) {
        this.tipo = tipo;
        this.ID = ID;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}

class MetodosTrabajador{
    ArrayList<Trabajador> trabajador;

    public MetodosTrabajador() {
        trabajador = new ArrayList<>();
    }
    public String GenerarTipoTrabajador(){
        String[] tipo = {"Administrativo","No Administrativo"};
        return tipo[Aleatorio(0,1)];
    }
    public int GenerarIdTrabajador(){
        return Aleatorio(100,999);
    }
    
    public ArrayList<Trabajador> GenerarTrabajador(int cant){
        ArrayList<Trabajador> x = new ArrayList<>();
        for(int i=0 ; i<cant ; i++){
            x.add(new Trabajador(GenerarTipoTrabajador(), GenerarIdTrabajador()));
        }
        return x;
    }
    
    public int Aleatorio(int min, int max){
        return (int)((max - min + 1) * Math.random() + min);
    }
}
