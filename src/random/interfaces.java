package com.samit;

interface In1 {
    final int a = 10;
    void display();
}

class interfaces implements In1 {
    public void display() {
        System.out.println("Samit");
    }

    // Driver Code
    public static void main(String[] args) {
        interfaces t = new interfaces();
        t.display();
        System.out.println(a);
    }
}
