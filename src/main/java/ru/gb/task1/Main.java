package ru.gb.task1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import ru.gb.task1.domen.Person;

import javax.swing.text.html.parser.Entity;

public class Main {
    public static void main(String[] args) throws JsonSyntaxException {
        Person person1 = new Person("Иван", "Иванович", 30);
        Person person2 = new Person("Иван", "Сергеевич", 32);

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1);

        Gson gson = new Gson();
        String json = gson.toJson(person1);

        Person read = gson.fromJson(json, Person.class);

        System.out.println(read.getFirstName());



    }
}
