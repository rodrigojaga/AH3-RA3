package MODELO;


public class evalti {
    private int id_usuario;
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    private String correo_electronico;
    private String fecha_nacimiento;
    private int rol_id;
    private boolean activo; 
    private String contrasena;

    private int id_rol;
    private String nombre_rol;
    
    
    //login
    public evalti(String correo_electronico, String contrasena,String nombre,String apellido) {
        this.correo_electronico = correo_electronico;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        
    }

    //Mostrar en tabla usuarios
    public evalti(int id_usuario, String nombre, String apellido, String nombre_rol, String correo_electronico,int telefono ) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombre_rol = nombre_rol;
        this.correo_electronico = correo_electronico;
        this.telefono = telefono;
        
    }
    
    //Nuevo usuario
    public evalti(String nombre, String apellido, int telefono, String direccion, String correo_electronico, String fecha_nacimiento, int rol_id, boolean activo, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo_electronico = correo_electronico;
        this.fecha_nacimiento = fecha_nacimiento;
        this.rol_id = rol_id;
        this.activo = activo;
        this.contrasena = contrasena;
    }

    
    //comparar usuarios
//    public evalti(String correo_electronico, String nombre, String apellido) {
//        this.correo_electronico = correo_electronico;
//        this.nombre = nombre;
//        this.apellido = apellido;
//    }

    public evalti(int id_usuario, String nombre, String apellido, int telefono, String direccion, String correo_electronico, String fecha_nacimiento, int rol_id, boolean activo, String contrasena) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo_electronico = correo_electronico;
        this.fecha_nacimiento = fecha_nacimiento;
        this.rol_id = rol_id;
        this.activo = activo;
        this.contrasena = contrasena;
    }

    

   
    
    
    
    
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }
    
    
}
