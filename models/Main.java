package models;

import java.util.HashSet;

public class Main {

        public static void main(String[] args) {

                Task t1 = new Task(1, "Apprendre Java", "Étudier les classes");
                Task t2 = new Task(1, "Apprendre Python", "Étudier les fonctions");
                Task t3 = new Task(2, "Apprendre Java", "Étudier les classes");

                System.out.println(t1.equals(t2));

                HashSet <Task> tasks = new HashSet<>();
                tasks.add(t1);
                tasks.add(t2);
                tasks.add(t3);

                System.out.println(tasks);
        }
}