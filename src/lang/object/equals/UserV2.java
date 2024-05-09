package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

/* // 동.등.성은id가 같은지만 본다 ㅇㅇ. 주소값이 아니라! -> 동.등성비교로 재정의됨
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj;
        return id.equals(user.id);
    }
*/

    // 근데 위는 진짜 겁나 간단한 버젼이고, 진짜 동등성은 아래가 맞음
    // 아래 외워서 짜긴 좀..ㅎ; alt+insert해서 -> equals 제너레이트 ㄱㄱ -> next 계속 ㄱㄱ하면
    // 아래가 바로 만들어짐~. 다만, equals()메서드를 구현할 때 지켜야 하는 규칙은 인지하자
    // 반사성, 대칭성, 추이성, 일관성, 널에 대한 비교
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o; // 매개변수 o를 다운캐스팅ㅇㅇ.
        return Objects.equals(id, userV2.id);
    }

}
