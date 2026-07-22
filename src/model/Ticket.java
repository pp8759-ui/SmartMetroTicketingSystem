package model;

import enums.TicketStatus;
import enums.TicketType;

public class Ticket {
  private String ticketId;
  private Passenger passenger;
  private Station source;
  private Station destination;
  private TicketType ticketType;
  private TicketStatus status;
  private double fare;
  
  public Ticket(String ticketID, Passenger passenger, Station source, Station destination, TicketType ticketType, double fare) {
    this.ticketId = ticketId;
    this.passenger = passenger;
    this.source = source;
    this.destination = destination;
    this.ticketType = ticketType;
    this.fare = fare;
    this.status = TicketStatus.ACTIVE； 
  }

  public String getTicketId() {
    return ticketId;
  }

  public Passenger getPassenger() {
    return passenger;
  }

  public Station getSource(){
    return source;
  }

  public Station getDestination() {
    return destination;
  }

  public TicketType getTicketType() {
    return ticketType;
  }

  public TicketStatus getStatus() {
    return status;
  }

  public double getFare() {
    return fare;
  }

  public void setStatus(TicketStatus status) {
    this.status = status;
  }

    public void printTicket() {
      System.out.println("==============================");
      System.out.println("      SMART METRO TICKET      ");
      System.out.println("==============================");
      System.out.println("Ticket ID   : " + ticketId);
      
      if (passenger != null)
        System.out.println("Passenger   : " + passenger.getName());

      if (source != null)
        System.out.println("Source      : " + source.getName());

      if (destination != null)
        System.out.println("Destination : " + destination.getName());
      
      System.out.println("Ticket Type : " + ticketType);
      System.out.println("Fare        : RM " + fare);
      System.out.println("Status      : " + status);
      System.out.println("==============================");
    }
  
  public void cancelTicket() {
    if (status == TicketStatus.CANCELLED) {
      System.out.println("Ticket already cancelled.");
      return;
    }

    status = TicketStatus.CANCELLED;

    System.out.println("Ticket cancelled successfully.");
  }

}
