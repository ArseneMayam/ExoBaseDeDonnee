package com.example.arsenemayam.exobasededonnee.services;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.arsenemayam.exobasededonnee.utils.ConstDB;

/**
 * Created by arsenemayam on 12/11/17.
 */

public class connectionBD {
    private static SQLiteDatabase bd;
    private static int version =1;

    public static SQLiteDatabase getBd(Context ctx){
        GestionBD gbd = new GestionBD(ctx, ConstDB.nomBd,null,version);
        bd = gbd.getWritableDatabase();
        return bd;
    }

    public static void close(){bd.close();}
}
