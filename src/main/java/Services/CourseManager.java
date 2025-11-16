package Services;

import models.Course;
import models.Lesson;

import java.util.List;

public class CourseManager {
    private int generateCourseId() {
        return (int)(Math.random() * 9000) + 1000;
    }

}
