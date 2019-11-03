package CarRental;

import java.time.LocalDateTime;

public class RentRequestRetriever {

    public RentRequest retrieve() {


        User user = new User("Jan", "Dabrowski");

        LocalDateTime rentFrom = LocalDateTime.of(2017, 01, 01, 10, 12);
        LocalDateTime rentTo = LocalDateTime.of(2018, 10, 10, 12, 12);

        return new RentRequest(user,rentFrom,rentTo);
    }
}