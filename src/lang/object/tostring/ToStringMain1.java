package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string);
        //object 직접 출력
        System.out.println(object);
        
        // 위 2개는 같은 결과가 나온다
        // 왜? -> prtinln메서드는 사실 리턴값으로 매개변수.toString()임ㅇㅇ.
        // 그래서 toString()인 string변수의 출력결과와 같은 값이 나오는 것
    }

}
