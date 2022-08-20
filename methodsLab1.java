/*Programación Orientada a Objetos
 * Sección 30
 * Pedro Pablo Guzmán Mayen
 * 
 */
// Importar metodos que seran importantes para la ejecución del programa
import java.util.Random;
public class methodsLab1 {
    Random rand = new Random();
    //Definir el metodo acariciar, este hace que la persona tenga interaccion con el perro
    public void acariciar(float a, float c, Dog d, person p){
        //En este metodo, todo depende del nivel de confianza que tenga la persona, por lo que se crearon diferentes condiciones para distintos resultados
        if (p.getConfidence() > 0){
            System.out.println(p.getName() + " acaricio a: " + d.getName());
            System.out.println(d.getName() + " Esta encantado");
            d.moverCola();
            p.setConfidence(c + rand.nextFloat(2)+1); 
            d.setAnimo(a + (1.0f/p.getConfidence()) * ((rand.nextFloat(2)+1)));
            System.out.println("El nuevo animo de " + d.getName() + " es de " + d.getAnimo());
            System.out.println("La confiabilidad de: " + p.getName() + " es de " + p.getConfidence());  
        }
        if (p.getConfidence() == 0){
            System.out.println(p.getName() + " trato de acariciar a " + d.getName() + " sin embargo, este no se lo permite");
            d.ladrar();
            p.reaccionLadrido(d);
            d.setAnimo(a - rand.nextFloat(1));
            p.setConfidence(c - rand.nextFloat(1));
            System.out.println("El nuevo animo de " + d.getName() + " es de " + d.getAnimo());
            System.out.println("La confiabilidad de: " + p.getName() + " es de " + p.getConfidence());  
        }
        if (p.getConfidence() < 0){
            System.out.println(p.getName() + " trato de acariciar a " + d.getName() + " sin embargo, este no se lo permite");
            d.morder();
            p.reaccionMorder(d);
            d.setAnimo(a - rand.nextFloat(2));
            p.setConfidence(c - rand.nextFloat(2));
            System.out.println("El nuevo animo de " + d.getName() + " es de " + d.getAnimo());
            System.out.println("La confiabilidad de: " + p.getName() + " es de " + p.getConfidence());  
        }
    }
    //Este metodo tambien le permite a la persona interectuar con el perro 
    public void darGalleta(float a, person p, Dog d, float c){
        //En este metodo, si la variable havecookie es igual a 1, el perro aumentara su animo y ganara confianza con el entrenador
        if(p.getHaveCookie() == 1){
            System.out.println(p.getName() + " le dio una galleta a " + d.getName());
            System.out.println(d.getName() + " esta muy agradecido");
            d.moverCola();
            p.setHaveCookie(p.getHaveCookie()-1); 
            d.setAnimo(a + (1.0f/p.getConfidence()) * ((rand.nextFloat(2))+1));
            p.setConfidence(c + rand.nextFloat(2)+1);
            System.out.println("El nuevo animo de "+d.getName() + " es de " + d.getAnimo());
            System.out.println("La confiabilidad de: " + p.getName() + " es de " + p.getConfidence());
        }
        //Si no hay galletas, se muestra el siguiente mensaje
        else{
            System.out.println(p.getName() + " No tiene galletas");
            System.out.println(d.getName() + " queria galletas :(");
        }
    }
    //En este metodo, el animo del perro y la confianza del perro disminuiran en base a si la persona tiene una galleta o no
    public void sacargalleta(Dog d, person p, float a, float c){
        if(p.getHaveCookie() == 1){
            System.out.println(p.getName() + " le muestra la galleta a " + d.getName());
            System.out.println(p.getName() + " le muestra la galleta a " + d.getName());
            System.out.println(d.getName()+ " se emociona ");
            p.setConfidence(c + rand.nextFloat(1));
            d.setAnimo(a + (1.0f/p.getConfidence()) * ((rand.nextFloat(2)+1)));
            System.out.println("El animo de " + d.getName() + " es de: " + d.getAnimo());
            System.out.println("La confiabilidad de: " + p.getName() + " es de " + p.getConfidence());
        }
        if (p.getHaveCookie() == 0){
            System.out.println(p.getName() + " ilusiono a " + d.getName() + " con una galleta, sin embargo no tiene una." );
            System.out.println(d.getName() + " le lanza una fria mirada a " + p.getName());
            d.setAnimo(a - rand.nextFloat(1));
            p.setConfidence(c - rand.nextFloat(1));
            System.out.println("El animo de " + d.getName() + "es de: " + d.getAnimo());
            System.out.println("La confiabilidad de: " + p.getName() + " es de " + p.getConfidence());

        }
    }
    //Este metodo le permite a la persona jugar con el perro, esta accion siempre le sue el animo al perro
    public void play(Dog d, person p, float a, float c) {
        System.out.println(p.getName() + " le tira una pelota a: " + d.getName());
        System.out.println(d.getName() + " sale emocionado a recorjerla");
        d.setAnimo(a + (1.0f/p.getConfidence()) * ((rand.nextFloat(2))));
        p.setConfidence(c + rand.nextFloat(1));
        System.out.println("El animo de " + d.getName() + " es de: " + d.getAnimo());
        System.out.println("La confiabilidad de: " + p.getName() + " es de " + p.getConfidence());
    }
    //Este metodo se encarga de mostrar un mensaje final al usuario, el cual dependde de cual haya sido el animo del perro
    public void finalReact(Dog d, person p){
        if (d.getAnimo() > 0){
            System.out.println("EL animo final de " + d.getName() + " fue de " + d.getAnimo());
            System.out.println("Su confiabilidad es de: " + p.getConfidence());
            d.moverCola();
            p.reaccionMoverCola(d);
            System.out.println("Felicidades, logro llevarse muy bien con el perro asignado, siga asi!");
        }
        if (d.getAnimo() == 0){
            System.out.println("EL animo final de " + d.getName() + " fue de " + d.getAnimo());
            System.out.println("Su confiabilidad es de: " + p.getConfidence());
            d.ladrar();
            p.reaccionLadrido(d);
            System.out.println("Mejore para caerle mejor al perro");
        }
        if (d.getAnimo() <0){
            System.out.println("EL animo final de " + d.getName() + " fue de " + d.getAnimo());
            System.out.println("Su confiabilidad es de: " + p.getConfidence());
            d.morder();
            p.reaccionMorder(d);
            System.out.println("No pudo llevarse bien con " + d.getName() + " intente mejorar su actitud");
        }

    }


}

   




