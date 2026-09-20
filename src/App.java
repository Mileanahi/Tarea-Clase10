public class App {
    public static void main(String[] args) { 
        // ================ EJERCICIO 1: MASCOTA ================
        System.out.println("==== EJERCICIO 1 - CLASE MASCOTA ==== ");
        Mascota mascota1 = new Mascota("Firulais", "Perro", 3);
        Mascota mascota2 = new Mascota("Michi", "Gato ", 2);

        mascota1.mostrarInfo();
        mascota2.mostrarInfo(); 
        System.out.println(" =================================");

        System.out.println( "==== EJERCICIO 2 - CLASE TELÉFONO ====");
        Telefono telefono1 = new Telefono("Samsung", "A15", 250.0);

        System.out.println("Información inicial: ");
        telefono1.mostrarInfo(); 

        System.out.println("Cambiando precio a $280.0, es válido");
        telefono1.setPrecio(280.0);
        telefono1.mostrarInfo();

        System.out.println("No puedes cambiar precio a -$100.0, es inválido");
        telefono1.setPrecio(-100.0);
        telefono1.mostrarInfo();
    }
}
