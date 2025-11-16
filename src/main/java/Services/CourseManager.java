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

    public void updateCourse(int courseId, String newTitle, String newDescription) {
        List<Course> courses = JsonDatabaseManager.readCourses();

        for (Course c : courses) {
            if (c.getCourseId() == courseId) {
                c.setTitle(newTitle);
                c.setDescription(newDescription);
                break;
            }
        }
        JsonDatabaseManager.writeCourses(courses);
    }

    public void deleteCourse(int courseId) {
        List<Course> courses = JsonDatabaseManager.readCourses();

        courses.removeIf(c -> c.getCourseId() == courseId);

        JsonDatabaseManager.writeCourses(courses);
    }



}
