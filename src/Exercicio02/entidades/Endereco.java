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
public class Endereco
{
    private Integer id;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String cep;

    public Endereco()
    {
    }

    public Endereco(Integer id, String estado, String cidade, String bairro, String rua, String cep)
    {
	this.id = id;
	this.estado = estado;
	this.cidade = cidade;
	this.bairro = bairro;
	this.rua = rua;
	this.cep = cep;
    }

    public Integer getId()
    {
	return id;
    }

    public void setId(Integer id)
    {
	this.id = id;
    }

    public String getEstado()
    {
	return estado;
    }

    public void setEstado(String estado)
    {
	this.estado = estado;
    }

    public String getCidade()
    {
	return cidade;
    }

    public void setCidade(String cidade)
    {
	this.cidade = cidade;
    }

    public String getBairro()
    {
	return bairro;
    }

    public void setBairro(String bairro)
    {
	this.bairro = bairro;
    }

    public String getRua()
    {
	return rua;
    }

    public void setRua(String rua)
    {
	this.rua = rua;
    }

    public String getCep()
    {
	return cep;
    }

    public void setCep(String cep)
    {
	this.cep = cep;
    }

    @Override
    public String toString()
    {
	return "ENDEREÇO:" 
		+ "\nestado= " + estado 
		+ "\ncidade= " + cidade 
		+ "\nbairro= " + bairro 
		+ "\nrua= " + rua 
		+ "\ncep= " + cep;
    }
    
    
    
	    
}
