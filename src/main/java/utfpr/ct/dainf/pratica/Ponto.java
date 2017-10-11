package utfpr.ct.dainf.pratica;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 *
 * @author
 */
public class Ponto {
    private double x, y, z;
    
    public Ponto() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    public Ponto(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Retorna o nome não qualificado da classe.
     * @return O nome não qualificado da classe.
     */
    public String getNome() {
        return getClass().getSimpleName();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    @Override
    public String toString(){
        return String.format("%s(%f,%f,%f)", getNome(), x, y, z);
    }
    
    public boolean equals(Ponto p){
        
        if(p.x == this.x &&
           p.y == this.y &&
           p.z == this.z)
            return true;
        else
            return false;
    }
    
    public double dist(Ponto p){
        double d;
        
        d = Math.sqrt(
                Math.pow(p.x - this.x, 2)+
                Math.pow(p.y - this.y, 2)+ 
                Math.pow(p.z - this.z, 2)
                );
        
        return d;
    }

}
