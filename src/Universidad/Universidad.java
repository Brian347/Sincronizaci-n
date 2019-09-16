package Universidad;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Facultad> facultad;
    private ArrayList<Oficina> oficina;
    
    public Universidad(String nombre, ArrayList<Facultad> facultad, ArrayList<Oficina> oficina) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.oficina = oficina;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Facultad> getFacultad() {
        return facultad;
    }

    public void setFacultad(ArrayList<Facultad> facultad) {
        this.facultad = facultad;
    }

    public ArrayList<Oficina> getOficina() {
        return oficina;
    }

    public void setOficina(ArrayList<Oficina> oficina) {
        this.oficina = oficina;
    }
}
class MetodosUniversidad {
    ArrayList<Universidad> uni ;
    
    //Constructor
    public MetodosUniversidad(){
        uni = new ArrayList<>();
    }
    
    //Metodos Basicos
    public void Agregar(Universidad x){
        uni.add(x);
    }
    public void Eliminar(Universidad x){
        uni.remove(x);
    }
    public Universidad Obtener(int pos){
        return uni.get(pos);
    }
    public int Tamaño(){
        return uni.size();
    }
    public String GenerarNombreUniversidad(){
        String[] nombre = {"Universidad Nacional Agraria de la Selva",
             "Universidad Nacional de Ingenieros",
             "Universidad Nacional Mayor de San Marcos",
             "Universidad De Huanuco",
             "Universidad Alas Peruanas"};
        return nombre[Aleatorio(0, nombre.length-1)];
    }
    public void GenerarUniversidad(){
        MetodosFacultad metFacu = new MetodosFacultad();
        MetodosOficina metOfi = new MetodosOficina();
        Agregar(new Universidad(GenerarNombreUniversidad(),metFacu.GenerarFacultad(3),metOfi.GenerarOficina(4)));
    }
    public void MostrarUniversidad(int pos){
        System.out.println("UNIVERSIDAD --> "+Obtener(pos).getNombre());
        System.out.println("----OFICINAS DE LA UNIVERSIDAD----");
        for(int i=0 ; i<Obtener(pos).getOficina().size() ; i++){
            System.out.println("*OFICINA "+(i+1));
            System.out.println("ID --> "+Obtener(pos).getOficina().get(i).getID());
            System.out.println("==TRABAJADORES==");
            for(int j=0; j<Obtener(pos).getOficina().get(i).getTrabajador().size() ; j++){
                System.out.println("-Trabajador "+(j+1));
                System.out.println("TIPO --> "+Obtener(pos).getOficina().get(i).getTrabajador().get(j).getTipo());
                System.out.println("ID --> "+Obtener(pos).getOficina().get(i).getTrabajador().get(j).getID());
            }
        }
        System.out.println("----FACULTADES DE LA UNIVERSIDAD----");
        for(int i=0 ; i<Obtener(pos).getFacultad().size() ; i++){
            System.out.println("FACULTAD --> "+Obtener(pos).getFacultad().get(i).getNombre());
            for(int j=0 ; j<Obtener(pos).getFacultad().get(i).getOficina().size() ; j++){
                System.out.println("*OFICINA DE FACULTAD "+(j+1));
                System.out.println("ID --> "+Obtener(pos).getFacultad().get(i).getOficina().get(j).getID());
                System.out.println("==TRABAJADORES==");
                for(int k=0; k<Obtener(pos).getFacultad().get(i).getOficina().get(j).getTrabajador().size() ; k++){
                    System.out.println("-Trabajador "+(k+1));
                    System.out.println("TIPO --> "+Obtener(pos).getFacultad().get(i).getOficina().get(j).getTrabajador().get(k).getTipo());
                    System.out.println("ID --> "+Obtener(pos).getFacultad().get(i).getOficina().get(j).getTrabajador().get(k).getID());
                }
            }
            System.out.println("==DOCENTES==");
            for(int j=0; j<Obtener(pos).getOficina().get(i).getTrabajador().size() ; j++){
                System.out.println("-Docente "+(j+1));
                System.out.println("TIPO --> "+Obtener(pos).getFacultad().get(i).getDocente().get(j).getTipo());
                System.out.println("ID --> "+Obtener(pos).getFacultad().get(i).getDocente().get(j).getID());
            }
            System.out.println("==SALONES==");
            for(int j=0; j<Obtener(pos).getOficina().get(i).getTrabajador().size() ; j++){
                System.out.println("-Salon "+(j+1));
                System.out.println("AFORO --> "+Obtener(pos).getFacultad().get(i).getSalon().get(j).getAforo());
                System.out.println("ID --> "+Obtener(pos).getFacultad().get(i).getSalon().get(j).getID());
            }
        }
    }
    public int Aleatorio(int min, int max){
        return (int)((max - min + 1) * Math.random() + min);
    }
}

