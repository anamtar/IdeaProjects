package collections_examples;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesExamples {

    public static void main(String[] args) {

        Queue<String> usersQueue = new PriorityQueue<>(); // stworzenie kolejki

        usersQueue.add("user11");
        usersQueue.add("user3");
        usersQueue.add("zeroUser");
        usersQueue.add("admin");
        usersQueue.add("dev");

        System.out.println(usersQueue);

        System.out.println(usersQueue.poll()); // usuwa pierwszy element z kolejki

        System.out.println(usersQueue);


    }
}
