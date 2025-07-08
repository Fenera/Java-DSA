package Cookies;

public class Main {
    public static void main(String[] args){

        Cookies cookie1 = new Cookies("Brown");
        Cookies cookie2 = new Cookies("Green");

        cookie1.setColor("Red");

        System.out.println("Cookie 1 is: " + cookie1.getColor());
        System.out.println("Cookie 2 is: " + cookie2.getColor());

    }
    
}
