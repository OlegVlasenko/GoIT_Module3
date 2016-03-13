package com.company;

/**
 * Created by User on 09.03.2016.
 */
public class Txt extends File {

    private String name;

    public Txt(String nameParam ) {
        super(nameParam, "txt");
        this.name = nameParam;
    }
}
