



public class Usuario {
    
    //Propiedades de Objeto
    private String nombre;
    private String apellido;
    private int edad;
    private int fechanacimiento;
     
    //Metodo Constructor
    public Usuario (String nombre,String apellido,int edad,int fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechanacimiento = fechaNacimiento;
    }
    
    //Metodos Get
    public String getnombre(){
        return nombre;
    }

    public String getapeliido(){
        return apellido;
    }
    
    public int getedad(){
      return edad;
    }

    public int getfechanacimiento(){
        return fechanacimiento;
    }

    //Metodos Set
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public void setapellido(String apellido){
        this.apellido = apellido;
    }
 
    public void setedad(int edad){
        this.edad = edad;
    }

    public void setfechancimiento(int fechaNacimiento){
        this.fechanacimiento = fechaNacimiento;
    }



    //Metodos
    public void mostrarDatos (){

        System.out.println("Nombre:" + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Año de nacimiento: " + fechanacimiento);

    }
}