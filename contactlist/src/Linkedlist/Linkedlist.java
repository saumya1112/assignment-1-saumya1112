package Linkedlist;

import Node.Node;
import person.Person;

public class Linkedlist {
    Person person;
    private Node first;
    private Node last;

    public void addLast(Person person) {

    }

    public boolean isEmpty() {
        boolean response = false;
        if (first == null) {
            response = true;
        }
        return response;
    }


}
