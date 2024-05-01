package Actividad3java;
import java.util.Random;
import java.util.Scanner;

// Clase Animal
class Animal {
    private String foto;
    private String comida;
    private String localizacion;
    private String tamano;

    public void hacerRuido() {
        // Implementación genérica de hacer ruido para un animal
        System.out.println("El animal hace ruido.");
    }

    public void comer() {
        // Implementación genérica de comer para un animal
        System.out.println("El animal está comiendo.");
    }

    public void dormir() {
        // Implementación genérica de dormir para un animal
        System.out.println("El animal está durmiendo.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Seleccione el tipo de animal:");
        System.out.println("1. León");
        System.out.println("2. Tigre");
        System.out.println("3. Gato");
        System.out.println("4. Lobo");
        System.out.println("5. Perro");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Leon leon = new Leon();
                ejecutarAccionAleatoria(leon, random);
                break;
            case 2:
                Tigre tigre = new Tigre();
                ejecutarAccionAleatoria(tigre, random);
                break;
            case 3:
                Gato gato = new Gato();
                ejecutarAccionAleatoria(gato, random);
                break;
            case 4:
                Lobo lobo = new Lobo();
                ejecutarAccionAleatoria(lobo, random);
                break;
            case 5:
                Perro perro = new Perro();
                ejecutarAccionAleatoria(perro, random);
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }

    private static void ejecutarAccionAleatoria(Animal animal, Random random) {
        int accionAleatoria = random.nextInt(3);
        switch (accionAleatoria) {
            case 0:
                animal.comer();
                break;
            case 1:
                animal.hacerRuido();
                break;
            case 2:
                if (animal instanceof Gato) {
                    ((Gato) animal).vacunar();
                } else if (animal instanceof Perro) {
                    ((Perro) animal).vacunar();
                }
                break;
            default:
                System.out.println("Acción no válida");
        }
    }
}


// Clase Felino
class Felino extends Animal {
    public void rugir() {
        // Implementación genérica de rugir para un felino
        System.out.println("El felino está rugiendo.");
    }
}

// Clase Leon
class Leon extends Felino {
    @Override
    public void comer() {
        // Implementación específica de comer para un león
        System.out.println("El león está comiendo.");
    }

    @Override
    public void hacerRuido() {
        // Implementación específica de hacer ruido para un león
        System.out.println("El león está rugiendo.");
    }
}

// Clase Tigre
class Tigre extends Felino {
    @Override
    public void comer() {
        // Implementación específica de comer para un tigre
        System.out.println("El tigre está comiendo.");
    }

    @Override
    public void hacerRuido() {
        // Implementación específica de hacer ruido para un tigre
        System.out.println("El tigre está rugiendo.");
    }
}

// Clase Gato
class Gato extends Felino {
    public void vacunar() {
        // Implementación específica de vacunar para un gato
        System.out.println("El gato está siendo vacunado.");
    }
    @Override
    public void hacerRuido() {
        System.out.println("El gato esta maullando.");
    }
    @Override
    public void comer() {
        System.out.println("El gato está comiendo.");
    }
}

// Clase Canino
class Canino extends Animal {
    public void rugir() {
        // Implementación genérica de rugir para un canino
        System.out.println("El canino está rugiendo.");
    }
}

// Clase Lobo
class Lobo extends Canino {
    @Override
    public void comer() {
        // Implementación específica de comer para un lobo
        System.out.println("El lobo está comiendo.");
    }

    @Override
    public void hacerRuido() {
        // Implementación específica de hacer ruido para un lobo
        System.out.println("El lobo está aullando.");
    }
}

// Clase Perro
class Perro extends Canino {
    public void vacunar() {
        // Implementación específica de vacunar para un perro
        System.out.println("El perro está siendo vacunado.");
    }

    public void sacarPaseo() {
        // Implementación específica de sacar paseo para un perro
        System.out.println("El perro está dando un paseo.");
    }
    @Override
    public void hacerRuido() {
        System.out.println("El perro esta ladrando.");
    }
    @Override
    public void comer() {
        System.out.println("El perro está comiendo.");
    }
}

