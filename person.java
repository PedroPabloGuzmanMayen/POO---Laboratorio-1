/*Programación Orientada a Objetos
 * Sección 30
 * Pedro Pablo Guzmán Mayen
 * 
 */
// Importar metodos que seran importantes para la ejecución del programa
import java.util.Random;
//Definir la clase person, esta se encarga de almacenar los datos y reacciones de las personas 
public class person {
    //Definir las variables importantes para esta clase, confidence guarda la confianza, name el nombre, haveCookie indica si la persona tiene o no una galleta
    private float confidence;
    private String name;
    private int haveCookie;
    Random rand = new Random();
    //Definir el metodo constructor 
    public person(){
        confidence = rand.nextFloat(11); 
    }
    //Los siguientes metodos contienen las reacciones de la persona a los comportamientos del perro, estos son propios de la persona, por eso se ubican en esta clase
    public void reaccionLadrido(Dog d){
        System.out.println(name + " ignoro a " + d.getName());
    }
    public void reaccionMorder(Dog d){
        System.out.println(name + " le pego a " + d.getName());
    }
    public void reaccionMoverCola(Dog d){
        System.out.println(name + " acaricio a " + d.getName());
    }
    //Generar los getters y setters de las demas variables 
    public float getConfidence() {
        return confidence;
    }
    public void setConfidence(float confidence) {
        this.confidence = confidence;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHaveCookie() {
        return haveCookie;

    }
    public void setHaveCookie(int haveCookie) {
        this.haveCookie = haveCookie;
    }


}
