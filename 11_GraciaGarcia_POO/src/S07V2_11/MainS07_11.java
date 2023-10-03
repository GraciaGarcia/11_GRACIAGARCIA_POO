/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S07V2_11;

/**
 *
 * @author Lab21
 */
public class MainS07_11 {
    
 public static void main(String[] args) {
        // Crear objetos de Persona
        Persona persona1 = new Persona("Juan", 25, 1.75);
        Persona persona2 = new Persona("Maria", 30, 1.68);

        // Llamar a métodos
        persona1.saludar();
        persona1.decirEdad();
        persona1.decirEdad(true);
        persona1.cambiarAltura(1.80);
        persona1.cambiarNombre("Juanito");

        persona2.saludar();
        persona2.decirEdad();
        persona2.cambiarAltura(1.70);
        
        
        
    }
}