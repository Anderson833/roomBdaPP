package com.operacao.bdandroid;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Usuario.class}, version = 1,exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {
    public  abstract UsuarioDao usuarioDao();
}
