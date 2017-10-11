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
public class PontoXY extends Ponto2D {
    private double x, y;
    
    public PontoXY() {
        super();
    }
    
    public PontoXY(double x, double y) {
        super(x, y, 0);
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return String.format("PontoXY(%f,%f,0)", x, y);
    }
    
    
}
