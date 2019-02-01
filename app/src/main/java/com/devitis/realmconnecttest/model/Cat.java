package com.devitis.realmconnecttest.model;

import java.security.Permission;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;

/**
 * Created by Diana on 01.02.2019.
 */

public class Cat extends RealmObject {
    public String name;

    @LinkingObjects ("cats")
    public final RealmResults<Permission> owners = null;
}
