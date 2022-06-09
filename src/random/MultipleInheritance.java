package com.samit;

// Interface 1
interface PI1 {
    default void show() {
        System.out.println("Hi");
    }
}

// Interface 2
interface PI2 {
    default void show() {
        System.out.println("Hey");
    }
}

class MultipleInheritance implements PI1, PI2 {

    // Overriding default show method
    public void show() {
        // Using super keyword to call the show
        // method of PI1 interface
        PI1.super.show();

        // Using super keyword to call the show
        // method of PI2 interface
        PI2.super.show();
    }

    public static void main(String args[]) {
        MultipleInheritance d = new MultipleInheritance();
        d.show();
    }
}

