/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.doctor.Doctor;
import model.doctor.DoctorDirectory;
import static model.doctor.DoctorDirectory.doctorList;
import model.hospital.Hospital;
import model.hospital.HospitalDirectory;
import static model.hospital.HospitalDirectory.hospitalList;
import house.House;
import java.awt.Image;
import javax.swing.ImageIcon;
import model.state.city.community.CommunityDirectory;
import model.patient.Patient;
import model.patient.PatientDirectory;
import person.Person;
import person.PersonDirectory;
import rbac.application.user.User;
import rbac.application.user.UserListDirectory;
import us.state.city.City;
import us.state.city.community.Community;

/**
 *
 * @author rohitpanicker
 */
public class PopulateData {
    
    
    public static Image getImage(String selectedImage)
    {
        ImageIcon imageIcon = new ImageIcon(selectedImage);
                Image imageDefault = imageIcon.getImage();
                Image imageDisplay = imageDefault.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                return imageDisplay;
                //photoLabel.setIcon(new ImageIcon(imageDisplay));
    }
    public static void populateData(){
        
        /*
        SystemAdmin:
        admin admin
        
        HospitalAdmin:
        ha ha
        
        Community Admin
        ca ca
        
        Patient:
        rohit rohit
        rahul rahul
        ajitha ajitha
        
        3 Doctors
        pradeep pradeep
        rajesh rajesh
        jyoti jyoti
        
        */
        // Images = 
        String image_one = "/Users/rohitpanicker/Downloads/hospital (1).png";
        String image_two = "/Users/rohitpanicker/Downloads/hospital (1).png";
        String image_three = "/Users/rohitpanicker/Downloads/hospital (1).png";
        String image_four = "/Users/rohitpanicker/Downloads/hospital (1).png";
        String image_five = "/Users/rohitpanicker/Downloads/hospital (1).png";
        String image_six = "/Users/rohitpanicker/Downloads/hospital (1).png";
        String image_seven = "/Users/rohitpanicker/Downloads/hospital (1).png";
        String image_eight = "/Users/rohitpanicker/Downloads/hospital (1).png";
        String image_nine = "/Users/rohitpanicker/Downloads/hospital (1).png";
                 
        
        
        // City
         City city = new City("Massacheuttus", "Usa", "Boston");

         // Community
         Community community  = new Community (city, "Huntington", "Avenue","02115");
         Community community_Brookline  = new Community (city, "Brookline", "Street","02446");
         Community community_Bolyston  = new Community (city, "Bolyston", "Street","01503");
         
         CommunityDirectory.communityList.add(community);
         CommunityDirectory.communityList.add(community_Bolyston);
         CommunityDirectory.communityList.add(community_Brookline);
         
         //House
         House house = new House(community, 881, 7);
         House house_Brookline = new House(community_Brookline, 001,8);
         House house_Bolyston = new House(community_Bolyston, 007, 9);
         
         //Creating SysAdminl
          Image syAdminImage  = getImage(image_one);
          Person syAdmin = new Person("000", "Sanket Gaikwad", "sanket@gmail.com", Long.parseLong("9987786789"), house, "Male", 23, syAdminImage);
          
          PersonDirectory.personList.add(syAdmin);
          User sysAdminUser = new User("admin", "admin", syAdmin);
          UserListDirectory.getSystemAdminList().add(sysAdminUser);
          UserListDirectory.getUserNameToPersonMap().put("admin", syAdmin);
          
          //Creating HospitalAdmin
          Image hospitalAdminImage = getImage(image_two);
          Person hospitalAdmin = new Person("999", "Bharat Karamchandani", "bharat@gmail.com", Long.parseLong("8897768976"), house, "Male", 24, hospitalAdminImage);
          PersonDirectory.personList.add(hospitalAdmin);
          User hospitalAdminUser = new User("ha", "ha", hospitalAdmin);
          UserListDirectory.getHospitalAdminList().add(hospitalAdminUser);
          UserListDirectory.getUserNameToPersonMap().put("ha", hospitalAdmin);
          
          //Creating CommunityAdmin
          Image comAdminImage  = getImage(image_nine);
          Person comAdmin = new Person("111", "Rutvik Katariya", "rutvik@gmail.com", Long.parseLong("9988779900"), house, "Male", 24, comAdminImage);
          PersonDirectory.personList.add(comAdmin);
          User comAdminUser = new User("ca", "ca", comAdmin);
          UserListDirectory.getCommunityAdminList().add(comAdminUser);
          UserListDirectory.getUserNameToPersonMap().put("ca", comAdmin);
          
          
         //Person
         Image personImage = getImage(image_three);
         Image personBrookImage = getImage(image_four);
         Image personBolyImage = getImage(image_five);
         
         Person person = new Person("01", "Rohit Panicker", "rohitpanicker06@gmail.com", Long.parseLong("9762123819"), house, "Male", 23, personImage);
         Person person_Brookline = new Person("02", "Rahul Panicker", "rahulpanicker06@gmail.com", Long.parseLong("9762123818"), house_Brookline, "Male", 24, personBrookImage);
         Person person_Bolyston = new Person("03", "Ajitha Haridas", "ajitha@gmail.com", Long.parseLong("8149993424"), house_Bolyston, "Female", 50, personBolyImage);
       
         PersonDirectory.personList.add(person);
         PersonDirectory.personList.add(person_Bolyston);
         PersonDirectory.personList.add(person_Brookline);
         
         //user
         User user = new User("rohit", "rohit", person);
         User user_Bolyston = new User("rahul", "rahul", person_Brookline);
         User user_Brookline = new User("ajitha", "ajitha", person_Bolyston);
         
         //Role Assignment = All types of Roles have been assigned to the 3 users;
         UserListDirectory.getPatientList().add(user);
         UserListDirectory.getPatientList().add(user_Bolyston);
         UserListDirectory.getPatientList().add(user_Brookline);
         
         UserListDirectory.getUserNameToPersonMap().put("rohit", person);
         UserListDirectory.getUserNameToPersonMap().put("rahul", person_Bolyston);
         UserListDirectory.getUserNameToPersonMap().put("ajitha", person_Brookline);
       
        //Creating patients = 3
        PatientDirectory patientDirectory = new PatientDirectory();
        Patient patient = new Patient(person, 0025);
        Patient patient_Bolyston =  new Patient(person_Bolyston, 0026);
        Patient patient_Brookline =  new Patient(person_Brookline, 0027);
        
        patientDirectory.getPatientList().add(patient);
        patientDirectory.getPatientList().add(patient_Bolyston);
        patientDirectory.getPatientList().add(patient_Brookline);
        
        // Creating Hospital
        Hospital hospital_one = new Hospital("Harvard Medical Center", community, 8810);
        Hospital hospital_two = new Hospital("Boston Medical Center", community_Bolyston, 8811);
        Hospital hospital_three = new Hospital("Brookline Medical Center", community_Brookline, 8812);
       

        HospitalDirectory.hospitalList.add(hospital_one);
        HospitalDirectory.hospitalList.add(hospital_two);
        HospitalDirectory.hospitalList.add(hospital_three);
        
        // Creating Doctor persons
        
        Image doctor_oneIamge = getImage(image_six);
        Image doctorTwoIamge = getImage(image_seven);
        Image doctor_ThreeImage = getImage(image_eight);
         
        Person doctor_one = new Person("100", "Pradeep Shinde", "pradeep@gmail.com", Long.parseLong("9850913005"), house, "Male", 50, doctor_oneIamge);
        Person doctorTwo = new Person("101", "Rajesh Shinde", "rajesh@gmail.com", Long.parseLong("9850913006"), house_Bolyston, "Male", 51, doctorTwoIamge);
        Person doctor_Three = new Person("102", "Jyoti Shinde", "jyoti@gmail.com", Long.parseLong("8087444609"), house_Brookline, "Female", 49, doctor_ThreeImage);
       
        
        PersonDirectory.personList.add(doctor_one);
        PersonDirectory.personList.add(doctorTwo);
        PersonDirectory.personList.add(doctor_Three);
        
        
         User user_Doctor = new User("pradeep", "pradeep", doctor_one);
         User user_DoctorOne = new User("rajesh", "rajesh", doctorTwo);
         User user_DoctorTwo = new User("jyoti", "jyoti", doctor_Three);
         
         UserListDirectory.getDoctorUserList().add(user_Doctor);
         UserListDirectory.getDoctorUserList().add(user_DoctorOne);
         UserListDirectory.getDoctorUserList().add(user_DoctorTwo);
         
         UserListDirectory.getUserNameToPersonMap().put("pradeep", doctor_one);
         UserListDirectory.getUserNameToPersonMap().put("rajesh", doctorTwo);
         UserListDirectory.getUserNameToPersonMap().put("jyoti",doctor_Three);
         
        
        //Creating doctors
        Doctor doctor = new Doctor(doctor_one,hospital_one);
        Doctor doctor_two = new Doctor(doctorTwo,hospital_two);
        Doctor doctorThree = new Doctor(doctor_Three,hospital_three);
        
        DoctorDirectory.doctorList.add(doctor);
        DoctorDirectory.doctorList.add(doctor_two);
        DoctorDirectory.doctorList.add(doctorThree);
        
        
        //assigning doctors to hospitals
        hospital_one.getDoctorList().add(doctor);
        hospital_two.getDoctorList().add(doctor_two);
        hospital_three.getDoctorList().add(doctorThree);
        
        //assiging hospitals to patients
        patient.setHospital(hospital_one);
        patient_Bolyston.setHospital(hospital_two);
        patient_Brookline.setHospital(hospital_three);
       
        // assigning patients to hospital
        hospital_one.getPatientList().add(patient);
        hospital_two.getPatientList().add(patient_Bolyston);
        hospital_three.getPatientList().add(patient_Brookline);
  
        
        
         
       
         //Create Vital Signs
         

         
        
         
    
    }
}
