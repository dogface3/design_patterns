package Iterator;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        Iterator<Integer> iterator = fibonacciSequence.iterator();

        System.out.println("how many numbers to show");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i= 0; i<count; i++){
            if (iterator.hasNext()){
                System.out.println(iterator.next() + " ");
            }
        }
    }
}
