import org.junit.jupiter.api.Test;
import com.oop.Student;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    void testUpdateGrade() {
        //Arrange 
        Student student = new Student();

        // Act
        student.updateGrade(73);

        // Assert
        assertEquals(73, student.grade);
    }
}
