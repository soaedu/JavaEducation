package java_regular.data.type.collections.operation.iterate.spliterators.example1;

import java.util.ArrayList;
import java.util.List;

public class Article {
    private List<Author> listOfAuthors;
    private int id;
    private String name;

    public Article(String name) {
        this(new ArrayList<>(), 0, name);
    }

    public Article(List<Author> listOfAuthors, int id, String name) {
        this.listOfAuthors = listOfAuthors;
        this.id = id;
        this.name = name;
    }

    public List<Author> getListOfAuthors() {
        return listOfAuthors;
    }

    public void setListOfAuthors(List<Author> listOfAuthors) {
        this.listOfAuthors = listOfAuthors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Article{" +
                "listOfAuthors=" + listOfAuthors +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
