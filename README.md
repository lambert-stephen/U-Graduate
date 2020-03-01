# We Push to Master Final Project


## Description

Overview: uGraduate is going to be an application that centralizes the current
in place systems students use to register. Students currently use 3 different
applications/systems to register for a semester. uAchieve, Register XE,
and uAdvise. All of the systems are not consistent and they are not centered
around the user experience. uGraduate will allow students to register, drop
classes, visually see all required courses through graduation in a tree like
fashion, and see available resources. All access control will be done through
administrators that have the ability to not only drop/add students to classes,
but they will indicate whether or not a student passes or fails a class and
updates the GUI accordingly.


## Authors

| Member | Web dev level | Specialization |
| --- | --- | --- |
| Fabian Miranda Corpuz | Dabbled with a lot of Java and Spring MVC | Security. I want to learn how to properly utilize security in a non-trivial way. I will customize the IAM on AWS and use credential-less storing so we are not storing keys on the repo. 2f authentication. Since there is no incredibly obvious security solution for this registration system, I will designate all security aspects of the application as my specialization |
| Hanna Thayyil | Novice | --- |
| Jonathan Vega the Intermediate | Took IT202, flew through most content though.. | Front-end. Bootstrap, JQuery, probably React |
| Stephen Lambert | Novice | --- |

## Deliverables for checkpoint 2

Have Hibernate and MySQL set up with a good amount of toy data we can use for querying.
We should at least have the following amount of toy data
50 students with all of their credentials
2 different colleges with 2 majors per college and 10 classes for each major
20 classes with class names, times and seat information
2 admins

The functionalities listed above under Students will be what our tests are checking for. Basic CRUD tests should be written for the students' class.

Fabian - mess around with Spring Security and configure things as needed. Still unsure of how to fully use Spring security but will have more detailed Spring security actions by checkpoint 4. Work on IAM configurations and learn how to do that. Will try to get those configurations up and running.

## Deliverables for checkpoint 4

Outline in English what the deliverables will be for checkpoint 4. Reminder that this is not *due*
until checkpoint 2, but failing to plan is planning to fail.

For each specialization, you must list specific checkpoints that are relevant to that particular specialization.

## Deliverables for final project

Outline in English what the deliverables will be for the final checkpoint. This will should be
similar to the **Description** above, but written out as an explicit checklist rather than a human
readable description. Reminder that this is not *due* until checkpoint 4, but failing to plan is
planning to fail.

For each specialization, you must list specific checkpoints that are relevant to that particular specialization.

## Specialization deliverables

Fabian - Secure management of the registration system. IAM customization for Admin roles only. String access control. 2F auth for admins. Extensive logging. Credential-less storing, and other related security vulnerabilities within the scope of the registration system

Jon - An interactive Class tree map that displays classes completed, in progress, and finished. Will make a very user experience centered design that focuses on user recognition (rather than recall) and really adhere to the Nielson 10 design heuristics

# Installation

AWS Deployment Instructions:
- Intall Intellij or Eclipse
- Import this project folder as a MAVEN project
- Run mvn clean package. This will create a directory called target and add folders and files inside. Inside the file, there is a .war file (not the .war.original). This is the file that will be used to deploy on the server
- On AWS, create a new instance of Elastic Beanstalk and upload the .war file from the project directory
- Good to go