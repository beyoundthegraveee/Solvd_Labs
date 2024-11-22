package Lab03;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Assignment assignment1 = new Assignment(1, "Math Homework", LocalDate.of(2024, 10, 15), AssignmentStatus.SENT);
        Assignment assignment2 = new Assignment(2,"Science Project", LocalDate.of(2024, 11, 1),AssignmentStatus.SENT);

        Map<Assignment, Double> assignmentGrades = new HashMap<>();
        assignmentGrades.put(assignment1, 88.5);
        assignmentGrades.put(assignment2, 92.0);

        Grade grade = new Grade(85.5, 87.0, 90.0, assignmentGrades);

        ArrayList<Grade> grades = new ArrayList<>();
        grades.add(grade);

        Student student = new Student("Alice", "Johnson", 20, "S12345",grades,"alice@gmail.com", LocalDate.of(2024,9,10));

        System.out.println(student + "\n");


        Department computerScienceDepartment = new Department("Computer Science", 15);
        Employee professor = new Professor("Dr. John", "Doe", 45, "EMP12345","Professor", EmployeeStatus.ACTIVE,
                computerScienceDepartment, 20, true, "Doctorate");
        ArrayList<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("Mathematics", "AM"));
        subjects.add(new Subject("Algorithms", "ALG"));
        Employee practitioner = new Practitioner("Robert", "Brown", 35, "E12345","Teacher", EmployeeStatus.CONTRACT,
                computerScienceDepartment,15, subjects, 10, "robert@gmail.com");

        Employee [] employees = {practitioner, professor};
        for (Employee employee: employees) {
            System.out.println(employee.getInfoAboutEmployee());
        }

        ///////////////////////////////

        Practitioner diplomaTeacher = new Practitioner("Adam", "Brown", 22, "E12223","Teacher", EmployeeStatus.ACTIVE,
                computerScienceDepartment,12, subjects, 8, "adam@gmail.com");;

        Student studentDiploma = new Student("Steve", "Morales", 19, "S24345","steve@gmail.com", LocalDate.of(2024,9,10));

        Diploma diploma = new Diploma( "Algorithms in real life","Final diploma documentation", studentDiploma,
                LocalDate.of(2024, 6, 15), diplomaTeacher,  "Bachelor's Degree");

        System.out.println(diploma + "\n");

        /////////////////////////////////////////////
        Department physicsDepartment = new Department("Physics", 7);

        Employee labSupervisor = new Professor("Sarah", "Smith",45, "X11345", "Supervisor", EmployeeStatus.ACTIVE, physicsDepartment, true);


        ArrayList<DayOfWeek> openedDays = new ArrayList<>();
        openedDays.add(DayOfWeek.Monday);
        openedDays.add(DayOfWeek.Tuesday);
        openedDays.add(DayOfWeek.Wednesday);
        openedDays.add(DayOfWeek.Thursday);
        openedDays.add(DayOfWeek.Friday);

        List<String> initialBooks = List.of("Java Basics", "Advanced Java", "Data Structures");

        Library library = new Library(1, "B", 100, 60, 50, 50,
                "08:00 AM", "08:00 PM",openedDays, initialBooks);

        String bookToReserve = "Java Basics";

        if (!library.isBookAvailable(bookToReserve)) {
            System.out.println("Book not available or does not exist: " + bookToReserve);
        } else {
            boolean reservationResult = library.reserveBook(bookToReserve, student.getStudentID());
            if (reservationResult) {
                System.out.println("Reservation successful: " + bookToReserve);
            } else {
                System.out.println("Reservation failed for: " + bookToReserve);
            }
        }

        System.out.println(library.getAvailableBooks());

        library.cancelReservation(bookToReserve, student.getStudentID());

        System.out.println(library+ "\n");


        Laboratory laboratory = new Laboratory(40,202, "A", 3,
                new Equipment[]{Equipment.COMPUTER, Equipment.AUDIO_SYSTEM, Equipment.PROJECTOR, Equipment.SMART_BOARD}, true, "Physics Lab",
                labSupervisor, "Physics Experiments");

        System.out.println("Before ordering equipment: " + Arrays.toString(laboratory.listAvailableEquipment()));

        laboratory.orderEquipment(Equipment.MICROPHONE);

        System.out.println("After ordering equipment: " + Arrays.toString(laboratory.listAvailableEquipment()));

        laboratory.removeEquipment(Equipment.MICROPHONE);

        System.out.println("After removing equipment: " + Arrays.toString(laboratory.listAvailableEquipment()));

        System.out.println(laboratory + "\n");

        ///////////////////////////////////

        ArrayList<Subject> subjectsPractitioner = new ArrayList<>();
        subjectsPractitioner.add(new Subject("Physics", "PHYS"));
        subjectsPractitioner.add(new Subject("Data Structures", "DS"));
        Practitioner practitioner1 = new Practitioner("John", "Doe", 35, "P12322", "Practitioner", EmployeeStatus.ACTIVE, physicsDepartment, 10, subjectsPractitioner, 5, "johndoe@example.com");
        Practitioner practitioner2 = new Practitioner("John", "Doe", 35, "P12322", "Practitioner", EmployeeStatus.ACTIVE, physicsDepartment, 10, subjectsPractitioner, 5, "johndoe@example.com");
        Professor professor1 = new Professor("Jane", "Smith", 40, "P456", "Professor", EmployeeStatus.ACTIVE, computerScienceDepartment, 15, true, "PhD");

        boolean arePractitionersEqual = practitioner1.equals(practitioner2);
        System.out.println("Practitioners are equal: " + arePractitionersEqual);
        boolean arePractitionerAndProfessorEqual = practitioner1.equals(professor1);
        System.out.println("Practitioner and Professor are equal: " + arePractitionerAndProfessorEqual);  // Should return false



        Student student1 = new Student("Mark", "Johnson", 20, "S13345", "mark@gmail.com", LocalDate.of(2024,9,10));
        Student student2 = new Student("Mark", "Johnson", 20, "S13345", "mark@gmail.com", LocalDate.of(2024,9,10));
        Student student3 = new Student("John", "Johnson", 22, "S11145", "john@gmail.com", LocalDate.of(2024,9,10));
        System.out.println("student1 equals student2: " + student1.equals(student2));//true
        System.out.println("student1 equals student3: " + student1.equals(student3));//false
        System.out.println();

        /////////////////////////////////////////

        Professor professor2 = new Professor("Mike", "Smith", 26, "P416", "Professor", EmployeeStatus.ACTIVE, computerScienceDepartment, 12, true, "PhD");

        Practitioner practitioner3 = new Practitioner("Michael", "Smith", 50, "P45622", "Practitioner", EmployeeStatus.ACTIVE, physicsDepartment, 10, subjectsPractitioner, 19, "michael@example.com");

        ArrayList<Professor> professors = new ArrayList<>();
        professors.add(professor1);
        professors.add(professor2);

        ArrayList<Practitioner> practitioners = new ArrayList<>();
        practitioners.add(practitioner1);
        practitioners.add(practitioner3);

        ArrayList<Assignment> assignments = new ArrayList<>();
        assignments.add(assignment1);
        assignments.add(assignment2);

        Course course = new Course("Computer Science", "CS101", "Introduction to Computer Science",
                "Warsaw, PJATK", professors, practitioners, assignments);

        System.out.println(course.getCourseDetails());
        /////////////////////////////////////////////////

        ArrayList<Event> events = new ArrayList<>();
        events.add(new Event("Physics Conference", LocalDate.of(2024, 11, 20), "Warsaw"));
        events.add(new Event("Math Conference", LocalDate.of(2024, 3, 10), "Warsaw"));
        Semestr semestr = new Semestr(1,  "2024/2025", events, LocalDate.of(2024, 9, 1),
                LocalDate.of(2025, 1, 31));

        System.out.println(semestr + "\n");
        semestr.removeEventByName("Physics Conference");
        semestr.addEvent(new Event("Game jam 2024", LocalDate.of(2024, 11, 20), "Warsaw, Main building"));

        System.out.println(semestr + "\n");

        semestr.removeAllEvents();

        System.out.println(semestr + "\n");



        Equipment [] equipmentList = {Equipment.PROJECTOR, Equipment.SMART_BOARD, Equipment.COMPUTER, Equipment.AUDIO_SYSTEM, Equipment.DOCUMENT_CAMERA};

        ArrayList<Classroom> classrooms = new ArrayList<>();

        LightingType [] lightingTypes = {LightingType.LED, LightingType.Natural};

        LectureRoom lectureRoom1 = new LectureRoom(
                100, 401, "Main Building", 4,
                equipmentList, true, true, lightingTypes,
                true, 10);

        LectureRoom lectureRoom2 = new LectureRoom(
                80, 502, "Main Building", 5,
                equipmentList, false, false, lightingTypes,
                true, 15);

        classrooms.add(lectureRoom1);
        classrooms.add(lectureRoom2);
        classrooms.add(laboratory);

        DayOfWeek[] days = {DayOfWeek.Monday, DayOfWeek.Tuesday, DayOfWeek.Wednesday, DayOfWeek.Friday};

        Schedule schedule = new Schedule(days, LocalDate.of(2024, 1, 15), LocalDate.of(2024, 6, 30), classrooms);

        System.out.println(schedule);


        ///////////////////////////////
        Department itDepartment = new Department("IT", 0);

        Employee professor3 = new Professor("Alex", "Doe", 45, "EMP12345","Professor", EmployeeStatus.ACTIVE,
                computerScienceDepartment, 20, true, "Doctorate");


        Practitioner practitioner4 = new Practitioner("Bob", "Brown", 22, "E12223","Teacher", EmployeeStatus.ACTIVE,
                computerScienceDepartment,12, subjects, 8, "adam@gmail.com");

        itDepartment.addEmployee(professor3);
        itDepartment.addEmployee(practitioner4);

        System.out.println(itDepartment);

        itDepartment.removeEmployee(practitioner4);

        System.out.println(itDepartment);
        ////////////////////////////////


        Subject math = new Subject("Mathematics" ,"MATH");

        Exam mathExam = new Exam(math, LocalDate.of(2024, 7, 10), LocalTime.of(9, 0),1.5 , "Room101");

        Equipment[] equipment = {Equipment.PROJECTOR, Equipment.WHITEBOARD, Equipment.COMPUTER};

        LectureRoom lectureRoom = new LectureRoom(30, 101, "Building A", 1, equipment, true, true, new LightingType[]{LightingType.Natural}, true, 3);

        lectureRoom.startExam(mathExam);

        lectureRoom.endExam(mathExam);

        System.out.println("\n");

        ///////////////////////////////

        Assignment firstAssignment = new Assignment(1, "Complete Math Homework", LocalDate.of(2024, 12, 10), AssignmentStatus.SENT);
        Assignment secondAssignment = new Assignment(2, "Write Science Report", LocalDate.of(2024, 12, 15), AssignmentStatus.SENT);

        Student studentExample = new Student("John", "Doe", 20, "S12345", "john.doe@example.com", LocalDate.of(2023, 9, 1));

        studentExample.addAssignment(firstAssignment);
        studentExample.addAssignment(secondAssignment);

        studentExample.doneAssignment(firstAssignment);
        studentExample.doneAssignment(secondAssignment);

        //////////////////////////////






















    }
}