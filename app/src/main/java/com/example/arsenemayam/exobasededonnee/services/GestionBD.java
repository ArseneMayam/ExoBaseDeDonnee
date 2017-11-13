package com.example.arsenemayam.exobasededonnee.services;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.arsenemayam.exobasededonnee.utils.ConstDB;

/**
 * Created by arsenemayam on 12/11/17.
 */

public class GestionBD extends SQLiteOpenHelper {

    private static final String queryCreateEtudiant = "CREATE TABLE"+ ConstDB.etudiant.nomTable+ " ("+
            ConstDB.etudiant.id + " INTEGER PRIMARY KEY AUTOINCREMENT , " +
            ConstDB.etudiant.nom + " TEXT , " +
            ConstDB.etudiant.prenom + " TEXT , "+
            ConstDB.etudiant.age + " INTEGER );";

    private static final String qureyDropEudiant = "DROP TABLE IF EXISTS "+ ConstDB.etudiant.nomTable +";";


    public GestionBD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(queryCreateEtudiant);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(qureyDropEudiant);
        onCreate(sqLiteDatabase);
    }
}
