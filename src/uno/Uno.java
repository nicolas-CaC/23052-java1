package uno;

import java.util.Scanner;

public class Uno {

    public static void main(String[] args) {

//        ctrl + E = Borrar línea
//        ctrl + X = Corta la línea
//        ctrl + C = Copia la línea
//        sout + tab = Imprime en línea

        Scanner entrada = new Scanner(System.in);

        System.out.println("Alo aló");
        System.err.println("Si en rojo");

        System.out.print("Holis");
        System.out.print("Hola de nuevo");

        System.out.print("\nIngrese su nombre de usuario: ");
        String nombre_usuario = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad_usuario = entrada.nextInt();

//        shift + alt + f = Formateo del código
//        alt + enter = Sugerencia de soluciones al código
//        ctrl + r = Resalta las repeticiones de la variable donde estamos parados
//        fori + tab = Crea un for  
//        iff + tab = Crea un if
//        ifelse + tab = Crea un if else
//        sw + tab = Crea un switch 
//        dowhile + tab = Crea un Do while
//        whilexp + tab = Crea un while
//        trycatch + tab = Crea un try catch
//        fy + tab = Crea un finally
//        psvm + tab = Crea main class

        System.out.println("Nombre del usuario: " + nombre_usuario);
        System.out.println("Edad del usuario: " + edad_usuario);

//        %d = decimal, numero
//        %c = Char
//        %f = coma flotante
//        %i = integer
//        %s = string
//        %u = unsigned integer
//        %t = fecha
        System.out.printf("Su nombre es %s y su edad es %d\n", nombre_usuario, edad_usuario);

        String palabra1 = "Fin";
        String palabra2 = "Programa";
        System.out.println(palabra1 + " del " + palabra2);

        TipoNumericos numericos = new TipoNumericos(3, "Chao");

        System.out.println(numericos.a);
        System.out.println(numericos.g);
        System.out.println(numericos.aa);
    }
}
