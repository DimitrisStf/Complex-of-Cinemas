public class Cinemas { 
    public int[][] tickets;
    public int cinemas_count;
    public int cinemas_type_count;

    public Cinemas(int[][] tickets) {
         
        for (int i = 0; i < tickets.length; i++) {
            for (int j = 0; j < tickets[i].length; j++) {
                if (tickets[i][j] < 0) {
                    System.out.println("VALID ELEMENTS");
                    System.exit(0);
                }
            }
        }
        
        this.tickets = tickets;
        
        this.cinemas_count = tickets.length;
        this.cinemas_type_count = tickets[0].length;
    }

    public void calculateCinemasTickets() {
        System.out.println("Annual Tickets per Cinema");
        for (int i = 0; i < cinemas_count; i++) {
            int totalTickets = 0;
            for (int j = 0; j < cinemas_type_count; j++) {
                totalTickets += tickets[i][j];
            }

            System.out.println("Cinema No: " + (i + 1));
            System.out.println("Total annual tickets are: " + totalTickets); 
        }
    }
    public void calculateCinemasTypeTickets() {
        System.out.println("Annual Tickets per Cinema Type");
        for (int j = 0; j < cinemas_type_count; j++) {
            int totalTickets = 0;
            for (int i = 0; i < cinemas_count; i++) {
                totalTickets += tickets[i][j];
            }
            System.out.println("Cinema Type No: " + (j + 1));
            System.out.println("Total annual tickets are: " + totalTickets);
        }
    }
    public void calculateAllCinemasTickets() {
        int totalTickets = 0;
        for (int i = 0; i < cinemas_count; i++) {
            for (int j = 0; j < cinemas_type_count; j++) { 
                totalTickets += tickets[i][j];
            }
        }
        double averageTicketsPerType;
        averageTicketsPerType = (totalTickets/cinemas_type_count);
        

        System.out.println("Annual Total Tickets"); 
        System.out.println("The total annual tickets in all Cinemas are: " + totalTickets);
        System.out.println("Average annual tickets per Cinema Type are: " + averageTicketsPerType);
    }
}
