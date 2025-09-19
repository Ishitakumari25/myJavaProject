// public class programmingconstructs{
//     public static void main(String[] args){
//         System.out.println("start program");
//         int a= 10;
//         int b= 20;
//         int sum =a+b;
//         System.out.println("sum:" +sum);
//         if (sum >30){
//             System.out.println("sum is greater then 10");
//                 }
//         else if (sum==30){
//             System.out.println("sum is exact");

//         }
//         else if (sum<30){
//             System.out.println("sum is lesser than 30");
//         }


//     }

    
// }
class Car {
    String model;
    int year;
}

public class Main {
    public static void main(String[] args) {
        // First car object
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.year = 2020;

        // Second car object
        Car car2 = new Car();
        car2.model = "rolls royce";
        car2.year = 2022;

        // Display details
        System.out.println("Car 1: " + car1.model + " " + car1.year);
        System.out.println("Car 2: " + car2.model + " " + car2.year);
    }
}



 
