package com.company;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by User on 09.03.2016.
 */
public class Directory {
    private List<File>  files;

    public void addFile( File paramfile ) {
        this.files.add(paramfile);
    }

    public void viewDir () {
        for ( File file : this.files) {
            System.out.println( file.name + "." + file.Ext);
        }
    }

    public List<File> getDir () {
        return this.files;
    }

    public Directory() {
        this.files = new ArrayList(); ;

    }

    public Directory(List<File> files) {
        this.files = files;
    }
}
