package com.example.myapplication;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Person {
    @Id(autoincrement = true)
    private long id;
    private String food;
    private String imagePath;
    @Generated(hash = 48976051)
    public Person(long id, String food, String imagePath) {
        this.id = id;
        this.food = food;
        this.imagePath = imagePath;
    }
    @Generated(hash = 1024547259)
    public Person() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFood() {
        return this.food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public String getImagePath() {
        return this.imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
