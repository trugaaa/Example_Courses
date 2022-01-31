package lesson1.conditions;

public class ConditionsApplication {
    public static void main(String[] args) {
        int a = 5;
        if (a >= 0 && a <= 20  && a!= 5) {
            System.out.println("В переменной a лежит число от 0 до 20");
        }
        else {
            System.out.println("5");
        }

    }
}
