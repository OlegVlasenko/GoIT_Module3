package com.company;

/**
 * Created by User on 09.03.2016.
 */
public class Jpeg extends File {

    private String name;

    public Jpeg(String nameParam ) {
        super(nameParam, "jpg");
        this.name = nameParam;
    }

}
