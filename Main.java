package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hi, I'm your first Java program! Stay tuned!");

        Mp3 File1 = new Mp3( "Name1" );
        Txt File2 = new Txt( "Name2" );
        Jpeg File3 = new Jpeg( "Name3" );
        Jpeg File4 = new Jpeg( "Name4" );
        Jpeg File5 = new Jpeg( "Name5" );

        Directory Root1;
        Root1 = new Directory();
        Root1.addFile( File1);
        Root1.addFile( File2);
        Root1.addFile( File3);
        Root1.addFile( File4);
        Root1.addFile( File5);

        System.out.println("----- viewDir() -----");

        Root1.viewDir();

        System.out.println("----- getDir() -----");

        List<File> checkList = Root1.getDir();

        System.out.println( checkList );

        System.out.println("----- for() -----");

        for(int j = checkList.size() - 1; j >= 0 ; j--)
            {
            System.out.println(checkList.get(j).name + "." + checkList.get(j).Ext);
        }

        System.out.println("----- for(:) -----");

        for ( File  oneFile : checkList) {
            System.out.println(oneFile.name + "." + oneFile.Ext );
        }

        System.out.println("----- Root2 -----");

        Directory Root2 = new Directory(checkList);

        Root2.viewDir();
    }
}
