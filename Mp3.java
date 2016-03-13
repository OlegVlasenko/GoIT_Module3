package com.company;

/**
 * Created by User on 09.03.2016.
 */
public class Mp3 extends File {

    private String name;

    public Mp3(String nameParam ) {
        super(nameParam, "mp3");
        this.name = nameParam;
    }

}
