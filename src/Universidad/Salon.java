package Universidad;

import java.util.ArrayList;

public class Salon {
    private int ID;
    private int aforo; 

    public Salon(int ID, int aforo) {
        this.ID = ID;
        this.aforo = aforo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
}

class MetodosSalon{
    ArrayList<Salon> salon;

    public MetodosSalon() {
        salon = new ArrayList<>();
    }
    public int GenerarIdSalon(){
        return Aleatorio(1000,9999);
    }
    public int GenerarAforoSalon(){
        return Aleatorio(15,30);
    }
    public ArrayList<Salon> GenerarSalon(int cant){
        ArrayList<Salon> x = new ArrayList<>();
        for(int i=0 ; i<cant ; i++){
            x.add(new Salon(GenerarIdSalon(), GenerarAforoSalon()));
        }
        return x;
    }
    public int Aleatorio(int min, int max){
        return (int)((max - min + 1) * Math.random() + min);
    }
}