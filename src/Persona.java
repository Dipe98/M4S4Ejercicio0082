public class Persona {
    private String nombre;
    private int edad;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String obtenerEstadoIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) return "bajo peso";
        else if (imc < 25) return "peso normal";
        else if (imc < 30) return "sobrepeso";
        else return "obesidad";
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public String obtenerInformacion() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append(" :\n\n");
        sb.append("Calculando su IMC....\n");
        sb.append(String.format("Su índice de masa muscular es: %.1f\n", calcularIMC()));
        sb.append("Usted se encuentra con ").append(obtenerEstadoIMC()).append("\n\n");
        sb.append("Su edad es: ").append(edad).append("\n");
        sb.append("Usted es ").append(esMayorDeEdad() ? "mayor" : "menor").append(" de edad\n\n");
        sb.append(String.format("Persona [nombre=%s, edad=%d, peso=%.1f, altura=%.1f]", nombre, edad, peso, altura));
        return sb.toString();
    }
}
