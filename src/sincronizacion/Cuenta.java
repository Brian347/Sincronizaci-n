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
public class Cuenta {
    private float saldo;
    
    public Cuenta(){
        this.saldo=0;
    }
    
    public void deposito(float cant){
        saldo+=cant;
    }
    
    public void retiro(float cant){
        saldo-=cant;
    }
    
    public boolean validarTransacion(float cant){
        if(saldo>=cant)//sacar dinero dentro del límite
            return true;
        return false;
    }
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
    
    
}
