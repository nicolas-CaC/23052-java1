package uno;

import dos.Arrays;
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
        TipoBooleanos booleanos = new TipoBooleanos(); 
        TipoCadenas cadenas = new TipoCadenas("bien");

        System.out.println(numericos.a);
        System.out.println(numericos.g);
        System.out.println(numericos.aa);
        System.out.println(booleanos.b);
        System.out.println(cadenas.a);
        System.out.println(cadenas.b);
        System.out.println(cadenas.c);
        System.out.println(cadenas.d);
        
//        Arrays array1 = new Arrays();
//        System.out.println(array1.a);

        Arrays nuevoArray = new Arrays();
        
        System.out.println(nuevoArray.arrayString[0]);
        System.out.println(nuevoArray.arrayNumero[2]);
        System.out.println(nuevoArray.arrayBooleano[1]);
        System.out.println(nuevoArray.arrayByte[3]);
        
        System.out.println(nuevoArray.matriz[0][0]);
        System.out.println(nuevoArray.matriz[0][1]);
        System.out.println(nuevoArray.matriz[1][0]);
        System.out.println(nuevoArray.matriz[1][1]);
        
        byte[] x = cadenas.c.getBytes();
        System.out.println(x.length);
    }
}
