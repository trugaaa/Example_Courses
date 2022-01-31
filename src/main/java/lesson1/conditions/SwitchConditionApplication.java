package lesson1.conditions;

public class SwitchConditionApplication {

    public static void main(String[] args) {
        int i = 3;

        switch (i) {
            case 0: {
                System.out.println(0);
                break;
            }
            case 1: {
                System.out.println(1);
                break;
            }
            default: {
                System.out.println("default");
                break;
            }
        }
    }
}
