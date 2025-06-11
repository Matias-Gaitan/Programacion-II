import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSeleccione el nivel de ejercicios:");
            System.out.println("1. Nivel 1");
            System.out.println("2. Nivel 2");
            System.out.println("3. Nivel 3");
            System.out.println("4. Nivel 4");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejecutarNivel1(scanner);
                    break;
                case 2:
                    ejecutarNivel2(scanner);
                    break;
                case 3:
                    ejecutarNivel3(scanner);
                    break;
                case 4:
                    ejecutarNivel4(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta nuevamente.");
            }
        } while (opcion != 0);

        scanner = new Scanner(System.in);
    }
    public static void ejecutarNivel1(Scanner scanner) {
        mostrarMenu();
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                mostrarSaludo();
                break;
            case 2:
                System.out.print("Ingrese su nombre: ");
                String nombre = scanner.nextLine();
                saludoPersonalizado(nombre);
                break;
            case 3:
                System.out.print("Ingrese un texto: ");
                String texto = scanner.nextLine();
                System.out.println("Texto en mayúscula: " + convertirEnMayuscula(texto));
                break;
            case 4:
                System.out.print("Ingrese la base del rectángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double altura = scanner.nextDouble();
                System.out.println("Área del rectángulo: " + calcularAreaRectangulo(base, altura));
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
    public static void ejecutarNivel2(Scanner scanner) {
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        System.out.println("¿Es par?: " + esPar(num));
        System.out.println("Cuadrado: " + calcularCuadrado(num));
        System.out.println("Factorial: " + factorial(num));
    }
    public static void ejecutarNivel3(Scanner scanner) {
        System.out.print("Ingrese cantidad de números a sumar: ");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Suma total: " + sumarNumeros(numeros));

        double[] numsPromedio = new double[cantidad];
        System.out.println("Ingrese los números para el promedio:");
        for (int i = 0; i < cantidad; i++) {
            numsPromedio[i] = scanner.nextDouble();
        }
        System.out.println("Promedio: " + promedioArray(numsPromedio));
    }

    public static void ejecutarNivel4(Scanner scanner) {
        System.out.print("Ingrese cantidad de elementos en el array: ");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];

        System.out.println("Ingrese los números:");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = scanner.nextInt();
        }

        imprimirArray(numeros);
        System.out.println("Array invertido: ");
        imprimirArray(invertirArray(numeros));
        System.out.print("\nIngrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner = new Scanner(System.in);

        String[] nombres = new String[cantidadEstudiantes];
        double[] notas = new double[cantidadEstudiantes];

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.print("Ingrese la nota de " + nombres[i] + ": ");
            notas[i] = scanner.nextDouble();
            scanner = new Scanner(System.in);
        }

        System.out.println("El mejor estudiante es: " + buscarMejorEstudiante(nombres, notas));
    }


    //EJERCICIOS NIVEL 1 ---------------------------------------
    public static void mostrarSaludo(){
        System.out.println("¡Hola, mundo!.");
    }
    public static void saludoPersonalizado(String nombre){
        System.out.println("Hola "+nombre+"!.");
    }
    public static double calcularAreaRectangulo(double base, double altura){
        double areaRectangulo = base * altura;
        return areaRectangulo;
    }
    public static String convertirEnMayuscula(String texto){
        String textoMayuscula = texto.toUpperCase();
        return textoMayuscula;
    }
    public static void mostrarMenu(){
        System.out.println("1. ---> Mostrar saludo\n2. ---> Mostrar nombre\n3. ---> Mostrar nombre en mayúscula\n4. ---> Calcular área de un rectángulo");
    }

    //EJERCICIOS NIVEL 2 -----------------------------------------

    public static boolean esPar(int numero){
        return (numero % 2 == 0)? true : false;
    }
    public static int calcularCuadrado(int numero){
        int cuadrado = numero * numero;
        return cuadrado;

    }
    public static long factorial(int num){
        if(num == 0){
            return 1;
        }
        return num*factorial((num-1));
    }

    //EJERCICIOS NIVEL 3 -----------------------------------------

    public static int sumarNumeros(int... numeros){
        int suma = 0;
        for(int num : numeros){
            suma = suma + num;
        }
        return suma;
    }
    public static double promedioArray(double[] numeros){
        double suma = 0, prom;
        for(int i =0; i<numeros.length;i++){
            suma = suma + numeros[i];
        }
        prom = suma/numeros.length;
        return prom;
    }
    public static boolean buscarValor(int[] numeros, int valor){
        boolean valorExiste = false;
        for(int num : numeros){
            if(num == valor){
                valorExiste = true;
            }
        }
        return valorExiste;
    }
    public static int contarOcurrencias(String[] palabras, String clave){
        int ocurrencias = 0;
        for(String palabra : palabras){
            if(palabra.equalsIgnoreCase(clave)){
                ocurrencias++;
            }
        }
        return ocurrencias;
    }

    //EJERCICIOS NIVEL 4 -----------------------------------------

    public static void imprimirArray(int[] numeros){
        String impresion = "Números del array: { ";
        for(int i =0; i<numeros.length; i++){
            if(i != numeros.length-1){
                impresion = impresion +numeros[i]+", ";
            }
            else {
                impresion = impresion +numeros[i]+" }";
            }
        }
        System.out.println(impresion);
    }
    public static int[] invertirArray(int[] numeros){
        for(int i =0, j = numeros.length-1; i<j; i++, j--){
            int aux = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = aux;
        }
        return numeros;
    }
    public static String buscarMejorEstudiante(String[] nombres, double[] notas){
        double mejorNota = 0;
        int posiciónEstudiante =0;
        String mejorEstudiante;
        for(int i =0;i<notas.length;i++){
            if(notas[i]>mejorNota){
                mejorNota = notas[i];
                posiciónEstudiante = i;
            }
        }
        mejorEstudiante = nombres[posiciónEstudiante];
        return mejorEstudiante;
    }

}