package com.operacao.bdandroid;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Usuario.class}, version = 1,exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {
    public  abstract UsuarioDao usuarioDao();
}
