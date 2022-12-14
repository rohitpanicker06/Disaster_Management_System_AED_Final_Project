# Disaster_Management_System_AED_Final_Project





**CONTEXT**

#### Disaster Immediate Response

Our Disaster Management System application is designed to aid society to find quick safety from natural disasters in their locality. Disasters can range from Hurricanes to Tornadoes. The application allows us to record disasters happening around any area, the date the disaster happened and enable us to view all disasters recorded. 

On occurence of a disaster we assign a Site Reporting Employee who will create a detailed report of the disaster and the casualties. The casualities are available in print format for hard copy usage and storage. 

The Civil Response Head will recieve the data from the the Site Reporting Employee which will be listed as active disasters table in his dashboard. He will analyse and prepare a Civil Response Report that  addresses the level of severity and risk. It is then assigned to one or more forces: Army, Navy and Police. Each force heads will recieve the report for further action. Once a report is created on a disaster it is removed from the list of active disasters. The civil Response head will be able to view all the disasters(active and inactive) in the View all disasters table accessible from his dashboard.

If the Report if assigned to Army, the Army Head will be able to view the operation assigned according to the Report from Civil Response. The force head shall then assign one or more employees/officers to work on the task and the officers will be notified. He can also view all the reports assigned to army in the View all option in dashboard.

On login, the Army officer can view his profile details and also a list of assigned tasks by the Army head and will begin his activity. 

The Navy Head gets the civil response report if assigned by the Civil Response Head and he will then assign one or more employees/officers to work on the task. Now, the Navy officer views the assigned task by the Navy head and will begin his activity. Similarly, the Police Head gets the civil response reports assigned by the Civil Response Head and he will then assign one or more employees/officers to work on the task. Now, the Police officer views the assigned task by the Navy head and will begin his activity. 


#### Disaster Recovery 

The Fund Raising Head can create new fund raisers for all the disasters reported and can raise funds in any currency. The same will be published to television, radio and social media for audience attention. After users have donated, the fund raising head will be able to view an analytics report on how much money was donated to the fund raiser for a disaster and against how much the fund raiser had requested. The report can be represented statistically in the form of a bar chart. 

There is a charity entity in which a user can choose a disaster for which funds raising was announced and donate funds to the fund raising event based on the medium they heard about the fund raising which is through television, radio or social media or a mix of these mediums. Once the funds are donated, the charity entity user can view the bar for how much money the donations was made against how much money the fund raiser has requested. The donation will be available for the Fund Raising Head for analytics.

The hospital is an organization that consists of Doctors, Patients and Pharmacies. A Doctor can write prescriptions for all the patients affected by the disaster; they can write medicines to them. Next, a pharmacy can get the prescription written to the patient affected by the disaster and can approve the prescription and bill the amount due by the patient. The bill will be emailed to the user's mobile phone and he can view the patient and their medicines prescribed by the doctor and view the price of the medicines. Within the hospital organization, there is a hospital admin who can view all hospitals, delete a certain hospital, view all doctors within the selected hospital, and can view all patients within a hospital as well.

The application has a system admin who can create, read, updated and delete Doctors and Patients. Basically, he has the hold over how many doctors and patients are allowed in a hospital. We have a community admin as well who can create, read, updated and delete Hospitals. 



**SCREENSHOTS OF FOR LOOK AND FEEL**

1. Login:

<img width="1470" alt="Screenshot 2022-12-11 at 8 28 32 PM" src="https://user-images.githubusercontent.com/114315272/206945853-599e8038-5bad-4536-8c9a-02c1914a37c8.png"> 

2. OTP Page:

<img width="1470" alt="Screenshot 2022-12-11 at 8 44 09 PM" src="https://user-images.githubusercontent.com/114315272/206946075-bc081022-fc81-4a4f-8e37-453fd2df285d.png">


3. OTP Succces:

<img width="1470" alt="Screenshot 2022-12-11 at 8 44 35 PM" src="https://user-images.githubusercontent.com/114315272/206946142-06a37a45-e793-4194-9cce-68ae08db8248.png">


4. Sign Up Success:

<img width="1470" alt="Screenshot 2022-12-11 at 8 44 35 PM" src="https://user-images.githubusercontent.com/114315272/206946320-2f93acd1-788c-40f1-9a13-d9185cfc9d8d.png">



**DESIGN DOCUMENTATION**
**UML DIAGRAM**
Attaching two UML Diagram that explains the enterprises, organizations and the roles used in this project.

1. Role Based Access Method Implementation: 

![RBAC_AED](https://user-images.githubusercontent.com/66110853/206954353-40f777fa-85e4-4777-a0b3-ca42f2b54511.jpeg)


2. Architectural UML Diagram for Disaster Management 
![UML Diagram](https://user-images.githubusercontent.com/66110853/206954725-24acd55a-260f-43ce-9ab1-0cb864385e90.png)

3. Architectural Diagram for Hospital Enterprise (If Intrested)
![ClassDiagram drawio-5](https://user-images.githubusercontent.com/66110853/206954822-d6543c15-3edb-4b53-b2c2-083f92426787.png)

4. Sequence Diagram 
![FlowDiagram](https://user-images.githubusercontent.com/66110853/206960105-e416a5aa-9fc2-4027-b17f-2f6046600ba7.png)


**SCREENSHOTS OF PRINT FUNCTION IN SiteReportingWorkspacePanel**

1. Printing a missing report:

![image](https://user-images.githubusercontent.com/114315272/206955768-d039a22f-abea-4856-b3be-f06cfb4f9eae.png)

![image](https://user-images.githubusercontent.com/114315272/206955790-f17974cd-1d86-443e-9960-0fa2349755ba.png)

![image](https://user-images.githubusercontent.com/114315272/206955807-49c0839e-b82c-436f-b927-76f1f63b0a5d.png)

2. Saved the report as a PDF document:

![image](https://user-images.githubusercontent.com/114315272/206955860-74716f34-1dda-4a46-8569-cb38cf984088.png)




