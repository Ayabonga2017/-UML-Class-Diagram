package java;

public abstract class Prac2 {

        public String vName (String name) {
            System.out.println("Welcome"+ name);
            return  name;}

        public int accept (int acpt) {
            if(acpt == 1){
                System.out.println("accepted");
                return 1;
            }else{
                System.out.println("only 1 visitor is allowed");
                return 0;}}}


