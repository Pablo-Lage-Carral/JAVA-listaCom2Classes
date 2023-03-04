package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

public class TesteClienteArrayList {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		List<Endereco> listaEnderecos = new ArrayList<Endereco>();
		
		Cliente objCliente = null;
		Endereco objEndereco = null;
		
		
		do {
			
			objCliente = new Cliente();
			objCliente.setNome(texto("Nome do Cliente"));
			objCliente.setIdade(inteiro("Idade do Cliente"));
			objCliente.setPeso(decimal("Peso do Cliente"));
			objEndereco = new Endereco();
			objEndereco.setLogradouro(texto("Logradouro do Cliente"));
			objEndereco.setNumero(inteiro("Número da rua do Cliente"));
			objEndereco.setBairro(texto("Bairro do Cliente"));
			objEndereco.setEstado(texto("Estado do Cliente"));
			
			objCliente.setEndereco(objEndereco);
			
			listaClientes.add(objCliente);
			listaEnderecos.add(objEndereco);
			
		}while(JOptionPane.showConfirmDialog(null, "Cadastrar mais clientes?", "Cadastro de Clientes",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		//Saídas
		//Foreach
		for(Cliente cliente : listaClientes) {
			System.out.println("\n");
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Idade: " + cliente.getIdade());
			System.out.println("Peso: Kg" + cliente.getPeso());
			System.out.println("Logradouro: " + cliente.getEndereco().getLogradouro());
			System.out.println("Número: " + cliente.getEndereco().getNumero());
			System.out.println("Bairro: " + cliente.getEndereco().getBairro());
			System.out.println("Estado: " + cliente.getEndereco().getEstado());
		}
	}

}
