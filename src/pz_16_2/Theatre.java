package pz_16_2;

import java.util.ArrayList;

class Theatre {
    private ArrayList<Spectator> spectators = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private ArrayList<Performance> performances = new ArrayList<>();


    public void addSpectator(Spectator spectator) {
        spectators.add(spectator);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addTicket(Ticket ticket) {
        System.out.printf("Билетик с номером %d зарегистрирован в театре!\n", ticket.getNumberTicket());
        tickets.add(ticket);
    }

    public void addPerformance(Performance performance) {
        performances.add(performance);
    }

    public void printListAllTickets() {
        for (Ticket ticket : tickets) {
            ticket.printTicket(ticket.getNumberTicket());
        }
    }
}