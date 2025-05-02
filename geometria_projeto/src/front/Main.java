package front;

import back.negocio.Fachada;

public class Main {
    public static void main(String[] args) {
        Fachada fachada = new Fachada();
        System.out.println("Área do círculo com raio 5: " + fachada.calcularAreaCirculo(5));
        System.out.println("Área do retângulo 4x6: " + fachada.calcularAreaRetangulo(4, 6));
        System.out.println("Área do triângulo base 3 e altura 4: " + fachada.calcularAreaTriangulo(3, 4));
    }
}