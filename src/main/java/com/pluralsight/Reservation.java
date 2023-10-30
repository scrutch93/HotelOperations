package com.pluralsight;

public class Reservation {
    private String roomType;
    private float price;

    private int numberOfNights;

    private boolean weekend;

    private float reservationTotal;


    public Reservation(String roomType, float price, int numberOfNights, boolean weekend, float reservationTotal){

        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.reservationTotal= reservationTotal;


    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public float getReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal(float reservationTotal) {
        this.reservationTotal = reservationTotal;
    }
}
