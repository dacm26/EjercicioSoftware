/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author C5220701
 */
public class Factura implements Euro{
    private String mNumero, mFecha;
    private Linea mLineas[];

    public Factura(String mNumero, String mFecha) {
        this.mNumero = mNumero;
        this.mFecha = mFecha;
        this.mLineas = new Linea[10];
    }

    public String getmNumero() {
        return mNumero;
    }

    public void setmNumero(String mNumero) {
        this.mNumero = mNumero;
    }

    public String getmFecha() {
        return mFecha;
    }

    public void setmFecha(String mFecha) {
        this.mFecha = mFecha;
    }
    
    
    
    public void add(Linea l){
        int i;
        for (i = 0;  mLineas[i] != null ; i++);
        mLineas[i] = l;
    }
    
    public void quitar(int i){
        this.mLineas[i].setmArticulo(null);
        this.mLineas[i].setmPrecio(0.0);
    }
    
    public void show(){
        double total = 0;
        System.out.println(this.mNumero+";"+mFecha);
        for (int i = 0; mLineas[i] != null; i++) {
            mLineas[i].show();
            total += this.mLineas[i].getmPrecio();
        }
        System.out.println("\tTotal ...."+total+" Lps.");
        System.out.println("\t"+ (total/kCambio)+ " euros");
    }
}
