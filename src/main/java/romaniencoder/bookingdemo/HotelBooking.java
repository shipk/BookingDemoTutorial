package romaniencoder.bookingdemo;

import com.sun.javafx.beans.IDProperty;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String hotelName;
    private double pricePerNight;
    private int nbOfNights;

    public HotelBooking() {};

    public HotelBooking(String hotelName, double pricePerNight, int nbOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNights = nbOfNights;
    }

    public int getNbOfNights() {
        return nbOfNights;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public String getHotelName() {
        return hotelName;
    }

    public double getTotalPrice() {
        return pricePerNight * nbOfNights;
    }

    public long getId() {
        return id;
    }
}
