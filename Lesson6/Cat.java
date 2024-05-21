package Lesson6;

import java.util.Objects;

public class Cat {
    private int id;
    private String nickName;
    private int age;
    private String breed;
    private String color;

    public Cat(int id, String nickName, int age, String breed, String color) {
        this.id = id;
        this.nickName = nickName;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Кличка: %s, Возраст: %d, Порода: %s, Окрас: %s", id, nickName, age, breed, color);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cat cat = (Cat) obj;
        return id == cat.id &&
                nickName.equals(cat.nickName) &&
                age == cat.age &&
                breed.equals(cat.breed) &&
                color.equals(cat.color);

    }

    @Override
    public int hashCode() {
        
        return Objects.hash(id,nickName, age, breed, color);
    }

}
