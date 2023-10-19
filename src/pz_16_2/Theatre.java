package pz_16_2;

import java.util.ArrayList;

class Theatre {
    private final ArrayList<Performer> performers = new ArrayList<>();
    private final ArrayList<Ticket> tickets = new ArrayList<>();
    private final ArrayList<Performance> performances = new ArrayList<>();


    public void addPerformer(Performer performer) {
        boolean isPerformerExist = false;
        for (Performer existingPerformer : performers) {
            if (existingPerformer.getLastName().equals(performer.getLastName()) &&
                    existingPerformer.getFirstName().equals(performer.getFirstName()) &&
                    existingPerformer.getMiddleName().equals(performer.getMiddleName())) {
                System.out.printf("%s %s %s уже зарегистрирован как артист в театре.\n",
                        performer.getLastName(), performer.getFirstName(), performer.getMiddleName());
                isPerformerExist = true;
                break;
            }
        }
        if (!isPerformerExist) {
            performer.printPerformer();
            performers.add(performer);
        }
    }

    public void addTicket(Ticket ticket) {
        boolean isTicketExist = false;
        for (Ticket existingTicket : tickets) {
            if (existingTicket.getNumberTicket() == ticket.getNumberTicket()) {
                System.out.printf("Билет с номером %d уже был зарегистрирован в театре.\n", ticket.getNumberTicket());
                isTicketExist = true;
                break;
            }
        }
        if (!isTicketExist && ticket.isReg()) {
            tickets.add(ticket);
            System.out.printf("Билет с номером %d зарегистрирован в театре!\n", ticket.getNumberTicket());
        } else {
            System.out.println("Билет не зарегистрирован в театре!");
        }
    }

    public void addPerformance(Performance performance) {
        boolean isPerformanceExist = false;
        for (Performance existingPerformance : performances) {
            if (existingPerformance.getShowName().equals(performance.getShowName())) {
                System.out.printf("Представление с названием %s уже зарегистрировано в театре и не будет добавлено.\n", performance.getShowName());
                isPerformanceExist = true;
                break;
            }
        }
        if (!isPerformanceExist) {
            performances.add(performance);
            System.out.printf("%s с названием %s зарегистрировано в театре!\nДата %s время %s\n",
                    performance.getShowType(), performance.getShowName(), performance.getDate(), performance.getTime());
        }
    }


    public void printListAllTickets() {
        for (Ticket ticket : tickets) {
            ticket.printTicket();
        }
    }

    public void printListAllPerformances() {
        for (Performance performance : performances) {
            performance.printPerformance();
        }
    }

    public void printListAllPerformers() {
        for (Performer performer : performers) {
            performer.printPerformer();
        }
    }
}