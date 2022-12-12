/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuration.data;

import CivilResponse.Army.ArmyEmployee;
import CivilResponse.Army.ArmyEmployeeDirectory;
import CivilResponse.Navy.NavyEmployee;
import CivilResponse.Navy.NavyEmployeeDirectory;
import CivilResponse.Police.PoliceEmployee;
import CivilResponse.Police.PoliceEmployeeDirectory;
import model.doctor.Doctor;
import model.doctor.DoctorDirectory;
import model.hospital.Hospital;
import model.hospital.HospitalDirectory;
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

    public static Image getImage(String selectedImage) {
        ImageIcon imageIcon = new ImageIcon(selectedImage);
        Image imageDefault = imageIcon.getImage();
        Image imageDisplay = imageDefault.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        return imageDisplay;
        //photoLabel.setIcon(new ImageIcon(imageDisplay));
    }

    public static void populateData() {

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
        Community community = new Community(city, "Huntington", "Avenue", "02115");
        Community community_Brookline = new Community(city, "Brookline", "Street", "02446");
        Community community_Bolyston = new Community(city, "Bolyston", "Street", "01503");

        CommunityDirectory.communityList.add(community);
        CommunityDirectory.communityList.add(community_Bolyston);
        CommunityDirectory.communityList.add(community_Brookline);

        //House
        House house = new House(community, 881, 7);
        House house_Brookline = new House(community_Brookline, 001, 8);
        House house_Bolyston = new House(community_Bolyston, 007, 9);

//         g
        House house1 = new House(community, 882, 10);
        House house1_Brookline = new House(community_Brookline, 002, 3);
        House house1_Bolyston = new House(community_Bolyston, 101, 5);

        House house2 = new House(community, 883, 10);
        House house2_Brookline = new House(community_Brookline, 003, 3);
        House house2_Bolyston = new House(community_Bolyston, 109, 5);

        House house3 = new House(community, 884, 1);
        House house3_Brookline = new House(community_Brookline, 004, 2);
        House house3_Bolyston = new House(community_Bolyston, 102, 11);

        House house4 = new House(community, 885, 2);
        House house4_Brookline = new House(community_Brookline, 005, 22);
        House house4_Bolyston = new House(community_Bolyston, 103, 1);

        //Creating SysAdminl
        Image syAdminImage = getImage(image_one);
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
        Image comAdminImage = getImage(image_nine);
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

        //g
        Person person2 = new Person("04", "Bellanca Silva", "bvanzon0@wiley.com", Long.parseLong("8924085371"), house, "Female", 23, personImage);
        Person person2_Brookline = new Person("05", "Adrienne Sarene", "aemlin2@facebook.com", Long.parseLong("8414345185"), house_Brookline, "Female", 24, personBrookImage);
        Person person2_Bolyston = new Person("06", "Mathian Lev", "mvinden4@nytimes.com", Long.parseLong("8149993424"), house_Bolyston, "Male", 50, personBolyImage);

        Person person3 = new Person("07", "Kyle Silva", "kyle@wiley.com", Long.parseLong("9762123819"), house, "Female", 23, personImage);
        Person person3_Brookline = new Person("08", "Gerrard Sarene", "gerrand@facebook.com", Long.parseLong("8924085371"), house_Brookline, "Male", 24, personBrookImage);
        Person person3_Bolyston = new Person("09", "Daune Lev", "draffine@umich.edu", Long.parseLong("8149993424"), house_Bolyston, "Male", 50, personBolyImage);

        Person person4 = new Person("10", "Katy Silva", "katy@wiley.com", Long.parseLong("5275739742"), house, "Female", 23, personImage);
        Person person4_Brookline = new Person("11", "Joell john", "joell@facebook.com", Long.parseLong("9762123818"), house_Brookline, "Male", 24, personBrookImage);
        Person person4_Bolyston = new Person("12", "Chelsea cho", "chelsea@nytimes.com", Long.parseLong("8414345185"), house_Bolyston, "Female", 50, personBolyImage);

        Person person5 = new Person("13", "Trisha Sai", "trisha@wiley.com", Long.parseLong("9762123819"), house, "Female", 23, personImage);
        Person person5_Brookline = new Person("14", "Richard joe", "richard@facebook.com", Long.parseLong("9762123818"), house_Brookline, "Male", 24, personBrookImage);
        Person person5_Bolyston = new Person("15", "Crystie Pamela", "crystie@nytimes.com", Long.parseLong("5275739742"), house_Bolyston, "Female", 50, personBolyImage);

        Person person6 = new Person("16", "Katerine Allen", "katerine@wiley.com", Long.parseLong("5275739742"), house, "Male", 23, personImage);
        Person person6_Brookline = new Person("17", "Allen joe", "alen@facebook.com", Long.parseLong("9762123818"), house_Brookline, "Male", 24, personBrookImage);
        Person person6_Bolyston = new Person("18", "Renault Carous", "renault@nytimes.com", Long.parseLong("8149993424"), house_Bolyston, "Male", 50, personBolyImage);

        Person person7 = new Person("19", "Erin Issac", "erin@wiley.com", Long.parseLong("9762123819"), house, "Male", 23, personImage);
        Person person7_Brookline = new Person("20", "Mahmud zac", "mahmud@facebook.com", Long.parseLong("8924085371"), house_Brookline, "Male", 24, personBrookImage);
        Person person7_Bolyston = new Person("21", "Reena Antony", "reena@gmail.com", Long.parseLong("8149993424"), house_Bolyston, "Male", 50, personBolyImage);

        Person person8 = new Person("22", "Lydon Wynny", "lydon@wiley.com", Long.parseLong("8059458612"), house, "Male", 23, personImage);
        Person person8_Brookline = new Person("23", "Tudor Lennie", "tudor@facebook.com", Long.parseLong("8432691912"), house_Brookline, "Male", 24, personBrookImage);
        Person person8_Bolyston = new Person("24", "Lorna Cass", "lorna@gmail.com", Long.parseLong("5287783326"), house_Bolyston, "Female", 50, personBolyImage);

        Person person9 = new Person("25", "Leo Conney", "lrin@wiley.com", Long.parseLong("9762123819"), house, "Male", 23, personImage);
        Person person9_Brookline = new Person("26", "Berton Willy", "berton@facebook.com", Long.parseLong("8924085371"), house_Brookline, "Male", 24, personBrookImage);
        Person person9_Bolyston = new Person("27", "Ines Kare", "ines@gmail.com", Long.parseLong("8149993424"), house_Bolyston, "Male", 50, personBolyImage);

        Person person10 = new Person("28", "Caty Ginelle", "caty@wiley.com", Long.parseLong("8059458612"), house, "Male", 23, personImage);
        Person person10_Brookline = new Person("29", "Raul Sammy", "raul@facebook.com", Long.parseLong("8432691912"), house_Brookline, "Male", 24, personBrookImage);
        Person person10_Bolyston = new Person("30", "Phil Benny", "phil@gmail.com", Long.parseLong("5287783326"), house_Bolyston, "Female", 50, personBolyImage);

        Person person11 = new Person("31", "Desmond Lillis", "desmond@wiley.com", Long.parseLong("8059458612"), house, "Male", 23, personImage);
        Person person11_Brookline = new Person("32", "Dane Frazier", "dane@facebook.com", Long.parseLong("8432691912"), house_Brookline, "Male", 24, personBrookImage);
        Person person11_Bolyston = new Person("33", "Dinnie Therine", "dinnie@gmail.com", Long.parseLong("5287783326"), house_Bolyston, "Female", 50, personBolyImage);

        Person person12 = new Person("34", "Mile Amery", "caty@wiley.com", Long.parseLong("8059458612"), house, "Male", 23, personImage);
        Person person12_Brookline = new Person("35", "Newton Amery", "raul@facebook.com", Long.parseLong("8432691912"), house_Brookline, "Male", 24, personBrookImage);
        Person person12_Bolyston = new Person("36", "Carmita Harwilll", "phil@gmail.com", Long.parseLong("5287783326"), house_Bolyston, "Female", 50, personBolyImage);

        Person person13 = new Person("37", "Jakie Ginelle", "caty@wiley.com", Long.parseLong("8059458612"), house, "Male", 23, personImage);
        Person person13_Brookline = new Person("38", "Jeth Sammy", "raul@facebook.com", Long.parseLong("8432691912"), house_Brookline, "Male", 24, personBrookImage);
        Person person13_Bolyston = new Person("39", "Petrina Benny", "phil@gmail.com", Long.parseLong("5287783326"), house_Bolyston, "Female", 50, personBolyImage);

//        g
        PersonDirectory.personList.add(person2);
        PersonDirectory.personList.add(person2_Bolyston);
        PersonDirectory.personList.add(person2_Brookline);
        PersonDirectory.personList.add(person3);
        PersonDirectory.personList.add(person3_Bolyston);
        PersonDirectory.personList.add(person3_Brookline);
        PersonDirectory.personList.add(person4);
        PersonDirectory.personList.add(person4_Bolyston);
        PersonDirectory.personList.add(person4_Brookline);
        PersonDirectory.personList.add(person5);
        PersonDirectory.personList.add(person5_Bolyston);
        PersonDirectory.personList.add(person5_Brookline);
        PersonDirectory.personList.add(person6);
        PersonDirectory.personList.add(person6_Bolyston);
        PersonDirectory.personList.add(person6_Brookline);
        PersonDirectory.personList.add(person7);
        PersonDirectory.personList.add(person7_Bolyston);
        PersonDirectory.personList.add(person7_Brookline);
        PersonDirectory.personList.add(person8);
        PersonDirectory.personList.add(person8_Bolyston);
        PersonDirectory.personList.add(person8_Brookline);
        PersonDirectory.personList.add(person9);
        PersonDirectory.personList.add(person9_Bolyston);
        PersonDirectory.personList.add(person9_Brookline);
        PersonDirectory.personList.add(person10);
        PersonDirectory.personList.add(person10_Bolyston);
        PersonDirectory.personList.add(person10_Brookline);
        PersonDirectory.personList.add(person11);
        PersonDirectory.personList.add(person11_Bolyston);
        PersonDirectory.personList.add(person11_Brookline);
        PersonDirectory.personList.add(person12);
        PersonDirectory.personList.add(person12_Bolyston);
        PersonDirectory.personList.add(person12_Brookline);
        PersonDirectory.personList.add(person13);
        PersonDirectory.personList.add(person13_Bolyston);
        PersonDirectory.personList.add(person13_Brookline);

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
        Patient patient_Bolyston = new Patient(person_Bolyston, 0026);
        Patient patient_Brookline = new Patient(person_Brookline, 0027);

        patientDirectory.getPatientList().add(patient);
        patientDirectory.getPatientList().add(patient_Bolyston);
        patientDirectory.getPatientList().add(patient_Brookline);

        //        g
        Patient patient2 = new Patient(person2, 0035);
        Patient patient2_Bolyston = new Patient(person2_Bolyston, 0036);
        Patient patient2_Brookline = new Patient(person2_Brookline, 0037);

        Patient patient3 = new Patient(person3, 0045);
        Patient patient3_Bolyston = new Patient(person3_Bolyston, 0073);
        Patient patient3_Brookline = new Patient(person3_Brookline, 0047);

        Patient patient4 = new Patient(person4, 0055);
        Patient patient4_Bolyston = new Patient(person4_Bolyston, 0046);
        Patient patient4_Brookline = new Patient(person4_Brookline, 0057);

        Patient patient5 = new Patient(person5, 0065);
        Patient patient5_Bolyston = new Patient(person5_Bolyston, 0066);
        Patient patient5_Brookline = new Patient(person5_Brookline, 0067);

        Patient patient6 = new Patient(person6, 0075);
        Patient patient6_Bolyston = new Patient(person6_Bolyston, 0076);
        Patient patient6_Brookline = new Patient(person6_Brookline, 0077);

        Patient patient7 = new Patient(person7, 0155);
        Patient patient7_Bolyston = new Patient(person7_Bolyston, 0136);
        Patient patient7_Brookline = new Patient(person7_Brookline, 8057);

        Patient patient8 = new Patient(person8, 0165);
        Patient patient8_Bolyston = new Patient(person8_Bolyston, 0136);
        Patient patient8_Brookline = new Patient(person8_Brookline, 8157);

        Patient patient9 = new Patient(person9, 0175);
        Patient patient9_Bolyston = new Patient(person9_Bolyston, 0146);
        Patient patient9_Brookline = new Patient(person9_Brookline, 8257);

        Patient patient10 = new Patient(person10, 0115);
        Patient patient10_Bolyston = new Patient(person10_Bolyston, 0156);
        Patient patient10_Brookline = new Patient(person10_Brookline, 8357);

        Patient patient11 = new Patient(person11, 0116);
        Patient patient11_Bolyston = new Patient(person11_Bolyston, 0157);
        Patient patient11_Brookline = new Patient(person11_Brookline, 8367);

        Patient patient12 = new Patient(person12, 0117);
        Patient patient12_Bolyston = new Patient(person12_Bolyston, 0165);
        Patient patient12_Brookline = new Patient(person12_Brookline, 8377);

        Patient patient13 = new Patient(person13, 9198);
        Patient patient13_Bolyston = new Patient(person13_Bolyston, 8478);
        Patient patient13_Brookline = new Patient(person13_Brookline, 8387);

        patientDirectory.getPatientList().add(patient2);
        patientDirectory.getPatientList().add(patient2_Bolyston);
        patientDirectory.getPatientList().add(patient2_Brookline);
        patientDirectory.getPatientList().add(patient3);
        patientDirectory.getPatientList().add(patient3_Bolyston);
        patientDirectory.getPatientList().add(patient3_Brookline);
        patientDirectory.getPatientList().add(patient4);
        patientDirectory.getPatientList().add(patient4_Bolyston);
        patientDirectory.getPatientList().add(patient4_Brookline);

        patientDirectory.getPatientList().add(patient5);
        patientDirectory.getPatientList().add(patient5_Bolyston);
        patientDirectory.getPatientList().add(patient5_Brookline);

        patientDirectory.getPatientList().add(patient6);
        patientDirectory.getPatientList().add(patient6_Bolyston);
        patientDirectory.getPatientList().add(patient6_Brookline);

        patientDirectory.getPatientList().add(patient7);
        patientDirectory.getPatientList().add(patient7_Bolyston);
        patientDirectory.getPatientList().add(patient7_Brookline);

        patientDirectory.getPatientList().add(patient8);
        patientDirectory.getPatientList().add(patient8_Bolyston);
        patientDirectory.getPatientList().add(patient8_Brookline);

        patientDirectory.getPatientList().add(patient9);
        patientDirectory.getPatientList().add(patient9_Bolyston);
        patientDirectory.getPatientList().add(patient9_Brookline);

        patientDirectory.getPatientList().add(patient10);
        patientDirectory.getPatientList().add(patient10_Bolyston);
        patientDirectory.getPatientList().add(patient10_Brookline);

        patientDirectory.getPatientList().add(patient11);
        patientDirectory.getPatientList().add(patient11_Bolyston);
        patientDirectory.getPatientList().add(patient11_Brookline);

        patientDirectory.getPatientList().add(patient12);
        patientDirectory.getPatientList().add(patient12_Bolyston);
        patientDirectory.getPatientList().add(patient12_Brookline);

        patientDirectory.getPatientList().add(patient13);
        patientDirectory.getPatientList().add(patient13_Bolyston);
        patientDirectory.getPatientList().add(patient13_Brookline);

        // Creating Hospital
        Hospital hospital_one = new Hospital("Harvard Medical Center", community, 8810);
        Hospital hospital_two = new Hospital("Boston Medical Center", community_Bolyston, 8811);
        Hospital hospital_three = new Hospital("Brookline Medical Center", community_Brookline, 8812);

        HospitalDirectory.hospitalList.add(hospital_one);
        HospitalDirectory.hospitalList.add(hospital_two);
        HospitalDirectory.hospitalList.add(hospital_three);

        //        g
        Hospital hospital_four = new Hospital("Massachusetts General Hospital", community, 8813);
        Hospital hospital_five = new Hospital("Tufts Medical Center", community_Bolyston, 8814);
        Hospital hospital_six = new Hospital("Mount Auburn Hospital", community_Brookline, 8815);

        HospitalDirectory.hospitalList.add(hospital_four);
        HospitalDirectory.hospitalList.add(hospital_five);
        HospitalDirectory.hospitalList.add(hospital_six);

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
        UserListDirectory.getUserNameToPersonMap().put("jyoti", doctor_Three);

        //        g
//set 1
        Image doctor1_oneIamge = getImage(image_six);
        Image doctor1TwoIamge = getImage(image_seven);
        Image doctor1_ThreeImage = getImage(image_eight);

        Person doctor1_one = new Person("103", "Carroll Dominick", "carroll@gmail.com", Long.parseLong("9850913005"), house1, "Female", 35, doctor1_oneIamge);
        Person doctor1Two = new Person("104", "Armando Cecelia", "armando@gmail.com", Long.parseLong("9428631781"), house1_Bolyston, "Male", 56, doctor1TwoIamge);
        Person doctor1_Three = new Person("105", "Netti Agosto", "netti@gmail.com", Long.parseLong("2021904910"), house1_Brookline, "Female", 45, doctor1_ThreeImage);

        PersonDirectory.personList.add(doctor1_one);
        PersonDirectory.personList.add(doctor1Two);
        PersonDirectory.personList.add(doctor1_Three);

        User user1_Doctor = new User("carroll", "carroll", doctor1_one);
        User user1_DoctorOne = new User("armando", "armando", doctor1Two);
        User user1_DoctorTwo = new User("netti", "netti", doctor1_Three);

        UserListDirectory.getDoctorUserList().add(user1_Doctor);
        UserListDirectory.getDoctorUserList().add(user1_DoctorOne);
        UserListDirectory.getDoctorUserList().add(user1_DoctorTwo);

        UserListDirectory.getUserNameToPersonMap().put("carroll", doctor1_one);
        UserListDirectory.getUserNameToPersonMap().put("armando", doctor1Two);
        UserListDirectory.getUserNameToPersonMap().put("netti", doctor1_Three);

//        set 2
        Image doctor2_oneIamge = getImage(image_six);
        Image doctor2TwoIamge = getImage(image_seven);
        Image doctor2_ThreeImage = getImage(image_eight);

        Person doctor2_one = new Person("106", "Tamara Jacquelynn", "tamara@gmail.com", Long.parseLong("4504306779"), house2, "Female", 39, doctor2_oneIamge);
        Person doctor2Two = new Person("107", "Taylor Clevie", "taylor@gmail.com", Long.parseLong("1578964690"), house2_Bolyston, "Female", 46, doctor2TwoIamge);
        Person doctor2_Three = new Person("108", "Tracie Phip", "tracie@gmail.com", Long.parseLong("7457116213"), house2_Brookline, "Male", 65, doctor2_ThreeImage);

        PersonDirectory.personList.add(doctor1_one);
        PersonDirectory.personList.add(doctor1Two);
        PersonDirectory.personList.add(doctor1_Three);

        User user2_Doctor = new User("tamara", "tamara", doctor2_one);
        User user2_DoctorOne = new User("taylor", "taylor", doctor2Two);
        User user2_DoctorTwo = new User("tracie", "tracie", doctor2_Three);

        UserListDirectory.getDoctorUserList().add(user2_Doctor);
        UserListDirectory.getDoctorUserList().add(user2_DoctorOne);
        UserListDirectory.getDoctorUserList().add(user2_DoctorTwo);

        UserListDirectory.getUserNameToPersonMap().put("tamara", doctor2_one);
        UserListDirectory.getUserNameToPersonMap().put("taylor", doctor2Two);
        UserListDirectory.getUserNameToPersonMap().put("tracie", doctor2_Three);

//        set 3
        Image doctor3_oneIamge = getImage(image_six);
        Image doctor3TwoIamge = getImage(image_seven);
        Image doctor3_ThreeImage = getImage(image_eight);

        Person doctor3_one = new Person("109", "Stephan Dominick", "tamara@gmail.com", Long.parseLong("5743457557"), house3, "Female", 33, doctor3_oneIamge);
        Person doctor3Two = new Person("110", "Michel Cecelia", "michel@gmail.com", Long.parseLong("3092325271"), house3_Bolyston, "Male", 36, doctor3TwoIamge);
        Person doctor3_Three = new Person("111", "Odelia Agosto", "odelia@gmail.com", Long.parseLong("4504306779"), house3_Brookline, "Female", 55, doctor3_ThreeImage);

        PersonDirectory.personList.add(doctor3_one);
        PersonDirectory.personList.add(doctor3Two);
        PersonDirectory.personList.add(doctor3_Three);

        User user3_Doctor = new User("tamara", "tamara", doctor3_one);
        User user3_DoctorOne = new User("michel", "michel", doctor3Two);
        User user3_DoctorTwo = new User("odelia", "odelia", doctor3_Three);

        UserListDirectory.getDoctorUserList().add(user3_Doctor);
        UserListDirectory.getDoctorUserList().add(user3_DoctorOne);
        UserListDirectory.getDoctorUserList().add(user3_DoctorTwo);

        UserListDirectory.getUserNameToPersonMap().put("tamara", doctor3_one);
        UserListDirectory.getUserNameToPersonMap().put("michel", doctor3Two);
        UserListDirectory.getUserNameToPersonMap().put("odelia", doctor3_Three);

//        set 4
        Image doctor4_oneIamge = getImage(image_six);
        Image doctor4TwoIamge = getImage(image_seven);
        Image doctor4_ThreeImage = getImage(image_eight);

        Person doctor4_one = new Person("109", "Shayla Roana", "shayla@gmail.com", Long.parseLong("1578964690"), house4, "Female", 33, doctor4_oneIamge);
        Person doctor4Two = new Person("110", "Franz Josy", "franz@gmail.com", Long.parseLong("7457116213"), house4_Bolyston, "Male", 36, doctor4TwoIamge);
        Person doctor4_Three = new Person("111", "Jaimie Karlyn", "jaimie@gmail.com", Long.parseLong("4279400687"), house4_Brookline, "Female", 55, doctor4_ThreeImage);

        PersonDirectory.personList.add(doctor4_one);
        PersonDirectory.personList.add(doctor4Two);
        PersonDirectory.personList.add(doctor4_Three);

        User user4_Doctor = new User("shayla", "shayla", doctor4_one);
        User user4_DoctorOne = new User("franz", "franz", doctor4Two);
        User user4_DoctorTwo = new User("jaimie", "jaimie", doctor4_Three);

        UserListDirectory.getDoctorUserList().add(user4_Doctor);
        UserListDirectory.getDoctorUserList().add(user4_DoctorOne);
        UserListDirectory.getDoctorUserList().add(user4_DoctorTwo);

        UserListDirectory.getUserNameToPersonMap().put("shayla", doctor4_one);
        UserListDirectory.getUserNameToPersonMap().put("franz", doctor4Two);
        UserListDirectory.getUserNameToPersonMap().put("jaimie", doctor4_Three);

        //Creating doctors
        Doctor doctor = new Doctor(doctor_one, hospital_one);
        Doctor doctor_two = new Doctor(doctorTwo, hospital_two);
        Doctor doctorThree = new Doctor(doctor_Three, hospital_three);

        DoctorDirectory.doctorList.add(doctor);
        DoctorDirectory.doctorList.add(doctor_two);
        DoctorDirectory.doctorList.add(doctorThree);

        //        g
        Doctor doctor1 = new Doctor(doctor1_one, hospital_one);
        Doctor doctor1_two = new Doctor(doctor1Two, hospital_two);
        Doctor doctor1Three = new Doctor(doctor1_Three, hospital_three);

        DoctorDirectory.doctorList.add(doctor1);
        DoctorDirectory.doctorList.add(doctor1_two);
        DoctorDirectory.doctorList.add(doctor1Three);

        Doctor doctor2 = new Doctor(doctor2_one, hospital_one);
        Doctor doctor2_two = new Doctor(doctor2Two, hospital_two);
        Doctor doctor2Three = new Doctor(doctor2_Three, hospital_three);

        DoctorDirectory.doctorList.add(doctor2);
        DoctorDirectory.doctorList.add(doctor2_two);
        DoctorDirectory.doctorList.add(doctor2Three);

        Doctor doctor3 = new Doctor(doctor3_one, hospital_one);
        Doctor doctor3_two = new Doctor(doctor3Two, hospital_two);
        Doctor doctor3Three = new Doctor(doctor3_Three, hospital_three);

        DoctorDirectory.doctorList.add(doctor3);
        DoctorDirectory.doctorList.add(doctor3_two);
        DoctorDirectory.doctorList.add(doctor3Three);

        Doctor doctor4 = new Doctor(doctor4_one, hospital_one);
        Doctor doctor4_two = new Doctor(doctor4Two, hospital_two);
        Doctor doctor4Three = new Doctor(doctor4_Three, hospital_three);

        DoctorDirectory.doctorList.add(doctor4);
        DoctorDirectory.doctorList.add(doctor4_two);
        DoctorDirectory.doctorList.add(doctor4Three);

        //assigning doctors to hospitals
        hospital_one.getDoctorList().add(doctor);
        hospital_two.getDoctorList().add(doctor_two);
        hospital_three.getDoctorList().add(doctorThree);

        //        g
        hospital_one.getDoctorList().add(doctor1);
        hospital_two.getDoctorList().add(doctor1_two);
        hospital_three.getDoctorList().add(doctor1Three);

        hospital_one.getDoctorList().add(doctor2);
        hospital_two.getDoctorList().add(doctor2_two);
        hospital_three.getDoctorList().add(doctor2Three);

        hospital_one.getDoctorList().add(doctor3);
        hospital_two.getDoctorList().add(doctor3_two);
        hospital_three.getDoctorList().add(doctor3Three);

        hospital_one.getDoctorList().add(doctor4);
        hospital_two.getDoctorList().add(doctor4_two);
        hospital_three.getDoctorList().add(doctor4Three);

//        set 2(same doctors to hosp 4,5,6)
        hospital_four.getDoctorList().add(doctor);
        hospital_five.getDoctorList().add(doctor_two);
        hospital_six.getDoctorList().add(doctorThree);

        hospital_four.getDoctorList().add(doctor1);
        hospital_five.getDoctorList().add(doctor1_two);
        hospital_six.getDoctorList().add(doctor1Three);

        hospital_four.getDoctorList().add(doctor2);
        hospital_five.getDoctorList().add(doctor2_two);
        hospital_six.getDoctorList().add(doctor2Three);

        hospital_four.getDoctorList().add(doctor3);
        hospital_five.getDoctorList().add(doctor3_two);
        hospital_six.getDoctorList().add(doctor3Three);

        hospital_four.getDoctorList().add(doctor4);
        hospital_five.getDoctorList().add(doctor4_two);
        hospital_six.getDoctorList().add(doctor4Three);

        //assiging hospitals to patients
        patient.setHospital(hospital_one);
        patient_Bolyston.setHospital(hospital_two);
        patient_Brookline.setHospital(hospital_three);

        //        g
        patient2.setHospital(hospital_one);
        patient2_Bolyston.setHospital(hospital_two);
        patient2_Brookline.setHospital(hospital_three);

        patient3.setHospital(hospital_one);
        patient3_Bolyston.setHospital(hospital_two);
        patient3_Brookline.setHospital(hospital_three);

        patient4.setHospital(hospital_one);
        patient4_Bolyston.setHospital(hospital_two);
        patient4_Brookline.setHospital(hospital_three);

        patient5.setHospital(hospital_one);
        patient5_Bolyston.setHospital(hospital_two);
        patient5_Brookline.setHospital(hospital_three);

        patient6.setHospital(hospital_one);
        patient6_Bolyston.setHospital(hospital_two);
        patient6_Brookline.setHospital(hospital_three);

        patient7.setHospital(hospital_one);
        patient7_Bolyston.setHospital(hospital_two);
        patient7_Brookline.setHospital(hospital_three);

        patient8.setHospital(hospital_four);
        patient8_Bolyston.setHospital(hospital_five);
        patient8_Brookline.setHospital(hospital_six);

        patient9.setHospital(hospital_four);
        patient9_Bolyston.setHospital(hospital_five);
        patient9_Brookline.setHospital(hospital_six);

        patient10.setHospital(hospital_four);
        patient10_Bolyston.setHospital(hospital_five);
        patient10_Brookline.setHospital(hospital_six);
                
        patient11.setHospital(hospital_four);
        patient11_Bolyston.setHospital(hospital_five);
        patient11_Brookline.setHospital(hospital_six);
                
        patient12.setHospital(hospital_four);
        patient12_Bolyston.setHospital(hospital_five);
        patient12_Brookline.setHospital(hospital_six);
                
        patient13.setHospital(hospital_four);
        patient13_Bolyston.setHospital(hospital_five);
        patient13_Brookline.setHospital(hospital_six);

        // assigning patients to hospital
        hospital_one.getPatientList().add(patient);
        hospital_two.getPatientList().add(patient_Bolyston);
        hospital_three.getPatientList().add(patient_Brookline);
        
        //        g
        hospital_one.getPatientList().add(patient2);
        hospital_two.getPatientList().add(patient2_Bolyston);
        hospital_three.getPatientList().add(patient2_Brookline);

        hospital_one.getPatientList().add(patient3);
        hospital_two.getPatientList().add(patient3_Bolyston);
        hospital_three.getPatientList().add(patient3_Brookline);

        hospital_one.getPatientList().add(patient4);
        hospital_two.getPatientList().add(patient4_Bolyston);
        hospital_three.getPatientList().add(patient4_Brookline);

        hospital_one.getPatientList().add(patient5);
        hospital_two.getPatientList().add(patient5_Bolyston);
        hospital_three.getPatientList().add(patient5_Brookline);

        hospital_one.getPatientList().add(patient6);
        hospital_two.getPatientList().add(patient6_Bolyston);
        hospital_three.getPatientList().add(patient6_Brookline);

        hospital_one.getPatientList().add(patient7);
        hospital_two.getPatientList().add(patient7_Bolyston);
        hospital_three.getPatientList().add(patient7_Brookline);
        
                
        hospital_four.getPatientList().add(patient7);
        hospital_five.getPatientList().add(patient7_Bolyston);
        hospital_six.getPatientList().add(patient7_Brookline);      
                
        hospital_four.getPatientList().add(patient8);
        hospital_five.getPatientList().add(patient8_Bolyston);
        hospital_six.getPatientList().add(patient8_Brookline);
                
        hospital_four.getPatientList().add(patient9);
        hospital_five.getPatientList().add(patient9_Bolyston);
        hospital_six.getPatientList().add(patient9_Brookline);
                
        hospital_four.getPatientList().add(patient10);
        hospital_five.getPatientList().add(patient10_Bolyston);
        hospital_six.getPatientList().add(patient10_Brookline);
                
        hospital_four.getPatientList().add(patient11);
        hospital_five.getPatientList().add(patient11_Bolyston);
        hospital_six.getPatientList().add(patient11_Brookline);
                
        hospital_four.getPatientList().add(patient12);
        hospital_five.getPatientList().add(patient12_Bolyston);
        hospital_six.getPatientList().add(patient12_Brookline);
        
        hospital_four.getPatientList().add(patient13);
        hospital_five.getPatientList().add(patient13_Bolyston);
        hospital_six.getPatientList().add(patient13_Brookline);
           


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
        UserListDirectory.getUserNameToPersonMap().put("jon", donorThree);

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
        UserListDirectory.getUserNameToPersonMap().put("tracy", frThree);

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
        UserListDirectory.getUserNameToPersonMap().put("alexp", srThree);

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
        ArmyEmployee army_Off_One = new ArmyEmployee("1100", armyOffOne, "Boston");
        ArmyEmployeeDirectory.armyEmpList.add(army_Off_One);

        User army_Officer_one = new User("ric", "ric", armyOffOne);
        UserListDirectory.getArmyEmployeeList().add(army_Officer_one);
        UserListDirectory.getUserNameToPersonMap().put("ric", armyOffOne);

        Person armyOffTwo = new Person("1200", "John", "john@gmail.com", Long.parseLong("7754567346"), house, "Male", 39, doctor_oneIamge);
        PersonDirectory.personList.add(armyOffOne);
        ArmyEmployee army_Off_two = new ArmyEmployee("101", armyOffTwo, "New York");
        ArmyEmployeeDirectory.armyEmpList.add(army_Off_two);

        Person armyOffthree = new Person("1300", "Robert", "robert@gmail.com", Long.parseLong("7754567346"), house, "Male", 39, doctor_oneIamge);
        PersonDirectory.personList.add(armyOffthree);
        ArmyEmployee army_Off_three = new ArmyEmployee("102", armyOffthree, "Texas");
        ArmyEmployeeDirectory.armyEmpList.add(army_Off_three);

        Person armyOffFour = new Person("1400", "Alexis", "alexis@gmail.com", Long.parseLong("7754567346"), house, "Female", 39, doctor_oneIamge);
        PersonDirectory.personList.add(armyOffFour);
        ArmyEmployee army_Off_Four = new ArmyEmployee("103", armyOffFour, "Boston");
        ArmyEmployeeDirectory.armyEmpList.add(army_Off_Four);

        //Police Head
        Person policeHead = new Person("14000", "Rohit", "Rohit@gmail.com", Long.parseLong("7754567346"), house, "Male", 39, doctor_oneIamge);
        PersonDirectory.personList.add(policeHead);
        User police_head = new User("police", "police", policeHead);
        UserListDirectory.getPoliceHeadList().add(police_head);
        UserListDirectory.getUserNameToPersonMap().put("police", policeHead);

        //Creating police officers
        Person policeOffOne = new Person("1800", "Macy", "macy@gmail.com", Long.parseLong("7754567346"), house, "Female", 39, doctor_oneIamge);
        PersonDirectory.personList.add(policeOffOne);
        PoliceEmployee police_Off_One = new PoliceEmployee("1100", policeOffOne, "Boston");
        PoliceEmployeeDirectory.policeEmpList.add(police_Off_One);

        User police_Officer_one = new User("macy", "macy", policeOffOne);
        UserListDirectory.getPoliceEmployeeList().add(police_Officer_one);
        UserListDirectory.getUserNameToPersonMap().put("macy", policeOffOne);

        Person policeOffTwo = new Person("1810", "Ben", "ben@gmail.com", Long.parseLong("7754567346"), house, "Male", 39, doctor_oneIamge);
        PersonDirectory.personList.add(policeOffTwo);
        PoliceEmployee police_Off_Two = new PoliceEmployee("1110", policeOffOne, "Boston");
        PoliceEmployeeDirectory.policeEmpList.add(police_Off_Two);

        Person policeOffThree = new Person("1820", "Stanley", "stanley@gmail.com", Long.parseLong("7754567346"), house, "Male", 39, doctor_oneIamge);
        PersonDirectory.personList.add(policeOffThree);
        PoliceEmployee police_Off_Three = new PoliceEmployee("1120", policeOffThree, "Boston");
        PoliceEmployeeDirectory.policeEmpList.add(police_Off_Three);

        Person policeOffFour = new Person("1830", "Mark", "mark@gmail.com", Long.parseLong("7754567346"), house, "Male", 39, doctor_oneIamge);
        PersonDirectory.personList.add(policeOffFour);
        PoliceEmployee police_Off_Four = new PoliceEmployee("1130", policeOffFour, "Boston");
        PoliceEmployeeDirectory.policeEmpList.add(police_Off_Four);

        //Navy Head
        Person navyHead = new Person("15100", "Olivia", "olivia@gmail.com", Long.parseLong("7754567346"), house, "Female", 39, doctor_oneIamge);
        PersonDirectory.personList.add(navyHead);
        User navy_head = new User("navy", "navy", navyHead);

        UserListDirectory.getNavyHeadList().add(navy_head);
        UserListDirectory.getUserNameToPersonMap().put("navy", navyHead);

        //Creating navy officers
//          Navy emp with username
        Person navyOffOne = new Person("1900", "Liam", "liam@gmail.com", Long.parseLong("7754567346"), house, "Female", 39, doctor_oneIamge);
        PersonDirectory.personList.add(navyOffOne);
        NavyEmployee navy_Off_One = new NavyEmployee("1100", navyOffOne, "Boston");
        NavyEmployeeDirectory.empList.add(navy_Off_One);

        User navy_Officer_one = new User("emma", "emma", navyOffOne);
        UserListDirectory.getNavyEmployeeList().add(navy_Officer_one);
        UserListDirectory.getUserNameToPersonMap().put("emma", navyOffOne);

//          Navy emp 
        Person navyOffTwo = new Person("1910", "Ben", "ben@gmail.com", Long.parseLong("7754567346"), house, "Male", 39, doctor_oneIamge);
        PersonDirectory.personList.add(navyOffTwo);
        NavyEmployee navy_Off_Two = new NavyEmployee("1110", navyOffTwo, "Boston");
        NavyEmployeeDirectory.empList.add(navy_Off_Two);

        Person navyOffThree = new Person("1920", "Stanley", "stanley@gmail.com", Long.parseLong("7754567346"), house, "Male", 39, doctor_oneIamge);
        PersonDirectory.personList.add(navyOffThree);
        NavyEmployee navy_Off_Three = new NavyEmployee("1120", navyOffThree, "Boston");
        NavyEmployeeDirectory.empList.add(navy_Off_Three);

        Person navyOffFour = new Person("1930", "Mark", "mark@gmail.com", Long.parseLong("7754567346"), house, "Male", 39, doctor_oneIamge);
        PersonDirectory.personList.add(navyOffFour);
        NavyEmployee navy_Off_Four = new NavyEmployee("1130", navyOffFour, "Boston");
        NavyEmployeeDirectory.empList.add(navy_Off_Four);

    }
}
