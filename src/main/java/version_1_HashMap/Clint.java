package version_1_HashMap;

import java.util.HashMap;

public class Clint {

    public static void main(String[] args) {
        HashMap<String, Object> map=new HashMap<>();
        map.put("English", 20);
        map.put("Maths", 10);
        UserExam userExam=new UserExam(map);
        System.out.println( userExam.getEnglish() );
        System.out.println(userExam.getMaths());
    }
}

