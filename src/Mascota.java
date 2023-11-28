public class Mascota {
    private String codigoMascota;
    private String nombre;
    private String fechaNacimiento;

    //Metodos

    //Constructor
    public Mascota(String codigoMascota, String nombre, String fechaNacimiento) {
        this.codigoMascota=codigoMascota;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
    }

    public String getCodigoMascota() {
        return codigoMascota;
    }
    public void setCodigoMascota(String codigoMascota) {
        this.codigoMascota=codigoMascota;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getFechaNacimiento() {
        return  fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento=fechaNacimiento;
    }
}
