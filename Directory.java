package com.company;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by User on 09.03.2016.
 */
public class Directory {
    private List<File>  files;

    public void addFile( File paramfile ) {
        files.add(paramfile);
    }

    public void viewDir () {
        for ( File file : files) {
            System.out.println( file.name + "." + file.Ext);
        }
    }

    public List<File> getDir () {
        return files;
    }

    public Directory() {
        files = new ArrayList(); ;

    }

    public Directory(List<File> files) {
        this.files = files;
    }
}
