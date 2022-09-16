package version_3_BuilderDesign;

public class Client {
    public static void main(String[] args) {

        //Method chaining..
        UserExam userExam = UserExam.getBuilder()
                                    .setEnglish(100)
                                    .setMaths(30)
                                    .validateAndBuild();

        System.out.println(userExam.getEnglish());
        System.out.println(userExam.getMaths());
    }
}
