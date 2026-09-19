package College.App;

import College.Model.Student;
import College.Model.InvalidStudentDataException;

public class Week7 {

    public static void main(String[] args) {

        String[] marks = {
            "85",
            "abc",
            "150"
        };

        for (String value : marks) {

            System.out.println("Trying mark: " + value);

            try {

                int mark = Integer.parseInt(value);

                Student student = new Student("Asha Nair");

                student.setMark(mark);

                System.out.println("Valid: " + student);

            } catch (NumberFormatException e) {

                System.out.println(
                    "Error: Mark must be a number."
                );

            } catch (InvalidStudentDataException e) {

                System.out.println(
                    "Error: " + e.getMessage()
                );

            } finally {

                System.out.println(
                    "Validation attempt complete"
                );
            }

            System.out.println();
        }
    }
}
