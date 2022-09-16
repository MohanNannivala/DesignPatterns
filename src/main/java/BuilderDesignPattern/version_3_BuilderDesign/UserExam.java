package BuilderDesignPattern.version_3_BuilderDesign;

import java.security.InvalidParameterException;

public class UserExam {

    private int english;
    private int maths;

    private UserExam(){}

    public int getEnglish() {
        return english;
    }

    public int getMaths() {
        return maths;
    }

    public static UserExamBuilder getBuilder(){
        return new UserExamBuilder();
    }

    public static class UserExamBuilder{

        private int english;
        private int maths;

        public UserExamBuilder setEnglish(int englishMarks){
            this.english=englishMarks;
            return this;
        }

        public  UserExamBuilder setMaths(int mathsMaths){
            this.maths=mathsMaths;
            return this;
        }

        public UserExam validateAndBuild(){

            //validation1
            if(this.english>100 || this.maths >100){
                throw  new InvalidParameterException("Marks can't be grater then 100");
            }

            //validation2
            if(this.english + this.maths > 180){
                throw  new InvalidParameterException("Total marks can't be grater then 180");
            }

            UserExam userExam=new UserExam();
            userExam.english=this.english;
            userExam.maths=this.maths;

            return userExam;
        }
    }
}
