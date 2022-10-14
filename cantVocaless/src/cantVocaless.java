
import java.util.Scanner;
public class cantVocaless {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();

        String caracteres[] = cad.split("");
        int cantidadVocales = 0;
        //iteramos mientras el indice sea menor al tamanio total de la cadena
        for (int i = 0; i < cad.length(); i++) {
            ;
            char car = cad.charAt(i);
            //si el caracter es igual a "a", "e", "i", "o", ó "u" entonces es vocal
            if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u') {
                cantidadVocales++;//contamos cantidad vocales +1
            }
        }

        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;

        for (String c : caracteres) {
            if ((c.equals("a")) || (c.equals("A"))) {
                contA++;
                continue;
                    }
            if ((c.equals("e")) || (c.equals("E"))) {
                contE++;
                continue;
                    }
            if ((c.equals("i")) || (c.equals("I"))) {
                contI++;
                continue;
                    }
            if ((c.equals("o")) || (c.equals("O"))) {
                contO++;
                continue;
                    }
            if ((c.equals("u")) || (c.equals("U"))) {
                contU++;
                continue;
                    }
                }

                System.out.println("\nLas cantidades de vocales son:"+ cantidadVocales );
                System.out.printf("A : %d\n", contA);
                System.out.printf("E : %d\n", contE);
                System.out.printf("I : %d\n", contI);
                System.out.printf("O : %d\n", contO);
                System.out.printf("U : %d\n", contU);
            }
        }
