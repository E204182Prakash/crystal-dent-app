import java.util.Scanner;

import model.*;

public class CrystalDent {
    public static void main(String[] args) {

        User frontOfficerLogin = new User("froff", "f123");

        System.out.println("WELCOME TO CrystalDent SYSTEM");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String enteredUsername = scanner.next();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.next();
        if (frontOfficerLogin.verifyLogin(enteredUsername, enteredPassword)) {
            System.out.println("Front Officer login successful!");
        } else {
            System.out.println("Front Officer login failed!");
        }

        System.out.println("Make Appointment press 1");
        System.out.println("Update appointments details press 2");
        System.out.println("View appointments details filtered by date press 3");
        System.out.println("Search for an appointment using patient name or Appointment ID press 4");
        int menu = scanner.nextInt();
        if (menu==1){
            Appointment[] appointments = new Appointment[1];

        // Creating appointments
        for (int i = 0; i < 1; i++) {
            appointments[i] = new Appointment();
            appointments[i].makeAppointment();
        }

        System.out.println("Appointment created Succesfully!!!");
        for (int i = 0; i < 1; i++) {
            System.out.println("Appointment[" + i + "] = " + appointments[i]);
        }
    }
    }       
}



        /*FrontOfficeOperator operator = new FrontOfficeOperator(1300, "Ms. Gayani");

        // Accessing attributes using getter methods
        System.out.println("Operator ID: " + operator.getOperatorID());
        System.out.println("Operator Name: " + operator.getOperatorName());

        // Calling methods
        operator.reserveAppointment();
        operator.checkAvailableChannelingDatesAndTimes();
        operator.notifyPatientOfAppointmentTime();
        operator.acceptRegistrationFee();
        operator.calculateFinalFee();
        operator.acceptPayment();
        operator.viewInvoice();

























        //Login doctorLogin = new Login("doctor", "doctor123");
        



        Invoice in = new Invoice(null, null, null);
        // Print Invoice details
        in.calculateTotalAmount();
        System.out.println("\nInvoice Details:");
        in.viewInvoice();

        //Payment pay = new Payment(null, null, in, null);
        // Process Payment
        Payment pay = new Payment(null, null, null, null);
        System.out.println("\nProcessing Payment...");
        pay.processPayment();










        RegistrationFee registrationFee = new RegistrationFee();
        registrationFee.acceptRegistrationFee();

        // Display the accepted registration fee
        System.out.println("Accepted Registration Fee: $" + registrationFee.getRegistrationFeeAmount());

        Treatment cn = new Treatment();
        cn.addTreatmentTypeAndFee("Cleanings", 2000);
        cn.addTreatmentTypeAndFee("Whitening", 2000);
        cn.addTreatmentTypeAndFee("Filling", 4000);
        cn.addTreatmentTypeAndFee("Nerve Filling", 5000);
        cn.addTreatmentTypeAndFee("Root Canal Therapy", 9000);
        cn.viewTreatmentTypeAndFee();


        Appointment[] appointments = new Appointment[5]; // Adjust the size based on your needs

        for (int i = 0; i < appointments.length; i++) {
            appointments[i] = new Appointment();
            appointments[i].makeAppointment();
        }

        appointments[1].updateAppointmentDetails();

        // Example: Search appointment by patient ID
        appointments[1].searchAppointmentByPatientID();

        // Example: View appointment details for a specific date
        //appointments[0].viewAppointmentDetailsFilterByDate();

        

        
        /*Appointment appointment = new Appointment();
        System.out.println("Please Enter the Appointment Details");
        appointment.makeAppointment();
        appointment.viewAppointmentDetailsFilterByDate();*/        






