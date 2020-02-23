package org.wcci.blog.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String category;

    @OneToMany (mappedBy = "category")
    private Collection<Post> post = new ArrayList<>();

    public Category() {}

    public Category(String category) {
        this.category = category;
    }
    public Category(String category, Collection<Post> post) {
        this.category = category;
        this.post = post;
    }
    public Collection<Post> getPost() {
        return post;
    }
    public Long getId() {
        return id;
    }
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", post=" + post +
                '}';
    }
}