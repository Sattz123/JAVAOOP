package JAVAADT.Tutorial5;

import java.util.List;

public class CovidVaccine {
    String SID;
    String firstName;
    String lastName;
    List<String> previousVaccines;

    public CovidVaccine(String SID, String firstName, String lastName, List<String> previousVaccines) {
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.previousVaccines = previousVaccines;
    }

    @Override
    public String toString() {
        return "SID: " + SID + ", Name: " + firstName + " " + lastName + ", Vaccines: " + previousVaccines;
    }
}