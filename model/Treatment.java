package model;

public class Treatment {

    class Node {
        String treatmentType;
        int fee;
        Node next;

        public Node(String treatmentType, int fee) {
            this.treatmentType = treatmentType;
            this.fee = fee;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addTreatmentTypeAndFee(String treatmentType, int fee) {
        Node newNode = new Node(treatmentType, fee);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void viewTreatmentTypeAndFee() {
        Node current = head;
        if (head == null) {
            System.out.println("List is Empty");
        }
        System.out.println("Treatments and fees");
        while (current != null) {
            System.out.println("Treatment Type: " + current.treatmentType + ", Fee: " + current.fee);
            current = current.next;
        }
    }
}
