package Services;

import models.Course;
import models.Lesson;

import java.util.*;

public class LessonManager {
    private int generateLessonId(List<Lesson> Lesson) {
        return (int) (Math.random() * 9000) + 1000;
    }
}
