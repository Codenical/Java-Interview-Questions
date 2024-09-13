package LogicBuilding;

/**
 * Created by ChandanKrv on 12 September, 2024.
 * --------------------------------------------
 * Q. Problem Statement :
 * Swap two numbers without using a 3rd variable.
 */
public class _6_Swap2Numbers {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;

        //First Method
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1 + " " + num2);

        //Second Method, Using XOR
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println(num1 + " " + num2);
    }
}
