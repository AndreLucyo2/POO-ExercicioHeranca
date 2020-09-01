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
public class PessoaJuridica extends Pessoa
{

    private String cnpj;
    private String razao;

    public PessoaJuridica()
    {
    }

    public PessoaJuridica(Integer id,String nome,String razao,String cnpj,Endereco endereco)
    {
	super(id, nome, endereco);
	this.cnpj = cnpj;
	this.razao = razao;
    }

    public String getCnpj()
    {
	return cnpj;
    }

    public void setCnpj(String cnpj)
    {
	this.cnpj = cnpj;
    }

    public String getRazao()
    {
	return razao;
    }

    public void setRazao(String razao)
    {
	this.razao = razao;
    }

    @Override
    public String imprimeDados()
    {
	return "PessoaJuridica:"
		+ "\nnome= " + super.getNome()
		+ "\ncnpj= " + cnpj
		+ "\nrazao= " + razao
		+ "\n"+super.getEndereco().toString();

    }

}
