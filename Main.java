/*Programación Orientada a Objetos
 * Sección 30
 * Pedro Pablo Guzmán Mayen
 * 
 */
// Importar metodos que seran importantes para la ejecución del programa
import java.util.Scanner;
public class Main {
    static Scanner entrada = new Scanner(System.in);
    static person person = new person();
    static Dog dog = new Dog();
    //Almacena el animo del perro
    static float animo = dog.getAnimo();
    //Almacena la confianza de la persona 
    static float confidence = person.getConfidence();
    static methodsLab1 met1 = new methodsLab1();
   
    //Main es el metodo principal, ente se encarga de ingresar datos proveidos por el usuari
    public static void main(String[] args){
        System.out.println("Bienvenido, en este programa usted podra entrenar y mejor su relacion con los perros callejeros de la perrera");
        System.out.println("Ingrese los datos para iniciar el programa");
        System.out.println("Ingrese el nombre del perro: ");
        String dName = entrada.nextLine();
        dog.setName(dName);
        System.out.println("Ingrese el nombre del propietario del perro: ");
        String pName = entrada.nextLine();
        person.setName(pName);
        System.out.println(person.getName() + " Tiene galleta? (escriba 1 si la tiene y 0 si no la tiene): ");
        int cookie = entrada.nextInt();
        //Esta condicion se encarga de que el usuario no pueda ingresar valores erroneos en la variable cookie
        while (cookie != 1 && cookie != 0){
            System.out.println("No puede elegir un valor que no sea 0 o 1, intente de nuevo: ");
            cookie = entrada.nextInt();
        }
        person.setHaveCookie(cookie);
        System.out.println("El animo inicial de " + dog.getName() + " es de: " + dog.getAnimo());
        System.out.println("La confiabilidad inicial de " + person.getName() + " es de " + person.getConfidence());
        Main.driverProgram();
    }

  //Este metodo es la parte mas importante del programa, pues permite que el programa funcione y utilice todos los metodos anteriormente definidos
    public static void driverProgram(){
        Boolean condition1 = true;
        while (condition1){
            System.out.println("**** ENTRENAMIENTO CON PERROS CALLEJROS **** ");
            System.out.println("OPCION 1: acariciar ");
            System.out.println("OPCION 2: Dar galleta ");
            System.out.println("OPCION 3: Jugar ");
            System.out.println("OPCION 4: Sacar galleta");
            System.out.println("OPCION 5: Salir del programa");
            int decision = entrada.nextInt();
            while (decision < 1 || decision > 7  ){
                System.out.println("Error, no puede ingresar un valor mayor o menor que los numeros que aparecen en las opciones");
            }

            if (decision == 1){
                met1.acariciar(animo, confidence, dog, person);   
            }
            if (decision == 2){
                met1.darGalleta(animo, person, dog, confidence);    
            }
            if (decision == 3){
                met1.play(dog, person, animo, confidence);
            }
            if (decision == 4){
                met1.sacargalleta(dog, person, animo, confidence);;
            }
            if (decision == 5){
                met1.finalReact(dog, person);
                condition1 = false;
                
            }

        }
    }
}
    
    
