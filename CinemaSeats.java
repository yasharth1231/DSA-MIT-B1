public class CinemaSeats {
    public static void main(String[] args) {
        int[] seats = {1, 0, 0, 0, 1, 0, 0}; 
        int maxEmpty = 0;
        int currentEmpty = 0;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                currentEmpty++;
                if (currentEmpty > maxEmpty) {
                    maxEmpty = currentEmpty;
                }
            } else {
                currentEmpty = 0;
            }
        }
        System.out.println(maxEmpty);
    }
}
