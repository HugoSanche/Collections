package com.hugobaltazar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre=new Theatre("Armando Manzanero",10,20);
        List<Theatre.Seat> seatCopy=new ArrayList<>(theatre.seats);
        seatCopy.get(1).reserve();
        printSeats(seatCopy);
        if (theatre.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }
        else{
            System.out.println("Seat already reserved");
        }
        //Collections.reverse(seatCopy); reverce list
        //Collections.shuffle(seatCopy); //aleatory list

        System.out.println(" Printing Seatcopy");
        printSeats(seatCopy);
        System.out.println("Printing Theatre seat");
        printSeats(theatre.seats);

        Theatre.Seat minSeat= Collections.min(seatCopy);
        Theatre.Seat maxSeat=Collections.max(seatCopy);
        System.out.println("Min Seat "+minSeat.getSeatNumber());
        System.out.println("Max seat "+maxSeat.getSeatNumber());
    }
    public static void printSeats(List<Theatre.Seat> list){
        for(Theatre.Seat seat: list){
            System.out.println(seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("============================================================================================");
    }
}
