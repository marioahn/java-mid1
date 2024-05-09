package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        // 인데, 모든 클래스의 최종부모는 Object니까 toString()이 가능함!
        // child -> parent -> object여기까지 올라감 ㅇㅇ.
        String string = child.toString();
        System.out.println(string);
    }
}
