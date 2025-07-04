package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Person> people;

    public Group() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        boolean isOlder = person.isOlder();
        boolean name5Check = person.name5Check();
        boolean nameAZCheck = person.nameAZcheck();
        boolean ageCheck = person.ageCheck();

        if (isOlder && name5Check && nameAZCheck && ageCheck) {
            people.add(person);
            System.out.println("Se agregó una persona: " + person.getName());
        } else {
            System.err.println("No se puede agregar a la persona: " + person.getName());
            if (!isOlder) System.err.println("La persona debe ser mayor de 18 años");
            if (!name5Check) System.err.println("El nombre de la persona deber tener más de 4 letras");
            if (!nameAZCheck) System.err.println("El nombre de la persona debe contener solo letras");
            if (!ageCheck) System.err.println("La edad de la persona debe ser entre 0 y 120 años");

        }

    }




    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
