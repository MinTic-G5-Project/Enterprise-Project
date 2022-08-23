public class Empleado {
    private String nombre;
    private String correo;
    private String empresaPertenece;
    private String rol;

    //CONSTRUCTOR DE LA CLASE EMPLEADO


    public Empleado(String nombre,String correo,String empresaPertenece,String rol){
        this.nombre=nombre;
        this.correo=correo;
        this.empresaPertenece=empresaPertenece;
        this.rol=rol;

    }


    public Empleado() {
    }

    //GETTER AND SETTER DE LA CLASE EMPLEADO


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaPertenece() {
        return empresaPertenece;
    }

    public void setEmpresaPertenece(String empresaPertenece) {
        this.empresaPertenece = empresaPertenece;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
