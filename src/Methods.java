public class Methods {

    public static int firstNumber = 10;
    public static int secondNumber = 5;

    public static void main(String[] args) {
       int result = addition(5,10); // atribuie valoarea rezultata din RES, variabilei RESULT
       System.out.println(result); // afiseaza RESULT
       substraction();


    }

    public static int addition(int first, int second){
        int res = first + second;
        return res;
    }

    public static void substraction(){
        int res = firstNumber - secondNumber;
        System.out.println(res);
    }



}
