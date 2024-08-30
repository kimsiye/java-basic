package day6.Hamburger;

import java.util.Scanner;

public class KioskRun {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Kiosk kiosk = new Kiosk();
        while(true){
            kiosk.introduce();
            int kioskChoice = Integer.parseInt(sc.nextLine());

            if(kioskChoice == 1){
                kiosk.hamburger();
            }
            else if(kioskChoice == 2){
                kiosk.sides();
            }
            else if(kioskChoice == 1){

            }
            else if(kioskChoice == 1){

            }
            else if(kioskChoice == 1){

            }else {

            }
        }




    }
}
