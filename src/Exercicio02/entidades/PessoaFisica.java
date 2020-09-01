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
public class PessoaFisica extends Pessoa
{

    private String cpf;
    private String sexo;

    public PessoaFisica()
    {
    }

    public PessoaFisica(Integer id, String nome, String cpf, String sexo, Endereco endereco)
    {
	super(id, nome, endereco);
	this.cpf = cpf;
	this.sexo = sexo;
    }

    public String getCpf()
    {
	return cpf;
    }

    public void setCpf(String cpf)
    {
	this.cpf = cpf;
    }

    public String getSexo()
    {
	return sexo;
    }

    public void setSexo(String sexo)
    {
	this.sexo = sexo;
    }

    @Override
    public String imprimeDados()
    {
	return "PessoaFisica:"
		+ "\nnome= " + super.getNome()
		+ "\ncpf= " + cpf
		+ "\nsexo= " + sexo
		+ "\n"+super.getEndereco().toString();

    }

}
