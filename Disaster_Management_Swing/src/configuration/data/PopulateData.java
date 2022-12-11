/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuration.data;

import CivilResponse.Army.ArmyEmployee;
import CivilResponse.Army.ArmyEmployeeDirectory;
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
        
       
        roles.add("Civil Response");
        
       
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
        
        Donors
        george george
        paul paul
        jon jon
        
        Fund Raisers
        sean sean
        rachael rachael
        tracy tracy
        
        
        Site Reporting Employee
        alexander alexander
        leonedwards leonedwards
        alexp alexp
        
        
        Civil Response Head
        curtis curtis
        tom tom 
        chris chris
        
        
        
        Pharmacy
        max max
        brandon brandon
        stipe stipe
       
        
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
  
        
        //Creating Donors
        
        Person donorOne = new Person("500", "George Sebastin", "george@gmail.com", Long.parseLong("9850913005"), house, "Male", 50, doctor_oneIamge);
        Person donorTwo = new Person("501", "Paul george", "paul@gmail.com", Long.parseLong("9977886678"), house, "Male", 24, doctorTwoIamge);
        Person donorThree = new Person("502", "Jon Jones", "jonjones@gmail.com", Long.parseLong("6677885545"), house, "Male", 28, doctor_ThreeImage);
        
        PersonDirectory.personList.add(donorOne);
        PersonDirectory.personList.add(donorTwo);
        PersonDirectory.personList.add(donorThree);
        
         User donor_One = new User("george", "george", donorOne);
         User donor_Two = new User("paul", "paul", donorTwo);
         User donor_Three = new User("jon", "jon", donorThree);
         
         UserListDirectory.getDonor().add(donor_One);
         UserListDirectory.getDonor().add(donor_Two);
         UserListDirectory.getDonor().add(donor_Three);
         
         UserListDirectory.getUserNameToPersonMap().put("george", donorOne);
         UserListDirectory.getUserNameToPersonMap().put("paul", donorTwo);
         UserListDirectory.getUserNameToPersonMap().put("jon",donorThree);
        
         
         
         //Creating FundRaisers
         
         
        Person frOne = new Person("600", "Sean Mally", "sean@gmail.com", Long.parseLong("9988666677"), house, "Male", 20, doctor_oneIamge);
        Person frTwo = new Person("601", "Rachael Ostovich", "rachael@gmail.com", Long.parseLong("5566774499"), house, "Female", 24, doctorTwoIamge);
        Person frThree = new Person("603", "Tracy Cortez", "tracy@gmail.com", Long.parseLong("9988778899"), house, "Female", 28, doctor_ThreeImage);
        
        PersonDirectory.personList.add(frOne);
        PersonDirectory.personList.add(frTwo);
        PersonDirectory.personList.add(frThree);
        
         User fr_One = new User("sean", "sean", frOne);
         User fr_Two = new User("rachael", "rachael", frTwo);
         User fr_Three = new User("tracy", "tracy", frThree);
         
         UserListDirectory.getFundRaiserList().add(fr_One);
         UserListDirectory.getFundRaiserList().add(fr_Two);
         UserListDirectory.getFundRaiserList().add(fr_Three);
         
         UserListDirectory.getUserNameToPersonMap().put("sean", frOne);
         UserListDirectory.getUserNameToPersonMap().put("rachael", frTwo);
         UserListDirectory.getUserNameToPersonMap().put("tracy",frThree);
         
         
         
         
         // Site Reporting Employee
         
         Person srOne = new Person("700", "Alexander Volkanovski", "alexanderv@gmail.com", Long.parseLong("9988778899"), house, "Male", 30, doctor_oneIamge);
        Person srTwo = new Person("701", "Leon Edwards", "leoned@gmail.com", Long.parseLong("9955667709"), house, "Male", 33, doctorTwoIamge);
        Person srThree = new Person("703", "Alex Pereira", "alexp@gmail.com", Long.parseLong("7788556677"), house, "Male", 38, doctor_ThreeImage);
        
        PersonDirectory.personList.add(srOne);
        PersonDirectory.personList.add(srTwo);
        PersonDirectory.personList.add(srThree);
        
         User sr_One = new User("alexander", "alexander", srOne);
         User sr_Two = new User("leonedwards", "leonedwards", srTwo);
         User sr_Three = new User("alexp", "alexp", srThree);
         
         UserListDirectory.getEventReportingList().add(sr_One);
         UserListDirectory.getEventReportingList().add(sr_Two);
         UserListDirectory.getEventReportingList().add(sr_Three);
         
         UserListDirectory.getUserNameToPersonMap().put("alexander", srOne);
         UserListDirectory.getUserNameToPersonMap().put("leonedwards", srTwo);
         UserListDirectory.getUserNameToPersonMap().put("alexp",srThree);
         
         
         // Creating Pharmacy
         
        
          
         Person pharOne = new Person("800", "Max Holloway", "max@gmail.com", Long.parseLong("7788994455"), house, "Male", 39, doctor_oneIamge);
        Person pharTwo = new Person("801", "Brandon Moreno", "brandon@gmail.com", Long.parseLong("9955667709"), house, "Male", 33, doctorTwoIamge);
        Person pharThree = new Person("802", "Stipe Miocic", "stipe@gmail.com", Long.parseLong("6677567489"), house, "Male", 42, doctor_ThreeImage);
        
        PersonDirectory.personList.add(pharOne);
        PersonDirectory.personList.add(pharTwo);
        PersonDirectory.personList.add(pharThree);
        
         User ph_One = new User("max", "max", pharOne);
         User ph_Two = new User("brandon", "brandon", pharTwo);
         User ph_Three = new User("stipe", "stipe", pharThree);
         
         UserListDirectory.getPharmacyList().add(ph_One);
         UserListDirectory.getPharmacyList().add(ph_Two);
         UserListDirectory.getPharmacyList().add(ph_Three);
         
         UserListDirectory.getUserNameToPersonMap().put("max", pharOne);
         UserListDirectory.getUserNameToPersonMap().put("brandon", pharTwo);
         UserListDirectory.getUserNameToPersonMap().put("stipe", pharThree);
         
         
         
          // Civil Response Head
         
        
          
         Person cvOne = new Person("900", "Curtis Blaydes", "curtis@gmail.com", Long.parseLong("7754567346"), house, "Male", 39, doctor_oneIamge);
        Person cvTwo = new Person("901", "Tom Aspinall", "tom@gmail.com", Long.parseLong("9657456730"), house, "Male", 33, doctorTwoIamge);
        Person cvThree = new Person("902", "Chris Daukaus", "chris@gmail.com", Long.parseLong("9870654798"), house, "Male", 42, doctor_ThreeImage);
        
        PersonDirectory.personList.add(cvOne);
        PersonDirectory.personList.add(cvTwo);
        PersonDirectory.personList.add(cvThree);
        
         User cv_One = new User("curtis", "curtis", cvOne);
         User cv_Two = new User("tom", "tom", cvTwo);
         User cv_Three = new User("chris", "chris", cvThree);
         
         UserListDirectory.getCivilResponseList().add(cv_One);
         UserListDirectory.getCivilResponseList().add(cv_Two);
         UserListDirectory.getCivilResponseList().add(cv_Three);
         
         UserListDirectory.getUserNameToPersonMap().put("curtis", cvOne);
         UserListDirectory.getUserNameToPersonMap().put("tom", cvTwo);
         UserListDirectory.getUserNameToPersonMap().put("chris", cvThree);
         
         //Army Head
         
         
          Person armyhead = new Person("10000", "Gayatri", "gayatri@gmail.com", Long.parseLong("7754567346"), house, "Female", 39, doctor_oneIamge);
          PersonDirectory.personList.add(armyhead);
          User army_head = new User("army", "army", armyhead);
          UserListDirectory.getArmyHeadList().add(army_head);
          UserListDirectory.getUserNameToPersonMap().put("army", armyhead);
          
          //Creating army officers
          
          Person armyOffOne = new Person("1100", "Ric", "ric@gmail.com", Long.parseLong("7754567346"), house, "Male", 39, doctor_oneIamge);
          PersonDirectory.personList.add(armyOffOne);
          ArmyEmployee army_Off_One = new ArmyEmployee("1100",armyOffOne, "Boston");
          ArmyEmployeeDirectory.armyEmpList.add(army_Off_One);
         
          User army_Officer_one = new User("ric", "ric", armyOffOne);
          UserListDirectory.getArmyEmployeeList().add(army_Officer_one);
          UserListDirectory.getUserNameToPersonMap().put("ric", armyOffOne);
          
          
          Person armyOffTwo = new Person("1200", "John", "john@gmail.com", Long.parseLong("7754567346"), house, "Male", 39, doctor_oneIamge);
          PersonDirectory.personList.add(armyOffOne);
          ArmyEmployee army_Off_two = new ArmyEmployee("101",armyOffTwo, "New York");
          ArmyEmployeeDirectory.armyEmpList.add(army_Off_two);
          
          Person armyOffthree = new Person("1300", "Robert", "robert@gmail.com", Long.parseLong("7754567346"), house, "Male", 39, doctor_oneIamge);
          PersonDirectory.personList.add(armyOffthree);
          ArmyEmployee army_Off_three = new ArmyEmployee("102",armyOffthree, "Texas");
          ArmyEmployeeDirectory.armyEmpList.add(army_Off_three);
          
          Person armyOffFour = new Person("1400", "Alexis", "alexis@gmail.com", Long.parseLong("7754567346"), house, "Female", 39, doctor_oneIamge);
          PersonDirectory.personList.add(armyOffFour);
          ArmyEmployee army_Off_Four = new ArmyEmployee("103",armyOffFour, "Boston");
          ArmyEmployeeDirectory.armyEmpList.add(army_Off_Four);
    
    }
}
