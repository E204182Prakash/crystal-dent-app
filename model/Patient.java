package model;

import java.util.Scanner;

public class Patient {
    // Attributes
    private int patientID;
    private String patientName;
    private String address;
    private String phoneNumber;

    // Constructor
    public Patient(int patientID, String patientName, String address, String phoneNumber) 
    {
        this.patientID = patientID;
        this.patientName = patientName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getPatientID() {
        return patientID;
    }

    public String getFirstName() {
        return patientName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setFirstName(String patientName) {
        this.patientName = patientName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Method to set values using user input
    public void setValuesasInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        setPatientID(scanner.nextInt());

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Name: ");
        setFirstName(scanner.nextLine());

        System.out.print("Enter Address: ");
        setAddress(scanner.nextLine());

        System.out.print("Enter Phone Number: ");
        setPhoneNumber(scanner.nextLine());

        scanner.close();
    }
}