package com.operacao.bdandroid;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

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
