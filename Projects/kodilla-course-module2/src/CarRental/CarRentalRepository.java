package CarRental;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository{


    @Override
    public boolean createRental(User user, LocalDateTime from, LocalDateTime to) {
        return false;
    }
}
