/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Vector;

/**
 *
 * @author C5220701
 */
public class Cliente {
    String mNIF, mNombre;
    Vector mFacturas;

    public Cliente(String mNIF, String mNombre) {
        this.mNIF = mNIF;
        this.mNombre = mNombre;
        this.mFacturas = new Vector();
    }
    
    public void add(Factura f){
        this.mFacturas.add(f);
    }
    
    public void show(){
        System.out.println("Facturas del cliente "+ this.mNombre + ":");
        for (int i = 0; i < this.mFacturas.size(); i++) {
            System.out.println("Factura "+(i+1));
            ((Factura)mFacturas.elementAt(i)).show();
            System.out.println("--------------------------\n\n");
        }
    }

    @Override
    public String toString() {
        return this.mNombre;
    }
    
    
    
}
