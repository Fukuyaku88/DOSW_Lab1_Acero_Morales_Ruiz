import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Challenge1 {

    public static void main(String[] args) {
 
    }
}

class WelcomeMessage {
    private final List<Student> students;

    public WelcomeMessage(List<Student> students){
        this.students = students;
    }
    public String getCompleteMessage(){
        int numS = students.size(); // number of students

        if(numS == 0) return "No students registered";

        String paragraphTwo = IntStream.range(0, numS)
                .mapToObj(i -> {
                    Student s = students.get(i);
                    String basicDes = s.getFormattedDetails();

                    if(numS == 1) return basicDes;
                    if(i == numS-1) return "and " + basicDes;
                    return basicDes + ",";
                })
                .collect(Collectors.joining("\n"));

        String paragraphThree = students.stream()
                .map(Student::getEmail)
                .collect(Collectors.joining("\n"));

        return "Hello and welcome \n" +
                "We are " + paragraphTwo + ".\n\n"
                + "Our Institutional emails are:" + "\n"
                + paragraphThree;
    }
}
