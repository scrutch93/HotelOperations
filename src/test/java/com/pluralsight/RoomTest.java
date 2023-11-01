package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void roomShouldbeOccupiedandDirty() {
        //arrange
        Room room = new Room(2,135.00f);
        //act
        room.checkIn();
        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());

    }

    @Test
    void roomShouldbeOccupiedbutClean() {
        //arrange
        Room room = new Room(2, 150.00f);
        //act
        room.checkIn();
        //assert
        assertTrue(room.isOccupied());
        assertFalse(room.isDirty());

    }

    @Test
    void cleanRoom() {
    }
}