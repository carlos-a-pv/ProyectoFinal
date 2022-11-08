public class Cliente extends Persona {

    private String password ;
    public Cliente(String nombre, String id,String password) {
        super(nombre, id);
        this.password = password;

    }

}
