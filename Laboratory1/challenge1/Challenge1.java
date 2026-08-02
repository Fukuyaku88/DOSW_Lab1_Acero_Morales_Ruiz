import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Challenge1 {

        public static void main(String[] args) {
                Student s1 = new Student("Miguel Angel Acero Laverde",
                        20, "miguel.acero-l@mail.escuelaing.edu.co", 8);
                Student s2 = new Student("Daniel Santiago Morales Perdomo",
                        20, "daniel.morales-p@mail.escuelaing.edu.co", 8);
                Student s3 = new Student("Daniel Ruiz",
                        28, "edgar.ruiz@mail.escuelaing.edu.co", 5);

                WelcomeMessage wm = new WelcomeMessage(List.of(s1, s2, s3));
                System.out.println(wm.getCompleteMessage());
        }

        public class Student {
                private String name;
                private int age;
                private String email;
                private int semester;

                public Student(String name, int age, String email, int semester) {
                        this.name = name;
                        this.age = age;
                        this.email = email;
                        this.semester = semester;
                }

                public String getName() {
                        return name;
                }

                public int getAge() {
                        return age;
                }

                public String getEmail() {
                        return email; 
                }

                public int getSemester() {
                        return semester;
                }
                
                public String getFormattedDetails() {
                        return this.name + ", a " + this.semester + "th-semester student, " +this.age + " years old";
                }
        }
}