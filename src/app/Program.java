/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Exercicio02.entidades.Endereco;
import Exercicio02.entidades.PessoaFisica;
import Exercicio02.entidades.PessoaJuridica;

/**
 *
 * @author Andre
 */
public class Program
{
    public static void main(String[] args)
    {
	
	Endereco endereco1 = new Endereco(1, "Parana", "Toledo", "Centro", "Avenida", "85190-123");	
	PessoaFisica pf = new PessoaFisica(1, "andre","123.456.115-82","M", endereco1);
	
	
	Endereco endereco2 = new Endereco(1, "São Paulo", "São Paulo", "Centro", "Avenida", "99999-888");	
	PessoaJuridica pj = new PessoaJuridica(1, "ProSeguir", "Segurança Armada LTDA","38.104.514/0001-60", endereco2);
	
	
	System.out.println(pf.imprimeDados());
	
	System.out.println("\n------------------------------");
	
	System.out.println(pj.imprimeDados());
	
	
	
    }
}
