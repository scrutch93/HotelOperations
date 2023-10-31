package com.pluralsight;

public class Reservation {
    private String roomType;

    private int numberOfNights;

    private boolean weekend;



    public Reservation(String roomType, int numberOfNights, boolean weekend){

        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;



    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
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
        float reservationTotal;

        if(this.roomType.equals("king") ){

         reservationTotal =  this.numberOfNights * 139.00f;

        }else{

            reservationTotal = this.numberOfNights * 124.00f;
        }

        if(this.isWeekend()){
            reservationTotal *= 1.10;
        }


        return reservationTotal;
    }


}
