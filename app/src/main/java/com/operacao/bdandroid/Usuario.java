package com.operacao.bdandroid;




import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
 @Entity
public class Usuario implements Serializable {
     @PrimaryKey(autoGenerate = true)
    private  long id;
     @ColumnInfo(name = "nome")
    private  String nome;
     @ColumnInfo(name = "data_nascimento")
    private  int idade;
     @ColumnInfo(name = "fone")
    private  String telefone;

     public Usuario(long id, String nome, int idade, String telefone) {
         this.id = id;
         this.nome = nome;
         this.idade = idade;
         this.telefone = telefone;
     }

     public long getId() {
         return id;
     }

     public void setId(long id) {
         this.id = id;
     }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public int getIdade() {
         return idade;
     }

     public void setIdade(int idade) {
         this.idade = idade;
     }

     public String getTelefone() {
         return telefone;
     }

     public void setTelefone(String telefone) {
         this.telefone = telefone;
     }
 }
