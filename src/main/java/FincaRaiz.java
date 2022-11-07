import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FincaRaiz {

    private List<Propiedad> propiedades= new ArrayList<Propiedad>();
    private List <Cliente> clientes;
    private List <Empleado> empleados=new ArrayList<Empleado>();
    private List <Administrador> administradores;

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List<Administrador> administradores) {
        this.administradores = administradores;
    }
    public void registrarPropiedad(Propiedad propiedad){

    	propiedades.add(propiedad);
    	

    }
    public void registrarPropietarioPropietarios(Propietario propietario,Exception e){


    }
    public void registrarCliente (Cliente cliente,Exception e){


    }
    public void alquilar (Propiedad propiedad,Exception e){


    }
    public void vender (Propiedad propiedad,Exception e){


    }
    public void retirarPropiedad (Propiedad propiedad){

    				
    }
    public void registrarTransacciones (){


    }
    public List<?>  buscarPropiedad(String propiedad){
    	//lista.stream
    	
    	switch (propiedad) {
		case "Parqueadero": 
			return	propiedades.stream().filter(propiedad1 ->propiedad1 instanceof Parqueadero).collect(Collectors.toList());
			
		case "Bodega": 
			return	propiedades.stream().filter(propiedad1 ->propiedad1 instanceof Bodega).collect(Collectors.toList());
	
		case "Edificio": 
			return	propiedades.stream().filter(propiedad1 ->propiedad1 instanceof Edificio).collect(Collectors.toList());

		case "Vivienda": 
			return	propiedades.stream().filter(propiedad1 ->propiedad1 instanceof Vivienda).collect(Collectors.toList());

		case "Lote": 
			return	propiedades.stream().filter(propiedad1 ->propiedad1 instanceof Lote).collect(Collectors.toList());			
		default:
			break;
		}
    	
    		return null;
    }
    public void alquilar(){

    	

    }
    public void comprar(Propiedad propiedad){
    	
    	propiedades.remove(propiedad);
    	
    }
    public void registrarEmpleado(Empleado empleado, Exception e){
    	
    	empleados.add(empleado);
    		

    }
    public void visualizarReportes (DateFormat periodo, Exception e){


    }
    public void bloquearCuenta(Empleado empleado){
    	
    	empleados.remove(empleado);
    	
    }
    public void actualizarDatosEmpleado(String nombre, String userId, String password){
    	
    	int index=empleados.indexOf(empleados.stream().filter(empleado1 ->empleado1.getNombre().equals(nombre)).findFirst().get());
    	Empleado empleado=new Empleado(nombre,userId,password);
    		
    	//empleado.setNombre(nombre);
        empleado.setUserId(userId);
        empleado.setPassword(password);
        empleados.set(index, empleado);
           
        //final
    }
}
