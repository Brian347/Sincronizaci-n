package Universidad;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        MetodosUniversidad metUni = new MetodosUniversidad();
        MetodosFacultad metFacu = new MetodosFacultad();
        MetodosOficina metOfi = new MetodosOficina();
        Scanner in = new Scanner(System.in);
        int OpcionUni; //OPCION ESCOGIDA
        do{
            System.out.println("1 --> AGREGAR UNIVERSIDAD"+
                    "\n2 --> ELIMINAR UNIVERSIDAD"+
                    "\n3 --> INGRESAR A LA UNIVERSIDAD"+
                    "\n4 --> MOSTRAR UNIVERSIDADES"+
                    "\n5 --> FICHAR UNIVERSIDAD"+
                    "\n6 --> SALIR");
            System.out.print("Eliga una opcion: ");
            OpcionUni = in.nextInt();
            
            if(OpcionUni == 1){
                
            }
            
        }while(OpcionUni < 6 && OpcionUni > 0);
        
        
        
    }
}
