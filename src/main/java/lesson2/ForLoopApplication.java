package lesson2;

public class ForLoopApplication {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }


        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.println("i = " + i + "; j = " + j);
            }
        }
    }
}
