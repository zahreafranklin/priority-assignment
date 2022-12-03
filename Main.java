/*
 * NAME: Zahrea Franklin
 * CSC 138
 * Programming HW #4: Priority Assignment
 */

import java.util.Scanner;
import java.util.regex.*;
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        String packets;

        System.out.print("Input: ");
        n= in.nextInt();        // take user input for number of packets 'n'
        packets = in.next();   //take String input for packets

        Pattern pattern = Pattern.compile("^[LH]+$");
        Matcher matchee = pattern.matcher(packets);
        boolean b = matchee.matches();
        float buffer_size = 3;
        in.close();

        System.out.print("Output :");

        if (n <= 0){
            System.out.println("Wrong input - the number of packets must be greater than 0");
            System.exit(n);
        } else {
            if (n != packets.length()){
                System.out.println("Wrong input - the number of packets is wrong");
                System.exit(n);
            } else {
                if (b == false){
                    System.out.println("Wrong input - the priority must be H or L ");
                    System.exit(n);
                }
            } if (n % buffer_size ==1){
                packets+="##";
            } else {
                if (n % buffer_size == 2){
                    packets += "#";
                }
            }
                    }
        for(int i=0; i < n; i+=3){
            for (int j =0; j < 3; j++){
                if (packets.charAt(i+j)=='H'){
                    System.out.print((i+j)+ " ");
                }
            }
        
            for(int j=0; j<3; j++){
                if(packets.charAt(i+j)=='L'){
                    System.out.print((i+j)+ " ");
                }
            }
        }
            

    } // end main
}