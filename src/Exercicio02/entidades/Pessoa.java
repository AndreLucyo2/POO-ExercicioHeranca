/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02.entidades;

/**
 *
 * @author Andre
 */
abstract class Pessoa
{
   private Integer id;
   private String nome;    
   private Endereco endereco;

    public Pessoa()
    {
    }

    public Pessoa(Integer id, String nome, Endereco endereco)
    {
	this.id = id;
	this.nome = nome;
	this.endereco = endereco;
    }

    public Integer getId()
    {
	return id;
    }

    public void setId(Integer id)
    {
	this.id = id;
    }

    public String getNome()
    {
	return nome;
    }

    public void setNome(String nome)
    {
	this.nome = nome;
    }

    public Endereco getEndereco()
    {
	return endereco;
    }

    public void setEndereco(Endereco endereco)
    {
	this.endereco = endereco;
    }
    
    public String imprimeDados()
    {	
	return "Pessoa:" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco;
	
    }
   
   
   
}
