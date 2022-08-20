/*Programación Orientada a Objetos
 * Sección 30
 * Pedro Pablo Guzmán Mayen
 * 
 */
// Importar metodos que seran importantes para la ejecución del programa
import java.util.Random;
//Definir la clase dog, esta se encarga de almacenar todos los datos y reacciones relacionados al perro
public class Dog {
    //Crear las variables de importancia para esta clase. Animo almacena el animo del perro, name el nombre 
    Random rand = new Random();
    private float animo;
    private String name;
    //Hacer un metodo constructor que asigne un valor aleatorio al animo del perro cada vez que la clase sea invocada
    public Dog() {
        animo = rand.nextFloat(11) -5;    
    }
    //Hacer los getters y setters para animo
    public float getAnimo() {
        return animo;
    }
    public void setAnimo(float animo) {
        this.animo = animo;
    }
    //Definir los metodos morder, ladrar y moverCola, estos son propios del perro, por esa razon van en esta clase. 
    public void morder(){
        System.out.println(name +" te mordio");
    }
    public void ladrar(){
        System.out.println(name +" te ladro");
    }
    public void moverCola(){
        System.out.println(name +" esta moviendo su cola");
    }
    //Hacer los getters y setters para name 
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
