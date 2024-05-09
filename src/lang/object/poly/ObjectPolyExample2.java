package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); //Object 인스턴스도 만들 수 있다.

        // Object배열은 모.든.타입을 담.을.수 있겠지 ㅇㅇ. 최상위 타입이니까
        // 근데 이게 좋은건 아니겠지. 애초에 타입준 이유가 있는데, 이렇게 우회해서 처음으로 돌아올 이유는 없음!
        // 그럼에도, 최상위 객체인 Object의 필요성은 명확하지 ㅇㅇ. 이거랑 아래는 살짝 포인트가 다름!
        Object[] objects = {dog, car, object};

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }

}
