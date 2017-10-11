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
public class PontoYZ extends Ponto2D {
    private double y, z;
    
    public PontoYZ() {
        super();
    }
    
    public PontoYZ(double y, double z) {
        super(0, y, z);
        this.y = y;
        this.z = z;
    }
    
    @Override
    public String toString() {
        return String.format("PontoYZ(0,%f,%f)", y, z);
    }
    
}
