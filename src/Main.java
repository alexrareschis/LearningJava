import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        //1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        System.out.println("Hello\nAlex!");

        // 2. Printati rezultatul sumei a doua numere(orice numere)
        System.out.println("\n2. Printati rezultatul sumei a doua numere(orice numere)");
        int a = 10;
        int b = 3;
        int rezultat1 = a + b;
        System.out.println("Rezultatul sumei = " + rezultat1);

        // 3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
        System.out.println("\n3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.");
        float rezultat2 = (float)a/b;
        System.out.println("Rezultatul impartirii = "+rezultat2);

        //4. Printati rezultatul urmatoarelor operatiuni:
        // a. -5 + 8 * 6
        System.out.println("\n4. Rezultatul operatiunilor:\n");
        System.out.println("-5 + 8 * 6 = "+ (-5+8 * 6));

        // b. (55+9) % 9
        int x = 55+9;
        int y = 9;
        int rezultat3 = x%y;
        System.out.println("(55+9) % 9 = "+rezultat3);

        // c. 20 + -3*5 / 8
        float z = (float) -3*5/8;
        x = 20;
        float rezultat4 = x+z;
        System.out.println("20 + -3*5 / 8 = "+rezultat4);

        // d. 5 + 15 / 3 * 2 - 8 % 3
        int rezultat5 = 5+15/3*2-8%3;
        System.out.println("5 + 15 / 3*2 - 8 % 3 = "+rezultat5);


        // 5. Publicati ca raspuns la aceasta tema link-ul de la repository-ul din GitHub. Atasat video de urcare a proiectului in Github.










    }
}
