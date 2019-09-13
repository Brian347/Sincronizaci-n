/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacion;

/**
 *
 * @author BRIAN
 */
public class Reloj {

    /**
     * @param args the command line arguments
     */
    private int horas;
    private int minutos;
    private int segundos;
    
    public Reloj(){
        
    }
    
    public Reloj(int horas, int minutos, int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public void puesta_a_cero(){
        horas=0;
        minutos=0;
        segundos=0;
        
       
    }
    
    
    public void incremento(int increm){
        segundos+=increm;
//        if(segundos==60){
//            segundos=0;
//            minutos++;
//            if(minutos>=60){
//                minutos=0;
//                horas++;
////                if(horas==24){
////                    horas=0;
////                }
//            }
//        }
        if (segundos>=60) {
            minutos=(int)(segundos/60);
            segundos%=60;
            
        }
        
        if (minutos>=60) {
            horas=(int)(minutos/60);
            minutos%=60;
            
        }
        if (segundos>=24) {
            horas%=24;
            
        }


    }
    
    public void decremento(int decrement){
        segundos-=decrement;
        incremento(decrement);
        
////        if (segundos>=60) {
////            minutos=(int)(segundos/60);
////            segundos%=60;
////            
////        }
////        
////        if (minutos>=60) {
////            horas=(int)(minutos/60);
////            minutos%=60;
////            
////        }
////        if (segundos>=24) {
////            horas%=24;
////            
////        }
    }

    @Override
    public String toString() {
        return horas + ":" + minutos + ":" + segundos;
    }
    
    
    
    
}
