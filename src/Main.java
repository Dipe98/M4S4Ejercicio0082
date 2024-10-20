import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];

        personas[0] = new Persona("Juan", 25, 70.5, 1.75);
        personas[1] = new Persona("María", 17, 55.0, 1.65);
        personas[2] = new Persona("Carlos", 45, 80.0, 1.80);
        personas[3] = new Persona("Ana", 30, 62.5, 1.70);
        personas[4] = new Persona("Luis", 16, 58.0, 1.68);

        for (Persona persona : personas) {
            System.out.println(persona.obtenerInformacion());
            try {
                TimeUnit.SECONDS.sleep(3);   //Pausa de 3 segundos en programa para que en consola
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}