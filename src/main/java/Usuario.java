public class Usuario {
    private String nombre;
    private String userId;
    private String password;

    private Rol cargo;
    public Usuario(String nombre, String userId, String password,Rol cargo) {
        this.nombre = nombre;
        this.userId = userId;
        this.password = password;
        this.cargo = cargo;


    }

    public Rol getCargo() {
        return cargo;
    }

    public void setCargo(Rol cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
