package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound(); //컴파일 오류, Object는 sound()가 없다.
        //obj.move(); //컴파일 오류, Object는 move()가 없다.
        // 복잡하게 생각할 것도 없이, 부모는 자식메서드 접근 ㄴㄴ잖아.
        // 항상 찾는게 없으면 위로 올라가지? 부모쪽으로 올라가면서 찾잖아
        // 근데 object는 최.상.위 이므로 더 이상 올라가서 찾을데가 없음 -> 컴파일 오류!

        //객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
