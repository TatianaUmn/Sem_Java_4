import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


//Задача1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


public class SemFourTaskOneDz {
    public static void main(String[] args) {
        int a;
        LinkedList<Integer> linkedls = new LinkedList<>();

        System.out.println("Введите количество элементов списка:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
            for (int i = 0; i <= a - 1; i++) {
                linkedls.add((int) (Math.random()*100));
            }
            System.out.print("Начальный список: " + linkedls);
            Collections.reverse(linkedls);
            System.out.print("\nСписок после поворота: " + linkedls);
            in.close();
        }
            
}
