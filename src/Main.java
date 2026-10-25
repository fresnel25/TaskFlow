import models.Task;
import repository.TaskRepository;

public class Main {

        public static void main(String[] args) {

                TaskRepository repo = new TaskRepository();

                repo.ajouterTask(new Task(1, "Apprendre Java", "Étudier les classes"));
                repo.ajouterTask(new Task(2, "Apprendre Python", "Étudier les fonctions"));
                repo.ajouterTask(new Task(3, "Apprendre Java", "Étudier les classes"));

                repo.supprimerTask(3);

                /* repo.afficherTasks(); */

                for(Task t : repo){
                        System.out.println(t);
                        System.out.println("-------------------------");
                }

        }
}