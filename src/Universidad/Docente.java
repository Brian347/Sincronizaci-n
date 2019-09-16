package Universidad;

import java.util.ArrayList;

public class Docente {
    private String tipo; //Titular, Asociado o Auxiliar
    private int ID;

    public Docente(String tipo, int ID) {
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

class MetodosDocente{
    ArrayList<Docente> docente;

    public MetodosDocente() {
        docente = new ArrayList<>();
    }
    public String GenerarTipoDocente(){
        String[] tipo = {"Titular","Asociado","Auxiliar"};
        return tipo[Aleatorio(0,2)];
    }
    public int GenerarIdDocente(){
        return Aleatorio(100,999);
    }
    public ArrayList<Docente> GenerarDocente(int cant){
        ArrayList<Docente> x = new ArrayList<>();
        for(int i=0 ; i<cant ; i++){
            x.add(new Docente(GenerarTipoDocente(), GenerarIdDocente()));
        }
        return x;
    }
    public int Aleatorio(int min, int max){
        return (int)((max - min + 1) * Math.random() + min);
    }
}
