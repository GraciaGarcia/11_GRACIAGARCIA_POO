/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07V2_11;

public class Persona {

    public Persona(String maria, int par, double par1) {
    }
    // Atributos
    private String nombre;
    private int edad;
    private double altura;


    // Métodos
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    public void cumplirAnios() {
        edad++;
    }

    // Sobrecarga de métodos
    public void decirEdad() {
        System.out.println("Tengo " + edad + " años.");
    }

    public void decirEdad(boolean enMeses) {
        if (enMeses) {
            System.out.println("Tengo " + (edad * 12) + " meses.");
        } else {
            decirEdad();
        }
    }

    // Métodos con valores de retorno (3 tipos de datos diferentes)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    // Métodos con parámetros y argumentos
    public void cambiarAltura(double nuevaAltura) {
        altura = nuevaAltura;
    }