package lang.object;

//부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
// extends가 있으면 Object대신 그걸로 받는거고 뭐ㅇㅇ.
// Parent는 아무것도 없으니까 묵시적으로 Object상속받음!
public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
