package com.devitis.realmconnecttest.model;

import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.RealmClass;

/**
 * Created by Diana on 01.02.2019.
 */
@RealmClass
public class Dog implements RealmModel {

    public String name;

    @LinkingObjects("dog")
    public final RealmResults<Person> owners = null;
}
