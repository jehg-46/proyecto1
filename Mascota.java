public class Mascota {
    private String nombre;  // Atributo encapsulado
    private String tipo;  // Atributo encapsulado

    // Constructor
    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    // Método
    public void saludar() {
        System.out.println("¡Hola, soy " + nombre + ", soy la mascota de Jhon, y soy de Raza "+ tipo + "!");
    }
    public static void main(String[] args) {
        Mascota miMascotaDeSUNOMBRE=new Mascota("Taizon", " french poodle");
        System.out.println("Ahora que se a creado la mascota, se creara el metodo saludar");
        miMascotaDeSUNOMBRE.saludar();
    }
}
