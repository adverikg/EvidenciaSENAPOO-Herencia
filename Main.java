package Actividad3java;
import java.util.Scanner;

// Superclase Figuras
class Figuras {
    protected double area;
    protected double perimetro;

    // Métodos get y set para área
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // Métodos get y set para perímetro
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    // Métodos a ser implementados por las subclases
    public void calcularArea() {
        // Implementación en subclases
    }

    public void calcularPerimetro() {
        // Implementación en subclases
    }
}

// Clase Circulo
class Circulo extends Figuras {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación de los métodos de la superclase
    @Override
    public void calcularArea() {
        area = Math.PI * radio * radio;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }
}

// Clase Triangulo
class Triangulo extends Figuras {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Implementación de los métodos de la superclase
    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
    }
}

// Clase Rectángulo
class Rectangulo extends Figuras {
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación de los métodos de la superclase
    @Override
    public void calcularArea() {
        area = base * altura;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * (base + altura);
    }
}

// Clase principal para la aplicación por consola
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija una figura: ");
        System.out.println("1. Círculo");
        System.out.println("2. Triángulo");
        System.out.println("3. Rectángulo");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                Circulo circulo = new Circulo(radio);
                circulo.calcularArea();
                circulo.calcularPerimetro();
                System.out.println("Área del círculo: " + circulo.getArea());
                System.out.println("Perímetro del círculo: " + circulo.getPerimetro());
                break;
            case 2:
                System.out.println("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.println("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();
                System.out.println("Ingrese el lado 1 del triángulo: ");
                double lado1 = scanner.nextDouble();
                System.out.println("Ingrese el lado 2 del triángulo: ");
                double lado2 = scanner.nextDouble();
                System.out.println("Ingrese el lado 3 del triángulo: ");
                double lado3 = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(base, altura, lado1, lado2, lado3);
                triangulo.calcularArea();
                triangulo.calcularPerimetro();
                System.out.println("Área del triángulo: " + triangulo.getArea());
                System.out.println("Perímetro del triángulo: " + triangulo.getPerimetro());
                break;
            case 3:
                System.out.println("Ingrese la base del rectángulo: ");
                double baseRect = scanner.nextDouble();
                System.out.println("Ingrese la altura del rectángulo: ");
                double alturaRect = scanner.nextDouble();
                Rectangulo rectangulo = new Rectangulo(baseRect, alturaRect);
                rectangulo.calcularArea();
                rectangulo.calcularPerimetro();
                System.out.println("Área del rectángulo: " + rectangulo.getArea());
                System.out.println("Perímetro del rectángulo: " + rectangulo.getPerimetro());
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
