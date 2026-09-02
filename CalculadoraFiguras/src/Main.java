public class Main {

    public static void main(String[] args) {

        Figura[] figuras = {
                new Circulo(5),
                new Rectangulo(8, 4),
                new Triangulo(6, 3)
        };

        System.out.println("=== Cálculo de áreas ===\n");
        System.out.println("=== Hans Douglas Edenilzon Alvarado Milián ===\n");
        System.out.println("=== 9941-25-17016 ===\n");

        for (Figura figura : figuras) {

            figura.mostrarInformacion();

            System.out.printf("Área: %.2f%n", figura.calcularArea());

            System.out.println();
        }
    }
}