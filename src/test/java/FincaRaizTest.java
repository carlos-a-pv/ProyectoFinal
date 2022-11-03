import junit.framework.TestCase;

public class FincaRaizTest extends TestCase {

    public void testRegistrarPropiedad() throws Exception {

        FincaRaiz inmo = new FincaRaiz() ;
        Propiedad casa2 = new Propiedad("",0,0,new Propietario("juan"));
        inmo.anadir(casa2);
        Usuario nn = new Usuario("","","",Rol.EMPLEADO);
        Propietario carlos = new Propietario("carlos");
        Propiedad casa = new Casa("",0,0,carlos,0,0,0,"");
        inmo.registrarPropiedad(casa,nn);

    }
}