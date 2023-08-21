package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingResponsePojo {
    private BookingPojo booking;
    /*
      Bu pojo class icine BookingPojo class'i koyduk. BookingPojo class'ta neler vardi:
      private String firstname;
      private String lastname;
      private Integer totalprice;
      private Boolean depositpaid;
      private BookingDatesPojo bookingdates;
      private String additionalneeds;

    Boylece response icindeki tum verileri
    iceren BookingPojo ile tum verileri buraya da almis olduk. Response'da en ustteki bookingid kismini @JsonIgnore ile
    gormezden geldik.
    */

    public BookingResponsePojo() {
    }

    public BookingResponsePojo(BookingPojo booking) {
        this.booking = booking;
    }

    public BookingPojo getBooking() {
        return booking;
    }

    public void setBooking(BookingPojo booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "BookingResponsePojo{" +
                "booking=" + booking +
                '}';
    }
}
