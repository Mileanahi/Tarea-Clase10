/*
Ejercicio 1 — Clase Mascota

Autora: Milena Moyano

Enunciado
Crea una clase llamada Mascota que represente una mascota sencilla.
La clase debe tener los siguientes atributos:
• nombre
• especie
• edad
*/
public class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota (String nombre, String especie, int edad) {
    this.nombre = nombre;
    this.especie = especie;
    this.edad = edad; 
    }
    public void mostrarInfo (){
    System.out.println("Mascota: " + nombre + "| Especie: " + especie + "| Edad: "+ edad+ "años");
    }
}


