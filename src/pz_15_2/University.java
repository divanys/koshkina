package pz_15_2;

import java.util.Random;


class University extends Building implements SocialHouse {
    private int numberOfDepartments;
    private int numberOfStudents;
    private String universityPresidentName;
    private int capacity;
    private boolean hasParking;
    private boolean hasCafeteria;

    public University(String name, String address, int yearBuilt, String architectName, boolean isCulturalMonument,
                      int numberOfDepartments, int numberOfStudents, String universityPresidentName,
                      int capacity, boolean hasParking, boolean hasCafeteria) {
        super(name, address, yearBuilt, architectName, isCulturalMonument);
        setNumberOfDepartments(numberOfDepartments);
        setNumberOfStudents(numberOfStudents);
        setUniversityPresidentName(universityPresidentName);
        setCapacity(capacity);
        setHasParking(hasParking);
        setHasCafeteria(hasCafeteria);
    }

    // Getters
    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getUniversityPresidentName() {
        return universityPresidentName;
    }

    // Setters
    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setUniversityPresidentName(String universityPresidentName) {
        this.universityPresidentName = universityPresidentName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean hasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public boolean hasCafeteria() {
        return hasCafeteria;
    }

    public void setHasCafeteria(boolean hasCafeteria) {
        this.hasCafeteria = hasCafeteria;
    }

    public void offerScholarships() {
        Random rand = new Random();
        int totalScholarships = rand.nextInt(getNumberOfStudents() / 10) + 1; // Случайное количество стипендий от общего числа студентов

        System.out.println("Поздравляем следующих студентов:");

        for (int i = 0; i < totalScholarships; i++) {
            String studentName = "Student" + (rand.nextInt(getNumberOfStudents()) + 1); // Случайное имя студента
            int scholarshipAmount = rand.nextInt(1000) + 500; // Случайная сумма стипендии

            System.out.println(studentName + " - $" + scholarshipAmount);
        }
    }

    public void conductResearch(String title, String investigators, int funding, int duration) {
        System.out.println("Title: " + title);
        System.out.println("Investigators: " + investigators);
        System.out.println("Funding: $" + funding);
        System.out.println("Duration: " + duration + " years");
        System.out.println("Status: In Progress");
    }

    public void addStudent(int countOfStudent) {
        for (int i = 0; i < countOfStudent; i++) {
            String studentName = "Student" + (getNumberOfStudents() + i + 1); // Генерация имени для студента
            int entranceExamScore = new Random().nextInt(101); // Случайный балл (от 0 до 100)

            if (entranceExamScore >= 70) {
                System.out.println(studentName + " has been admitted!");
                setNumberOfStudents(getNumberOfStudents() + 1);
            } else {
                System.out.println(studentName + " did not meet the admission criteria.");
            }
        }
    }

    @Override
    public void capacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void hasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    @Override
    public void hasCafeteria(boolean hasCafeteria) {
        this.hasCafeteria = hasCafeteria;
    }

    @Override
    public void display() {
        System.out.println("This is a university.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of Departments: " + numberOfDepartments +
                "\nNumber of Students: " + numberOfStudents +
                "\nUniversity President Name: " + universityPresidentName +
                "\nCapacity: " + capacity +
                "\nHas Parking: " + hasParking +
                "\nHas Cafeteria: " + hasCafeteria;
    }
}
