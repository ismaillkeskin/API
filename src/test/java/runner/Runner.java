package runner;

import herokuapp_smoketest.C01_CreateBooking;
import herokuapp_smoketest.C02_GetBookingById;
import herokuapp_smoketest.C03_UpdateBooking;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                C01_CreateBooking.class,
                C02_GetBookingById.class,
                C03_UpdateBooking.class
        }
)

public class Runner {
}
