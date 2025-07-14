package ejercicio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupTest {

    /*
    Dadas 5 personas (Juan, Pedro, Ana, Luz y Julián) y una colección vacía de objetos
    tipo Persona, cuando se intentan agregar estas a la colección, el tamaño de la
     colección debería ser 2.
     */

    @Test
    public void caseOne() {
        //DADO
        Person juan = new Person("Juana", 22);
        Person pedro = new Person("Pedro", 32);
        Person ana = new Person("Analia", 23);
        Person luz = new Person("Luz", 21);
        Person julian = new Person("Julian", 35);
        Group group = new Group();

        //CUANDO
        group.addPerson(juan);
        group.addPerson(pedro);
        group.addPerson(ana);
        group.addPerson(luz);
        group.addPerson(julian);

        //ENTONCES -> el tamaño de la colección sea 2
        Assertions.assertTrue(group.getPeople().size() == 4);
    }


    /*Dadas 5 personas (18 años, 17 años, 22 años, 14 años y 32 años)
    el tamaño de la colección debería ser 3.      */
    @Test
    public void caseTwo() {
        //DADO
        Person juana = new Person("Juana", 18);
        Person pedro = new Person("Pedro", 17);
        Person analia = new Person("Analia", 22);
        Person luciana = new Person("Luciana", 14);
        Person julian = new Person("Julian", 32);
        Group group = new Group();


        //CUANDO
        group.addPerson(juana);
        group.addPerson(pedro);
        group.addPerson(analia);
        group.addPerson(luciana);
        group.addPerson(julian);

        //ENTONCES
        Assertions.assertTrue(group.getPeople().size() == 3);

    }


    /*Dadas 5 personas (N1c0las, Tomas, 3steban, Carlos\sV, Francisco\sII)
    el tamaño de la colección debería ser 1      */
    @Test
    public void caseThree() {
        //DADO
        Person nicolas = new Person("N1c0las", 18);
        Person tomas = new Person("Tomas", 19);
        Person esteban = new Person("3steban", 19);
        Person carlos = new Person("Carlos\\sV", 22);
        Person francisco = new Person("Francisco\\sII", 19);
        Group group = new Group();

        //CUANDO
        group.addPerson(nicolas);
        group.addPerson(tomas);
        group.addPerson(esteban);
        group.addPerson(carlos);
        group.addPerson(francisco);

        //ENTONCES
        Assertions.assertEquals(1, group.getPeople().size());


    }

}
