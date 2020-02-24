package Linkedlist;

import Node.Node;
import person.Person;

public class Linkedlist {
    Person person;
    private Node first;
    private Node last;

    public void addLast(Person person) {
        Node node = new Node(person);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }

    }

    public boolean isEmpty() {
        boolean response = false;
        if (first == null) {
            response = true;
        }
        return response;
    }

    public void addFirst(Person person) {
        Node node = new Node(person);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            node.setNext(first);
            first = node;
        }


    }


    public boolean exist(String firstName) {
        return false;
    }
}








