package JAVAADT.Tutorial5;

import java.util.*;

public class MainCovidVac {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        Random rand = new Random();

        //Add 10 applicants to the list
        list.insert(new CovidVaccine("672115012", "Alice", "Smith", Arrays.asList("Pfizer", "Moderna")));
        list.insert(new CovidVaccine("672115035", "Bob", "Johnson", Arrays.asList("AstraZeneca")));
        list.insert(new CovidVaccine("672115047", "Charlie", "Brown", Arrays.asList("Pfizer")));
        list.insert(new CovidVaccine("672115024", "David", "Williams", Arrays.asList("Moderna", "Pfizer")));
        list.insert(new CovidVaccine("672115048", "Emma", "Davis", Arrays.asList("Sinovac")));
        list.insert(new CovidVaccine("672115054", "Frank", "Miller", Arrays.asList("Pfizer", "J&J")));
        list.insert(new CovidVaccine("672115002", "Grace", "Wilson", Arrays.asList("AstraZeneca", "Pfizer")));
        list.insert(new CovidVaccine("672115078", "Henry", "Moore", Arrays.asList("Moderna")));
        list.insert(new CovidVaccine("672115034", "Ivy", "Taylor", Arrays.asList("Pfizer", "Sinovac")));
        list.insert(new CovidVaccine("672115011", "Jack", "Anderson", Arrays.asList("J&J")));

        //Traversal the list
        System.out.println("Applicants in the list:");
        list.traversal();

        //Random delete 2 of them
        for (int i = 0; i < 2; i++) {
            if (list.isEmpty()) break;
            int randomIndex = rand.nextInt(list.getSize());
            Node current = list.head;
            for (int j = 0; j < randomIndex; j++) {
                current = current.next;
            }
            String sidToDelete = current.data.SID;
            System.out.println("\nDeleting applicants with SID: " + sidToDelete);
            list.delete(sidToDelete);
        }

        //Traversal to show the remaining applicants
        System.out.println("\nApplicants after random deletions:");
        list.traversal();

        //Delete all applicants
        list.deleteAll();

        //Show remaining applicants
        System.out.println("\nApplicants after deleting all:");
        System.out.println(list.getSize());
    }
}