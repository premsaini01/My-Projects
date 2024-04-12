package CALCULATER;

import java.util.Scanner;

public class any_base_to_many_ways {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();

        for(int i=1;;i++){

            int flag = 0;

            System.out.println("select the options below: ");
            System.out.println("press '0' for enter num again");
            System.out.println("press '1' for binary conv.");
            System.out.println("press '2' for octal conv.");
            System.out.println("press '3' for decimal conv.");
            System.out.println("press '4' exit");
            System.out.println();

            int operation = sc.nextInt();
            int p =1;
            int ans = 0;

            switch (operation) {
                case 1:
                    while(n>0){
                        ans = (n%2)*p + ans;
                        n= n/2;
                        p*=10; 
                    }
                    System.out.println("ans is " +ans);
                    System.out.println();
                    break;

                case 2:
                    while(n>0){
                        ans = (n%8)*p + ans;
                        p*=10;
                        n/=8;
                    }
                    System.out.println(ans);
                    System.out.println();
                    break;

                case 3:
                    while(n>0){
                        ans = (n%10)*p + ans;
                        n= n/10;
                        p*=10; 
                    }
                    System.out.println("ans is " +ans);
                    System.out.println();
                    break;

                case 4:
                    flag =1;
                    break;
            
                default:
                    
                    System.out.print("enter a num: ");
                    n = sc.nextInt();
                    break;
            }

            if(flag == 1){
                break;
            }
            
        }
    }
}
