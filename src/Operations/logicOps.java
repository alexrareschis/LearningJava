package Operations;

public class logicOps {
    // In clasa LogicalOps, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(), si sa primeasca doua int-uri
    // ca si parametrii. Folosind if - else, verificati in interiorul metodei care numar este mai mare,
    // dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.

    public int checkBiggerNumber(int smallerNumber, int biggerNumber) {

        if (smallerNumber < biggerNumber) {
            return biggerNumber;
        } else {
            return smallerNumber;
        }
    }
    // Creati o metoda de tip String, care sa primeasca un parametru de tip String. Verificati daca textul ce vine ca si
    // parametru este egal cu “FastTrackIT”. Daca da, atunci metoda sa returneze “Learning text comparison”.
    // Daca nu, atunci metoda sa returneze “Got to try some more”.

    public String checkText(String text) {

        if (text.equals("FastTrackIT")) {
            return "Learning text comparision.";
        } else {
            return "Got to try some more.";
        }

    }
    // Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int.
    // Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru este mai mic sau
    // egal cu 3, returnati textul si numarul, in ordinea asta. Daca textul nu este “FastTrackIT” si numarul este mai mare sau
    // egal cu 4, returnati numarul si textul, in ordinea asta. Apelati metoda in main() pentru a verifica daca functioneaza.

    public String returnTextNumber (String text, int number) {

        if (text.equals("FastTrackIT ") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrackIT ") && number >= 4) {
            return number + text;
        } else {
            return "Neither conditions are true";
        }
    }
    // Creati o metoda de tip String, care sa primeasca un parametru de tip int. Daca numarul primit este mai mare de 8,
    // SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul.
    // Daca nu, sa printeze “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.

    public String orCondition(int number) {

        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm): " + number;
        }
    }
    // Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
    // Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
    // Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de
    // 3 returnati “The number is lower than 3”. Apelati metoda in main() pentru a verifica daca functioneaza.

    public String greaterThanEqualTo (int number) {

        if ( number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3); {
            return "The number is lower than 3";
        }
    }
    // Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
    // Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul
    // "The number is:  x !" unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea
    // stringului "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public void printNumber (int number) {

        switch (number) {

            case 0:
                System.out.println("The number os 0");
                break;

            case 1:
                System.out.println("The number is 1");
                break;

            case 2:
                System.out.println("The number is 2");
                break;

            case 3:
                System.out.println("The number is 3");
                break;

            case 4:
                System.out.println("The number is 4");
                break;

            case 5:
                System.out.println("The number is 5");
                break;

            case 6:
                System.out.println("The number is 6");
                break;

            case 7:
                System.out.println("The number is 7");
                break;

            case 8:
                System.out.println("The number is 8");
                break;

            case 9:
                System.out.println("The number is 9");
                break;

            default:
                System.out.println("Not allowed");
        }
    }
    // Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals.
    // Daca numarul e par sa returneze true iar daca e impar sa returnese false. Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean isNumberEven (int number) {

        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    // Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
    // iar metoda sa iti zica daca daca persoana are drept de vot. Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean isEligibleToVote (int number) {

        if (number >= 18) {
            return true;
        } else {
            return false;
        }
    }
    // Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.

    public int returnBiggestNumber (int firstNumber, int secondNumber, int thirdNumber){

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}






