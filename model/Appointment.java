package model;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Appointment {
    
    private int appointmentID;
    private String patientNIC;
    private String patientAddress;
    private String patientTelephoneNumber;
    private String appointmentDate;
    private Time appointmentTime;
    private int treatmentId;
    
    Scanner scanner = new Scanner(System.in);

    public void makeAppointment() {

        System.out.println("Enter Appointment Details:");
        
        System.out.println("Enter Appointment ID:");
        this.appointmentID = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter Patient Name:");
        this.patientName = scanner.next();

        System.out.println("Enter Patient Address:");
        this.patientAddress = scanner.next();

        System.out.println("Enter Patient Telephone Number:");
        this.patientTelephoneNumber = scanner.next();

        System.out.print("The available channeling dates and time\n");
        System.out.print
                ("Monday\t\t06.00pm\t-\t09.00pm\r\n" + //
                "Wednesday\t06.00pm\t-\t09.00pm\r\n" + //
                "Saturday\t03.00pm\t-\t10.00pm\r\n" + //
                "Sunday\t\t03.00pm\t-\t10.00pm\r\n" + //
                "");

        // Assuming you have a utility method to get Date and Time from user input
        System.out.print("Enter appointment day: ");
        this.appointmentDate = scanner.next();

        System.out.print("Enter appointment time (HH:mm): ");
        String timeStr = scanner.next();
        try {
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
            this.appointmentTime = new Time(timeFormat.parse(timeStr).getTime());
        } catch (ParseException e) {
            System.out.println("Invalid time format. Please enter the time in HH:MM format.");
            e.printStackTrace();
        };
        scanner.close();
        
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentID=" + appointmentID +
                ", patientName='" + patientName + '\'' +
                ", patientAddress='" + patientAddress + '\'' +
                ", patientTelephoneNumber='" + patientTelephoneNumber + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", appointmentTime=" + appointmentTime +'}';
    }







}    

    public void updateAppointmentDetails() {
        Scanner scanner = new Scanner(System.in);

        // Assuming you want to update patient address and telephone number
        System.out.println("Enter new Patient Address:");
        patientAddress = scanner.nextLine();

        System.out.println("Enter new Patient Telephone Number:");
        patientTelephoneNumber = scanner.nextLine();

        scanner.close();
    }

    /*public void viewAppointmentDetailsFilterByDate() {
        Scanner scanner = new Scanner(System.in);

        // Assuming you have a utility method to get Date from user input
        Date filterDate = getUserInputDate();

        // Check and print appointments on the specified date
        if (appointmentDate.equals(filterDate)) {
            System.out.println("Appointment ID: " + appointmentID);
            System.out.println("Patient Name: " + patientName);
            System.out.println("Patient Address: " + patientAddress);
            System.out.println("Patient Telephone Number: " + patientTelephoneNumber);
            System.out.println("Appointment Date: " + appointmentDate);
            System.out.println("Appointment Time: " + appointmentTime);
            System.out.println("Treatment: " + treatment);
        } else {
            System.out.println("No appointments on the specified date.");
        }

        scanner.close();
    }

    public void searchAppointmentByPatientID() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Patient ID to search:");
        int searchID = scanner.nextInt();

        // Check if the current appointment matches the search ID
        if (appointmentID == searchID) {
            System.out.println("Appointment ID: " + appointmentID);
            System.out.println("Patient Name: " + patientName);
            System.out.println("Patient Address: " + patientAddress);
            System.out.println("Patient Telephone Number: " + patientTelephoneNumber);
            System.out.println("Appointment Date: " + appointmentDate);
            System.out.println("Appointment Time: " + appointmentTime);
            System.out.println("Treatment: " + treatment);
        } else {
            System.out.println("No appointment found with the specified ID.");
        }

        scanner.close();
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Time getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Time appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    // Assuming utility methods to get Date and Time from user input
    private Date getUserInputDate() {
        
        // Implementation to get Date from user input
        return new Date(); // Placeholder, replace with actual implementation
    }

    private Time getUserInputTime() {
        // Implementation to get Time from user input
        return new Time(0); // Placeholder, replace with actual implementation
    }
}




/*public class Appointment {
    
    private String appointmentID;
    private String patientName;
    private String patientAddress;
    private String patientTelephoneNumber;
    private Date appointmentDate;
    private Time appointmentTime;
    private double finalFee;

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientTelephoneNumber() {
        return patientTelephoneNumber;
    }

    public void setPatientTelephoneNumber(String patientTelephoneNumber) {
        this.patientTelephoneNumber = patientTelephoneNumber;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Time getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Time appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public double getFinalFee() {
        return finalFee;
    }

    public void setFinalFee(double finalFee) {
        this.finalFee = finalFee;
    }

    // Methods

    public void makeAppointment() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter appointment ID: ");
        setAppointmentID(scanner.nextLine());

        System.out.print("Enter patient name: ");
        setPatientName(scanner.nextLine());

        System.out.print("Enter patient address: ");
        setPatientAddress(scanner.nextLine());

        System.out.print("Enter patient telephone number: ");
        setPatientTelephoneNumber(scanner.nextLine());

        System.out.print("Enter appointment date (yyyy-MM-dd): ");
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(scanner.nextLine());
            setAppointmentDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Enter appointment time (HH:mm:ss): ");
        try {
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            Time time = new Time(timeFormat.parse(scanner.nextLine()).getTime());
            setAppointmentTime(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Enter final fee: ");
        setFinalFee(scanner.nextDouble());

        scanner.close();
    }

    public void updateAppointmentDetails() {
        
    }

    public void viewAppointmentDetailsFilterByDate() {
        
    }

    public void searchAppointmentByPatientID() {
        
    }
}*/ 