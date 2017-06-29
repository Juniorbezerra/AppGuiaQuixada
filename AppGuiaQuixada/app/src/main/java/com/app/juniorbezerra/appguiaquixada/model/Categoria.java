package com.app.juniorbezerra.appguiaquixada.model;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;


public class Categoria extends RealmObject {

    @Index
    @Required
    @PrimaryKey
    private Long id;
}
