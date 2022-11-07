
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		FincaRaiz finca= new FincaRaiz();
		Propiedad propiedad1 = new Propiedad("Calle 10 Nte", 200.000, 70.5, new Propietario(""));
		Lote propiedad2 = new Lote("Norte y",100.000,50.5, new Propietario(""),"Rosa");
		Vivienda vivienda = new Vivienda("Norte y",100.000,50.5, new Propietario(""),4,2,1);
		
//		finca.registrarPropiedad(propiedad1,new Usuario("","",""));
//		finca.registrarPropiedad(propiedad2,new Usuario("","",""));
//		finca.registrarPropiedad(vivienda,new Usuario("","",""));
	
		System.out.println(finca.buscarPropiedad("Vivienda"));
		
		Administrador administrador = new Administrador("Brian","57uy","qw4ep5");
		Empleado empleado=new Empleado("Ale","12345","ASDFGJMNBVC",true);
		finca.registrarEmpleado(empleado, null);
		System.out.println(finca.getEmpleados());
		finca.actualizarDatosEmpleado("Ale", "54321", "artyknb");
		System.out.println(finca.getEmpleados());
		
		finca.bloquearCuenta(empleado, empleado);
		//finca.bloquearCuenta(administrador, empleado);
		
		System.out.println(empleado.getEstado());
	}
	

}
