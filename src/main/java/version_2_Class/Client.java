package version_2_Class;

public class Client {
    public static void main(String[] args) {
        Parameters parameters = new Parameters();
        parameters.english = 100;
        parameters.maths = 20;

        UserExam userExam = new UserExam(parameters);

        System.out.println(userExam.getEnglish());
        System.out.println(userExam.getMaths());
    }
}

/*
    We need builder design pattern when the objects are immutable (NO setters), we can do validation only in constructor

    when to use builder design?
    1) when there is a lot of attributes in the class.
    2) when we have to validate parameter before creating the object.
    3) when we are creating immutable objects.

*/