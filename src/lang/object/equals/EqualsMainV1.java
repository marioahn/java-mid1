package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2)); // 동일성
        System.out.println("equality = " + (user1.equals(user2))); // 동등성 -> false
        // 어? 왜 동등성도 false임? -> equals들어가보셈 -> 똑같이 ==으로 비교함ㅎㅎ;;
        // public boolean equals(Object obj) {
        //        return (this == obj);
        //    }
        // "동등성"개념으로는 true라서 다시 오버라이드해서 해야함
        // -> MainV2, UserV2로 ㄱㄱㄱ
    }
}
