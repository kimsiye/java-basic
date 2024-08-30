package day6.constructorExam;

public class Car {
    String model;
    String color;
    int speed;

        public Car(){
        System.out.println("자동차가 만들어집니다.");
    }
//
//    public Car(String model, String color, int speed) {
//        System.out.println("자동차가 생성됩니다.");
//        this.model = model;
//        this.color = color;
//        this.speed = speed;
//    }

    public void drive() {
        System.out.println(color + " " + model + "이/가 " + speed + "km로 달립니다.");
    }


}
