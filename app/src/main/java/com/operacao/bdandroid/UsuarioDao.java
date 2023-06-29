package com.operacao.bdandroid;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Essa classe vai fazer as buscar no banco de dados
 */
@Dao
public interface UsuarioDao {
  //Método para selecionar todos os usuários
    @Query("SELECT * FROM USUARIO")
     List<Usuario> all();

    //Método para lista pelo nome do usuário
    @Query("SELECT * FROM Usuario WHERE nome like :txtNome")
     Usuario findBy (String txtNome);

    // Método para insert os dados
    @Insert
    void inserir(Usuario usuario);
     //Método para insert todos dados
    @Insert
    void InsertAll(List<Usuario> usuarios);
   //Método para alterar os dados
    @Update
    void update (Usuario usuario);
   // Método para deletar dados
    @Delete
    void delete (Usuario usuario);

}
