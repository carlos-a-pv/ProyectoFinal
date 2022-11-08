
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FincaRaiz finca= new FincaRaiz();
		Propiedad propiedad1 = new Propiedad("Calle 10 Nte", 200.000, 70.5, new Propietario(""));
		Lote propiedad2 = new Lote("Norte y",100.000,50.5, new Propietario(""),"Rosa");
		Vivienda vivienda = new Vivienda("Norte y",100.000,50.5, new Propietario(""),4,2,1);
		
//		finca.registrarPropiedad(propiedad1);
//		finca.registrarPropiedad(propiedad2);
//		finca.registrarPropiedad(vivienda);
	
		System.out.println(finca.buscarPropiedad("Vivienda"));
		
		Empleado empleado=new Empleado("Ale","12345","ASDFGJMNBVC");
		finca.registrarEmpleado(empleado, null);
		System.out.println(finca.getEmpleados());
		finca.actualizarDatosEmpleado("Ale", "54321", "artyknb");
		System.out.println(finca.getEmpleados());
		
	}
	

}
