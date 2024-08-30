import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Inserta el numero de ejercicio que quieres ver:");
        String ejnum = scanner.nextLine();

if (ejnum.equals(1)){
    System.out.println("¿Cual es tu nombre?");
    String nombre = scanner.nextLine();
    System.out.println("¡¡Bienvenido/a " + nombre + "!!");
} else if (ejnum.equals(2)) {
    JOptionPane jOptionPane = new JOptionPane(System.in);
    System.out.println("¿Cual es tu nombre?");
    String nombre = scanner.nextLine();
    JOptionPane.showMessageDialog(null, "¡¡Bienvenido/a " + nombre + "!!");
} else if (ejnum.equals(3)) {
    int primerNum = 2;
    int segundoNum = 4;

    int multiplicacion = (primerNum * segundoNum);
    int suma = (primerNum + segundoNum);
    int resta = (segundoNum - primerNum);
    int division = (segundoNum / primerNum);
    int resto = (primerNum % segundoNum);

    System.out.println("Los numeros a calcular son " + primerNum + " " + segundoNum);
    System.out.println("Sumados son: " + suma);
    System.out.println("Restados (de manera entera) son: " + resta );
    System.out.println("Multiplicados son: " + multiplicacion);
    System.out.println("Divididos (de manera entera) son: " + division);
    System.out.println("Su resto al dividir (de manera entera) es: " + resto); }
else if (ejnum.equals(4)) {
//primera prueba
int n1 = 2;
int n2 = 4;
//segunda prueba
int n3 = 6;
int n4 = 3;
//tercera prueba
int n5 = 9;

//inicio primer prueba

        System.out.println("Los numeros son: " + n1 + " y " + n2);
        if (n1 < n2) {
        System.out.println(n1 + " es menor a " + n2);
        } else if (n2 < n1) {
        System.out.println(n1 + " es mayor a " + n2);
        } else System.out.println("Son iguales");

//segunda prueba con distintos valores
        System.out.println("Los numeros son: " + n3 + " y " + n4);
        if (n3 < n4) {
        System.out.println(n3 + " es menor a " + n4);}
        else if (n4 < n3) {
        System.out.println(n3 + " es mayor a " + n4); }
        else{
        System.out.println("Son iguales"); }

        // tercera prueba con valores iguales
        System.out.println("Los numeros son: " + n5 + " y " + n5);
        if (n5 < n5) {
        System.out.println(n5 + " es menor a " + n5);}
        else if (n5 < n5) {
        System.out.println(n5 + " es mayor a " + n5); }
        else{
        System.out.println("Son iguales"); }
        }
else if (ejnum.equals(5)) {

            System.out.println("Ingresa un numero para saber si es divisible por 2:");

            int num1 = scanner.nextInt();

            if (num1 % 2 == 0)
            {
                System.out.println("El numero " + num1 + " es divisible por 2.");
            } else {
                System.out.println("El numero " + num1 + " no es divisible por 2.");
            }
}
else if (ejnum.equals(6)) {

    System.out.println("Ingrese el precio para saber su costo con IVA");
    double precio = scanner.nextDouble();

//calculo

    double total;

    double impuesto = ((21 * precio) / 100);
    total = (impuesto + precio);

//mensaje en pantalla

    System.out.println("Su total con impuestos es de: " + total);


}
else if (ejnum.equals(7)) {

            int num = 1;
            int cuenta = 1 ;

            while (cuenta <= 100){
                cuenta++;

                if (cuenta % 2 == 0 ){
                    System.out.println(cuenta);

}
else if (ejnum.equals(8)) {

                    for ( int cuentaFor = 1; cuentaFor <= 100 ;cuentaFor++)
                        System.out.println(cuentaFor);
                }
            }

}
else if (ejnum.equals(9)) {



}
else if (ejnum.equals(10)) {

    int num;
    do {
        System.out.println("Ingrese un numero;");
        num = scanner.nextInt();

    } while (num <= 0) ;

    System.out.println(num);

}
else if (ejnum.equals(11)) {

    int intentos = 3;
    String contrasena = "1234";
    String contraUsuario;

    do { System.out.println(" Ingrese la contraseña. " + intentos + " intentos restantes.");
        contraUsuario = scanner.nextLine();
        if (contraUsuario.equals(contrasena)) {
            System.out.println("Acceso permitido");
            break;
        } else {
            intentos--;
            if (intentos > 0) {
                System.out.println("Incorrecto, " + intentos + " intentos restantes.");
            } else {
                System.out.println("Acceso denegado, 0 intentos restantes");
            }
        }
    } while (!contraUsuario.equals(contrasena) && intentos > 0);

}
else if (ejnum.equals(12)) {

}
else if (ejnum.equals(13)) {

}
else if (ejnum.equals(14)) {

}
else {

}

}
    }}