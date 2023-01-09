public class Flight {
    private String flightNum;
    private String origin;
    private String destination;
    private String date;
    private String[][] seat;
    public static final int  SEAT_PER_ROW = 6;
    public static final int  TOTAL_ROWS = 40;

    public Flight(String flightNum, String origin, String destination, String date){
        this.flightNum = flightNum;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
    }
    public String getFlightNum(){ return flightNum;}
    public String getOrigin(){return origin;}
    public String getDestination(){return destination;}
    public String getDate(){return date;}
    public int getPassengerCount(){return 1;} // to be fixed
    public String getFlightManifest(){return "to be added";}
    public Seat[] getSeatReference(String custConfirmation){return new Seat[1];} // To be fixed
}
