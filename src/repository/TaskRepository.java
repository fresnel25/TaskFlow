package repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import models.Task;

public class TaskRepository implements Iterable<Task> {

    private List<Task> tasks = new ArrayList<>();

    public void ajouterTask(Task t) {
        tasks.add(t);
        System.out.println("tache ajoutée avec succès");
    }

    public void afficherTasks() {
        // tasks.size() == 0
        if (tasks.isEmpty()) {
            System.out.println("Aucune tâche enregistrée.");
            return;
        }
        for (Task t : tasks) {
            System.out.println(t);
            System.out.println("--------------------");
        }

    }

    public void afficherTaskAvecIterator() {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task t = iterator.next();
            System.out.println(t);
            System.out.println("--------------------");
        }
    }

    public Task rechercherParId(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public void supprimerTask(int id) {
        boolean remo = false;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                remo = true;
                break;
            }
        }
        System.out.println(remo ? "Tâche supprimée" : "Cette tâche n'existe pas");
    }

    @Override 
    public Iterator<Task> iterator()
    {
        return tasks.iterator();
    }

}
