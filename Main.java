

public class Main {

    public static void main(String[] args) {
        
        //Usuario 
     
        Usuario usuario1 = new Usuario("Jose Rodrigo", "Pereira Villalobos", 17, 2008);
        Usuario usuario2 = new Usuario("Dulce Alejandra", "Taguite Ovalle", 18, 2007);
        
        //Metodos de Objeto
        usuario1.setnombre("Bob");
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        
        System.out.println(usuario1.getnombre());
        System.out.println(usuario1.getapeliido());
        System.out.println(usuario1.getedad());
        
        if (usuario1.getedad()>= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

        
        System.out.println(usuario1.getfechanacimiento());

 }
}