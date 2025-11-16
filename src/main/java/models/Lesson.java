package models;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private int lessonId;
    private String title;
    private String content;
    private List<String> resources;

    public Lesson(int lessonId, String title, String content, List<String> resources){
        this.lessonId = lessonId;
        this.title = title;
        this.content = content;
        this.resources = resources;
    }


}
