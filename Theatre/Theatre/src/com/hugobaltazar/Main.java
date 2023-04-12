package com.hugobaltazar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre=new Theatre("Armando Manzanero",8,12);

        if (theatre.reserveSeat("D02")){
            System.out.println("Please pay for D02");
        }
        else{
            System.out.println("Seat already reserved");
        }
        if (theatre.reserveSeat("D02")){
            System.out.println("Please pay for D02");
        }
        else{
            System.out.println("Seat already reserved");
        }
        if (theatre.reserveSeat("B21")){
            System.out.println("Please pay for B21");
        }
        else{
            System.out.println("Seat already reserved");
        }
        List<Theatre.Seat> reverseSeats=new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printSeats(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00",13.00));
        priceSeats.add(theatre.new Seat("A00",13.00));
        Collections.sort(priceSeats,Theatre.PRICE_ORDER);
        printSeats(priceSeats);
        //Collections.reverse(seatCopy); reverce list
       // Collections.shuffle(seatCopy); //aleatory list



      /*  Theatre.Seat minSeat= Collections.min(seatCopy);
        Theatre.Seat maxSeat=Collections.max(seatCopy);
        System.out.println("Min Seat "+minSeat.getSeatNumber());
        System.out.println("Max seat "+maxSeat.getSeatNumber());
       */

    }
    public static void printSeats(List<Theatre.Seat> list){
        for(Theatre.Seat seat: list){
            System.out.println(" "+seat.getSeatNumber()+" $"+seat.getPrice());
        }
        System.out.println();
        System.out.println("============================================================================================");
    }
    public static void sortList(List<? extends Theatre.Seat> list){
        for (int i=0; i<list.size()-1;i++){
            for (int j=i+1; j<list.size();j++){
                if (list.get(i).compareTo(list.get(j))>0)
                    Collections.swap(list,i,j);
            }
        }
    }
}
