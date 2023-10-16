package pz_15_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nИспользование Library.\n");
        Library myLibrary = new Library("Central Library",
                "123 Main Street",
                1985,
                "John Doe",
                true,
                1000,
                true,
                "Alice Smith",
                500,
                true,
                true );

        System.out.println(myLibrary + "\n");

        System.out.println("Выдача книги.");
        myLibrary.lendBook("Bob Johnson", "Introduction to Java", 5);
        System.out.println();

        System.out.println("Возврат книги.");
        myLibrary.returnBook("Bob Johnson", "Introduction to Java", 3, 5);
        System.out.println();

        System.out.println("Завоз книг.");
        myLibrary.acceptBooks(3);
        System.out.println();

        System.out.println("========================================================================");


        System.out.println("\nИспользование House.\n");
        House myHouse = new House("My House",
                "123 Main Street",
                2020,
                "Architect Name",
                false,
                5,
                true,
                false);

        System.out.println(myHouse + "\n");

        System.out.println("Добавляем комнаты в дом.");
        myHouse.addRoom(2);
        System.out.println();

        System.out.println("Определяем наличие сада.");
        myHouse.addGarden();
        System.out.println();

        System.out.println("Определяем наличие гаража.");
        myHouse.addGarage();
        System.out.println();

        System.out.println("Определяем наличие ремонта у дома.");
        myHouse.renovate(true);
        System.out.println();

        System.out.println(myHouse);
        System.out.println();
        System.out.println("========================================================================");


        System.out.println("\nИспользование PoliceDepartment\n");
        PoliceDepartment myPoliceStation = new PoliceDepartment(
                "Main Police Station",
                "123 Main Street",
                2000,
                "Architect A.",
                false,
                100,
                true,
                "Chief Officer Smith",
                700,
                true,
                true
        );

        System.out.println(myPoliceStation + "\n");

        System.out.println("Проведем расследование\n");
        myPoliceStation.conductInvestigation("Murder Case");
        System.out.println();

        System.out.println("Произведем арест\n");
        myPoliceStation.makeArrest("John Doe");
        System.out.println();

        System.out.println("========================================================================");


        System.out.println("\nИспользование University\n");
        University myUniversity = new University("Tech University",
                "101 Tech Blvd",
                1970,
                "Jane Smith",
                true,
                10,
                20000,
                "President James Johnson",
                15000,
                true,
                true);
        System.out.println(myUniversity + "\n");

        System.out.println("Предоставление стипендий");
        myUniversity.offerScholarships();
        System.out.println();

        System.out.println("Проведение исследования");
        myUniversity.conductResearch("Advances in Robotics", "Dr. Smith and Prof. Johnson", 150000, 2);
        System.out.println();

        System.out.println("Добавление студентов");
        myUniversity.addStudent(10);
        System.out.println();

        System.out.println(myUniversity);
        System.out.println();

        System.out.println("========================================================================");


        System.out.println("\nИспользование ShoppingCenter\n");
        ShoppingCenter myShoppingCenter = new ShoppingCenter("Mega Mall",
                "2020 Shopper's Way",
                2010,
                "John Doe",
                false,
                100,
                true,
                "Mall Manager Mary Johnson",
                2000,
                true,
                true);
        System.out.println(myShoppingCenter + "\n");

        System.out.println("Открываем новые магазины");
        myShoppingCenter.openNewStores(10);
        System.out.println();

        System.out.println("Организуем мероприятие");
        myShoppingCenter.organizeEvents("Грандиозное открытие", "15 октября");
        System.out.println();

        System.out.println("Закрываем магазины");
        myShoppingCenter.closeStores(5);
        System.out.println();

        System.out.println(myShoppingCenter);
        System.out.println();

        System.out.println("========================================================================");


        System.out.println("\nИспользование HighRiseBuilding\n");
        HighRiseBuilding myHighRiseBuilding = new HighRiseBuilding("Sky Tower",
                "303 Skyscraper Ave",
                2020,
                "Jane Smith",
                true,
                30,
                true,
                true,
                3,
                false,
                false);
        System.out.println(myHighRiseBuilding + "\n");

        System.out.println("Проедемся на лифте?");
        myHighRiseBuilding.pressElevatorButton(15);
        System.out.println();

        System.out.println("Добавляем этажи на здание");
        myHighRiseBuilding.addFloor(5);
        System.out.println();

        System.out.println("Че по парковке?");
        myHighRiseBuilding.checkParkingAvailability();
        System.out.println();

        System.out.println(myShoppingCenter);
        System.out.println();

        System.out.println("========================================================================");


        System.out.println("Все дисплеи");
        myLibrary.display();
        myHouse.display();
        myPoliceStation.display();
        myUniversity.display();
        myShoppingCenter.display();
        myHighRiseBuilding.display();
        System.out.println("========================================================================");

    }
}