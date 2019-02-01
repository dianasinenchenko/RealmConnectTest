package com.devitis.realmconnecttest.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Diana on 01.02.2019.
 */

public class Person extends RealmObject {

    private int age;

    @Index
    private String name;

    @PrimaryKey
    private long id;

    // one-to-one relation
    private Dog dog;

    // One-to-many relations
    private RealmList<Cat> cats;

    private RealmList<String> phoneNumbers;

    @Ignore
    private int tempReference;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public RealmList<Cat> getCats() {
        return cats;
    }

    public void setCats(RealmList<Cat> cats) {
        this.cats = cats;
    }

    public RealmList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(RealmList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public int getTempReference() {
        return tempReference;
    }

    public void setTempReference(int tempReference) {
        this.tempReference = tempReference;
    }
}
