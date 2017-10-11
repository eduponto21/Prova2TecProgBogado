
import utfpr.ct.dainf.pratica.PontoXY;
import utfpr.ct.dainf.pratica.PontoXZ;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * @author 
 */
public class Pratica {

    public static void main(String[] args) {
            
        PontoXZ xz = new PontoXZ(-3, 2);
        PontoXY xy = new PontoXY(0, 2);
        
        double distancia = xz.dist(xy);
        
        System.out.println(String.format("Distancia = %f", distancia));
        
    }
    
}
