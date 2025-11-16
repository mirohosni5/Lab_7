package Services;

import models.Course;

import java.util.List;

public class CourseManager {
    private int generateCourseId(List<Course> courses) {
        return (int) (Math.random() * 9000) + 1000;
    }

    public Course createCourse(String title, String description, int instructorId) {
        List<Course> courses = JsonDatabaseManager.readCourses();
        int newId = generateCourseId(courses);

        Course course = new Course(newId, title, description, instructorId);
        courses.add(course);

        JsonDatabaseManager.writeCourses(courses);
        return course;
    }

}
