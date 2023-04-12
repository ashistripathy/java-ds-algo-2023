package org.company.tapu.morganstanley;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private String departure;
    private String destination;

    public Ticket(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }
    public static void main(String ... args){
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("New York", "Los Angeles"));
        tickets.add(new Ticket("San Francisco", "Seattle"));
        tickets.add(new Ticket("Los Angeles", "San Francisco"));

        String departure = tickets.get(0).getDeparture();
        String destination = tickets.get(tickets.size() - 1).getDestination();

        for (int i = 1; i < tickets.size(); i++) {
            Ticket currentTicket = tickets.get(i);
            Ticket previousTicket = tickets.get(i - 1);

            if (!currentTicket.getDeparture().equals(previousTicket.getDestination())) {
                throw new IllegalArgumentException("Invalid tickets");
            }

            if (i == tickets.size() - 1) {
                departure = previousTicket.getDestination();
                destination = currentTicket.getDestination();
            }
        }

        System.out.println("Departure: " + departure);
        System.out.println("Destination: " + destination);

    }
}
