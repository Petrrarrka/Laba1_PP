import Car.Car;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input count of car: ");
        int size = in.nextInt();
        Car[] car = new Car[size];
        CarArray(car);
        for (Car value : car){
            System.out.println(value.toString());
        }
        PrintCarModelInfo(car, in);
        PrintCarYearInfo(car, in);
        PrintCarPriceInfo(car, in);
        in.close();
    }

    static void ScanCar(Car[] car, Scanner in) {
        for (int i = 0; i < car.length; i++) {
            car[i] = new Car();
            System.out.println("----------------------");
            System.out.print("Input id of car: ");
            car[i].setId(in.nextInt());
            in.nextLine();
            System.out.print("Input model of car: ");
            car[i].setModel(in.nextLine());
            System.out.print("Input price of car: ");
            car[i].setPrice(in.nextInt());
            System.out.print("Input register number of car: ");
            car[i].setReg_num(in.next());
            System.out.print("Input manufacture date of car: ");
            car[i].setYear(in.nextInt());
        }
    }

    static void CarArray(Car[] car) {
        Random random = new Random();
        String[] mas = {"C63 AMG", "ZAZ 968", "Clio", "Scenic", "Megan", "Leaf", "Model S", "Aveo", "Lancer EVO",
                        "Wrangler", "RS6 C7"};
        for (int i = 0; i < car.length; i++) {
            car[i] = new Car();
            car[i].setId(random.nextInt(9999));
            car[i].setModel(mas[random.nextInt(mas.length)]);
            car[i].setPrice(random.nextInt(50000) + 5000);
            car[i].setReg_num(String.valueOf(random.nextInt(8999)+ 1000));
            car[i].setYear(random.nextInt(30) + 1990);
        }
    }

    static void PrintCarModelInfo(Car[] car, Scanner in){
        System.out.print("Input car model about which you wanna get info: ");
        in.nextLine();
        String mod = in.nextLine();
        for (Car value : car) {
            if (value.getModel().equals(mod)) {
                System.out.println(value.toString());
            }
        }
    }
    static void PrintCarYearInfo(Car[] car, Scanner in){
        System.out.print("Input car model: ");
        String mod = in.nextLine();
        System.out.print("Input year of using car: ");
        int year = in.nextInt();
        for (Car value : car){
            if(value.getModel().equals(mod) && (2020 - value.getYear()) > year){
                System.out.println(value.toString());
            }
        }
    }
    static void PrintCarPriceInfo(Car[] car, Scanner in){
        System.out.print("Input manufacture date of car: ");
        int year = in.nextInt();
        System.out.println("Input car price: ");
        int price = in.nextInt();
        for (Car value : car){
            if (value.getYear() == year && value.getPrice() > price){
                System.out.println(value.toString());
            }
        }
    }
}



