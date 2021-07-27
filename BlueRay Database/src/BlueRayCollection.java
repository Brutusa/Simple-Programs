/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#:
*/


class Node {
    public BlueRayDisk data;
    public Node next;
}


public class BlueRayCollection {

    private Node head;
    private Node tail;

    public BlueRayCollection() {
        head = null;
        tail = null;
    }

    public void addBack(String title, String director, int yearReleased, double cost) {
        Node newNode = new Node();
        newNode.data = new BlueRayDisk(title, director, yearReleased, cost);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void showAll() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + "\n");
            current = current.next;
        }
        System.out.println();
    }

    //Sorry, I didn't have much time to spend on this homework. Exhausting work week. This method doesn't work
    public String search(String title) {
        Node current = head;

        if (current.data.title.equals(title)) {
            Node curr = head;
            Node prev = curr;
            if (curr.data.title.equals(title)) {
                head = curr.next;
                return curr.data.toString();
            }
            while (!(curr.data.title.equals(title))) {
                prev = curr;
                curr = curr.next;
                if (curr == null);
                return "null";

            }
            prev.next = curr.next;
            return curr.toString();
        } else {
            return "Not Found";

        }
    }

    public boolean remove(String title) {

        Node current = head;
        if (current.data.title.equals(title)) {
            Node curr = head;
            Node prev = curr;
            if (curr.data.title.equals(title)) {
                head = curr.next;
                System.out.println(title + " deleted");
                return true;
            }
            while (!(curr.data.title.equals(title))) {
                prev = curr;
                curr = curr.next;
                if (curr == null)
                    return false;
            }
            prev.next = curr.next;
            return true;
        } else {
            System.out.println("Not Found");
            return false;
        }
    }
}
