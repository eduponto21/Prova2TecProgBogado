/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.pratica;

/**
 *
 * @author a1906399
 */
public class PontoXZ extends Ponto2D {
    private double x, z;
    
    public PontoXZ() {
        super();
    }
    
    public PontoXZ(double x, double z) {
        super(x, 0, z);
        this.x = x;
        this.z = z;
    }
    
    @Override
    public String toString() {
        return String.format("PontoXZ(%f,0,%f)", x, z);
    }
}
