package vehichle;

class Vehicle{
    void print_V(){
        System.out.print("Vehicle class ");
    }
}

class Car extends Vehicle{
    void print_C(){
        System.out.print("Car class ");
    }

    public static void main(String[] args){   
        Car obj1 = new Car();
        obj1.print_C();
        obj1.print_V();  
    }
}
