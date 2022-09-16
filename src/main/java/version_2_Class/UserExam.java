package version_2_Class;

import java.security.InvalidParameterException;

public class UserExam {

    private int english;
    private  int maths;

    UserExam(Parameters parameters){

        //validation1
        if(parameters.english>100 || parameters.maths >100){
            throw  new InvalidParameterException("Marks can't be grater then 100");
        }

        //validation2
        if(parameters.english + parameters.maths > 180){
            throw  new InvalidParameterException("Total marks can't be grater then 180");
        }

        this.english=parameters.english;
        this.maths= parameters.maths;
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
