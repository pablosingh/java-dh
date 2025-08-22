package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //necesitamos la lista de perros
        List<Dog> dogs = new ArrayList<>();
        //Esto es un ejemplo más de como crear un perro
        Dog dog = new Dog(3, "Dock");
        dogs.add(new Dog(1, "Branca"));
        dogs.add(new Dog(2, "Helga"));
        dogs.add(new Dog(1, "Panchito"));
        dogs.add(new Dog(2, "Molly"));
        dogs.add(dog);


        //necesitamos guardar la lista en el disco
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Salida.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //este es el método que guarda la lista
            oos.writeObject(dogs);
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }



        //necesitamos recuperar la lista y mostrarla por pantalla
        List<Dog> dogList = null;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("Salida.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            dogList = (ArrayList)ois.readObject();
            ois.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Dog dogArrayList: dogList) {
            System.out.println(dogArrayList);
        }


    }
}
