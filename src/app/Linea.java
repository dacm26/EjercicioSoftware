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
public class Linea {
    private String mArticulo;
    private double mPrecio;

    public Linea(String mArticulo, double mPrecio) {
        this.mArticulo = mArticulo;
        this.mPrecio = mPrecio;
    }
    

    public String getmArticulo() {
        return mArticulo;
    }

    public void setmArticulo(String mArticulo) {
        this.mArticulo = mArticulo;
    }

    public double getmPrecio() {
        return mPrecio;
    }

    public void setmPrecio(double mPrecio) {
        this.mPrecio = mPrecio;
    }
    
    public void show(){
        System.out.println("\t" + this.mArticulo + "....."+ this.mPrecio + "Lps");
    }

    @Override
    public String toString() {
        return this.mArticulo + "....."+ this.mPrecio + "Lps";
    }
    
}
