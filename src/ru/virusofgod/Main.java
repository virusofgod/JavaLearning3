package ru.virusofgod;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();


            //blocks
            /*{
            int inf = 10;
            int price=4;
            if(inf>0){
                price+= inf * price/100;
                System.out.println(price);
            }
            System.out.println(price);
           }*/
        /*{
            Scanner in = new Scanner(System.in);
            int x1 , x2;
            x1 = in.nextInt();
            x2 = x1 %10;
            x1 = x1/10;
            if(x2==3 || x1==3){
                System.out.println("В числе есть цифра 3");
            }
            else {
                System.out.println("В числе нет цифры 3");
            }

        }*/

        //while прекращается как только условие станет ложным
        /*
        while(<усдовие>){
         * Действие к выполнению
        }
        */
      /*  {
            int x =0;
            while(x<5){ // не сработает ни разу если условие ложно
                System.out.print(x + " ");
                x++;
        }

        }*/
        // do while
        /* {
            int x = 0;
          do{
              System.out.print(x + " ");
              x++;
        }while(x<5); // прекращает работать когда условие ложно
                     // Сработает цикл хотябы 1 раз даже если условие ложно
            System.out.println(x);
        }*/

        //BUS
        /*{
            //bus high 437
            //1 754 || noCrash
            //2 300 800 || crash 1
            // no crash
            Scanner in = new Scanner(System.in);
            int t = 0;
            int i = 1;
            int N = in.nextInt();
            while (i < N) {
                t = in.nextInt();
                if(t< 437){
                    System.out.println("CRASH " + i);
                    break;
                }
                i++;
            }
            if(t<437){
                System.out.println("NO CRASH");
            }
            else{
                System.out.println("CRASH " + i);
            }
        }*/

    }
}