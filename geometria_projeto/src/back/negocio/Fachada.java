package back.negocio;

import back.dado.Circulo;
import back.dado.Retangulo;
import back.dado.Triangulo;

public class Fachada implements iFachada {

    @Override
    public double calcularAreaCirculo(double raio) {
        Circulo c = new Circulo(raio);
        return c.calcularArea();
    }

    @Override
    public double calcularAreaRetangulo(double largura, double altura) {
        Retangulo r = new Retangulo(largura, altura);
        return r.calcularArea();
    }

    @Override
    public double calcularAreaTriangulo(double base, double altura) {
        Triangulo t = new Triangulo(base, altura);
        return t.calcularArea();
    }
}