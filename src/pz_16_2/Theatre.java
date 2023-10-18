package pz_16_2;

import java.util.ArrayList;

class Theatre {
    private ArrayList<Spectator> spectators = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public void addSpectator(Spectator spectator) {
        spectators.add(spectator);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

}