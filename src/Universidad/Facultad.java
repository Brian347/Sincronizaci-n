package Universidad;

import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private ArrayList<Docente> docente;
    private ArrayList<Oficina> oficina;
    private ArrayList<Salon> salon;

    public Facultad(String nombre, ArrayList<Docente> docente, ArrayList<Oficina> oficina, ArrayList<Salon> salon) {
        this.nombre = nombre;
        this.docente = docente;
        this.oficina = oficina;
        this.salon = salon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Docente> getDocente() {
        return docente;
    }

    public void setDocente(ArrayList<Docente> docente) {
        this.docente = docente;
    }

    public ArrayList<Oficina> getOficina() {
        return oficina;
    }

    public void setOficina(ArrayList<Oficina> oficina) {
        this.oficina = oficina;
    }

    public ArrayList<Salon> getSalon() {
        return salon;
    }

    public void setSalon(ArrayList<Salon> salon) {
        this.salon = salon;
    }
}

class MetodosFacultad{
    private ArrayList<Facultad> facu;
    
    public MetodosFacultad(){
        facu = new ArrayList<>();
    }
   //--------Metodo basicos------------//
    public void Agregar(Facultad x){
        facu.add(x);
    }
    public void Eliminar(Facultad x){
        facu.remove(x);
    }
    public Facultad Obtener(int pos){
        return facu.get(pos);
    }
    public int Tamaño(){ 
        return facu.size();
    }
    
    public String GenerarNombreFacultad(){
        String[] nombre = {"Ingenieria en Informatica y Sistemas",
            "Ingenieria Ambiental",
            "Ingenieria Forestal",
            "Ingenieria Zootecnia",
            "Economia",
            "Contabilidad",
            "Administracion"};
        
        return nombre[Aleatorio(0, nombre.length-1)];
        
    }
    
    public ArrayList<Facultad> GenerarFacultad(int cant){
        ArrayList<Facultad> x = new ArrayList<>();
        MetodosDocente d = new MetodosDocente();
         MetodosOficina o = new MetodosOficina();
        MetodosSalon s = new MetodosSalon();
        for(int i=0 ; i<cant ; i++){
            x.add(new Facultad(GenerarNombreFacultad(), d.GenerarDocente(Aleatorio(2, 5)), o.GenerarOficina(Aleatorio(1, 3)), s.GenerarSalon(Aleatorio(3, 7))));
        }
        return x;
    }
    
    public int Aleatorio(int min, int max){
        return (int)((max - min + 1) * Math.random() + min);
    }

       
}