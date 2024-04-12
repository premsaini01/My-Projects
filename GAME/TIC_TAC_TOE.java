package GAME;
import java.util.*;

public class TIC_TAC_TOE {

    // global variable
    static int n = 13;
    static char a1 = '1',a2 = '2',a3 = '3',a4 = '4',a5 = '5',a6 = '6',a7 = '7',a8 = '8',a9 = '9';

    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c;
        int flag = 0,i;
        for(i=1;i<=9;i++){
            // clear screen
            System.out.print("\033[H\033[2J");  
            System.out.flush(); 

            // print function calling
            print();


            // checking user turn
            if(i%2==1){
                System.out.println("PLAYER 1 TURN: ");
                c = 'X';
            }else{
                System.out.println("PLAYER 2 TURN: ");
                c = 'O';
            }

            // taking input
            System.out.print("ENTER YOUR CHOICE: ");
            int x = sc.nextInt();

            // valid function calling
            if(!check_valid(x)){
                i--;
                continue;
            }

            // update function calling
            update(x, c);

            // win check function calling
            flag = win_check();

            if(flag==1){
                break;
            }

        }
        
        // match result
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        print();
        if(flag==0){
            System.out.println("MATCH DRAW");
        }else{
            if(i%2==1){
                System.out.println("PLAYER 1 WON");
            }else{
                System.out.println("PLAYER 2 WON");
            }
        }

    }

    // print function
    public static void print(){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==5 || i==9 || j==5 || j==9){
                    System.out.print("*");
                }else if(i==3 && j==3){
                    System.out.print(a1);
                }else if(i==3 && j==7){
                    System.out.print(a2);
                }else if(i==3 && j==11){
                    System.out.print(a3);
                }else if(i==7 && j==3){
                    System.out.print(a4);
                }else if(i==7 && j==7){
                    System.out.print(a5);
                }else if(i==7 && j==11){
                    System.out.print(a6);
                }else if(i==11 && j==3){
                    System.out.print(a7);
                }else if(i==11 && j==7){
                    System.out.print(a8);
                }else if(i==11 && j==11){
                    System.out.print(a9);
                }else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // update function
    public static void update(int x,char c){

        switch (x) {
            case 1:
                a1 = c;
                break;
            case 2:
                a2 = c;
                break;
            case 3:
                a3 = c;
                break;
            case 4:
                a4 = c;
                break;
            case 5:
                a5 = c;
                break;
            case 6:
                a6 = c;
                break;
            case 7:
                a7 = c;
                break;
            case 8:
                a8 = c;
                break;
            case 9:
                a9 = c;
                break;
        }
    }

    // winner check function
    public static int win_check(){

        if((a1==a2 && a1==a3) || (a4==a5 && a4==a6) || (a7==a8 && a7==a9)){
            return 1;
        }else if((a1==a4 && a1==a7) || (a2==a5 && a2==a8) || (a3==a6 && a3==a9) ){
            return 1;
        }else if((a1==a5 && a1==a9) || (a3==a5 && a3==a7)){
            return 1;
        }else{
            return 0;
        }
    }
    
    // validation check function
    public static boolean check_valid(int x){
        char z=0;

        switch (x) {
            case 1:
                z=a1;
                break;
            case 2:
                z=a2;
                break;
            case 3:
                z=a3;
                break;
            case 4:
                z=a4;
                break;
            case 5:
                z=a5;
                break;
            case 6:
                z=a6;
                break;
            case 7:
                z=a7;
                break;
            case 8:
                z=a8;
                break;
            case 9:
                z=a9;
                break;
        }

        if(x<1 || x>9){
            return false;
        }else if(z=='X' || z=='O'){
            return false;
        }else{
            return true;
        }
        
    }
}