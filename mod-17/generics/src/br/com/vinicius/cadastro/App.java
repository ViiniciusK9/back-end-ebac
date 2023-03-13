package br.com.vinicius.cadastro;

import br.com.vinicius.cadastro.dao.ClienteMapDAO;
import br.com.vinicius.cadastro.dao.IClienteDAO;
import br.com.vinicius.cadastro.domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (true) {
            if (!isOpcaoValida(opcao)){
                opcao = JOptionPane.showInputDialog(null,
                        "Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

            if (isOpcaoSair(opcao)){
                Sair();
            }else if (isOpcaoCadastro(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separado por virgula, conforme o exemplo: Nome,CPF,Telefone,Endereço,Número,Cidade,Estado",
                        "Informações do cliente", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isOpcaoConsulta(opcao)) {
                String cpf = JOptionPane.showInputDialog(null,
                        "Digite o CPF a ser consultado: ",
                        "Consulta", JOptionPane.INFORMATION_MESSAGE);
                consultar(cpf);
            } else if (isOpcaoExcluir(opcao)) {
                String cpf = JOptionPane.showInputDialog(null,
                        "Digite o CPF a ser excluido: ",
                        "Excluir", JOptionPane.INFORMATION_MESSAGE);
                excluir(cpf);
            } else if (isOpcaoAlterar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente para ser alterado,exemplo: Nome,CPF,Telefone,Endereço,Número,Cidade,Estado",
                        "Consulta", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            }


            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    private static void alterar(String dados) {
        String[] dadosSeparados = dados.split(",");
        iClienteDAO.alterar(new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]));

    }

    private static void excluir(String cpf) {
        iClienteDAO.excluir(Long.valueOf(cpf));
        JOptionPane.showMessageDialog(null,
                "CPF excluido!",
                "Cliente excluido", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void consultar(String cpf) {
        Cliente clienteConsultado = iClienteDAO.consultar(Long.valueOf(cpf));

        if (clienteConsultado != null) {
            JOptionPane.showMessageDialog(null,
                    "Cliente encontrado: " + clienteConsultado.toString(),
                    "Cliente encontrado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cliente não encontrado",
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static void cadastrar(String dados){
        String[] dadosSeparados = dados.split(",");
        Boolean cadastrado = iClienteDAO.cadastrar(new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]));
        if (cadastrado) {
            JOptionPane.showMessageDialog(null,
                    "Cliente cadastrado com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Não foi possivel efetuar o cadastro deste cliente!",
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void Sair(){
        JOptionPane.showMessageDialog(null,
                "Até logo",
                "Fechando", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao){
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoCadastro(String opcao){
        if ("1".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoConsulta(String opcao){
        if ("2".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoExcluir(String opcao){
        if ("3".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoAlterar(String opcao){
        if ("4".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao){
        if ("5".equals(opcao)){
            return true;
        }
        return false;
    }


}
