package models;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseId;
    private String title;
    private String description;
    private int instructorId;
    private List<Integer> students;
    private List<Lesson> lessons;

    public Course(int courseId, String title, String description, int instructorId){
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.instructorId = instructorId;
        this.students = new ArrayList<>();
        this.lessons = new ArrayList<>();
    }


}
