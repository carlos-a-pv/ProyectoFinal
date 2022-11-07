import junit.framework.TestCase;

public class FincaRaizTest extends TestCase {

    public void testRegistrarPropiedad() throws Exception {

        FincaRaiz inmo = new FincaRaiz() ;
        Usuario nn = new Empleado("","","");
        Propietario carlos = new Propietario("carlos");
        Propiedad casa = new Casa("",0,0,carlos,0,0,0,"");
        Propiedad casa52 = new Casa("1",0,0,carlos,0,0,0,"");
        Propiedad casa3 = new Lote("",0,0,carlos,"");
        Propiedad casa4 = new Bodega("",0,0,carlos,"");
        Propiedad casa6 = new Vivienda("",0,0,carlos,0,0,0);
        Propiedad casa7 = new Chalet("",0,0,carlos,0,0,0,"",false,false,false,false,false,false);
        inmo.registrarPropiedad(casa,nn);
        inmo.registrarPropiedad(casa52,nn);

        System.out.println(inmo.buscarPropiedad("casa"));
    }
}