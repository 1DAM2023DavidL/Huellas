public class Adopcion {
    private String codigoAdopcion;
    private String fechaAdopcion;
    private Perro perro=null;
    private Gato gato=null;
    private Persona persona;

    //Metodos

    //Constructor
    public Adopcion(String codigoAdopcion, String fechaAdopcion, Perro perro, Gato gato, Persona persona) {
        this.codigoAdopcion=codigoAdopcion;
        this.fechaAdopcion=fechaAdopcion;
        this.perro=perro;
        this.gato=gato;
        this.persona=persona;
    }

    public String getCodigoAdopcion() {
        return codigoAdopcion;
    }

    public void setCodigoAdopcion(String codigoAdopcion) {
        this.codigoAdopcion = codigoAdopcion;
    }

    public String getFechaAdopcion() {
        return fechaAdopcion;
    }

    public void setFechaAdopcion(String fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public Gato getGato() {
        return gato;
    }

    public void setGato(Gato gato) {
        this.gato = gato;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
