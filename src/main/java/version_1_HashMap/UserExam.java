package version_1_HashMap;

import java.util.HashMap;

public class UserExam {
    private int english;
    private int maths;

    public UserExam(HashMap<String, Object> map){
        english=(Integer)map.get("English");
        maths=(Integer)map.get("Maths");
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }
}
