/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.sql.SQLException;

public class Usuario {
    //Criando Atributos

    private String usuario;
    private String nome;
    private String senha;

    //Atributos estáticos do sistema
    static String nomeUsuario;
    static String usuarioSistema;
    static boolean resultAlteracao;
    static boolean resultExclusao;

    //Atributo que armazenará o retorno do banco de dados
    private boolean resultUsuario;
    private boolean resultCadastro;
    
    private boolean resultadoPadraoSenha;

    //Gerando getters e setters dos atributos
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean verificaPadraoSenha(String senha){
        if(senha.length() < 10){
            resultadoPadraoSenha = true;
        }else{
            resultadoPadraoSenha = false;
        }
        return resultadoPadraoSenha;
    }

    //Verificando a autenticidade do usuário
    public boolean verificaUsuario(String usuario, String senha) {
        //Instanciando a conexão com banco de dados
        Conexao banco = new Conexao();

        try {
            //Abrindo conexão com o banco de dados
            banco.abrirConexao();

            //Criando parâmetro de retorno
            banco.stmt = banco.con.createStatement();

            //Executando a consulta no banco de dados
            banco.resultset
                    = banco.stmt.executeQuery("select * from usuario "
                            + "where usuario = '" + usuario + "'"
                            + "AND senha = md5('" + senha + "')");
            //Verificando se existe retorno de dados no banco
            if (banco.resultset.next()) {
                //Caso tenha
                resultUsuario = true;

                //setters em Nome e Usuario
                setUsuario(banco.resultset.getString(1));
                setNome(banco.resultset.getString(2));

                //Realizando atribuições aos atributos estáticos
                nomeUsuario = getNome();
                usuarioSistema = getUsuario();
            } else {
                //Caso não tenha
                resultUsuario = false;
            }

            banco.fecharConexao(); // Fecha a conexão com o banco
        } catch (SQLException ec) {
            System.out.println("Erro ao consultar usuário " + ec.getMessage());
        }
        return resultUsuario;
    }

    public boolean verificaUsuario(String usuario) {
        //Realizando a intancianção do banco de dados;
        Conexao banco = new Conexao();

        try {
            //Abrindo conexão com o banco de dados
            banco.abrirConexao();

            //Criando pâmetro de retorno
            banco.stmt = banco.con.createStatement();

            //executando a consulta no banco de dados
            banco.resultset = banco.stmt.executeQuery("SELECT * FROM usuario "
                    + "WHERE usuario = ' " + usuario + "'");

            //Verificando se existe retorno de dados no banco
            if (banco.resultset.next()) {
                //Caso tenha
                resultUsuario = true;
            } else {
                //caso não tenha
                resultUsuario = false;
            }

            banco.fecharConexao(); // fechando a conexão com o banco de dados
        } catch (SQLException ec) {
            System.out.println("Erro ao consultar usuário " + ec.getMessage());
        }
        return resultUsuario;
    }

    //Método para cadastro de usuário em nosso sistema
    public boolean cadastraUsuario(String nome, String usuario, String senha) {
        Conexao banco = new Conexao();

        try {
            //Abrindo a conexão com o banco
            banco.abrirConexao();

            //Criando parâmetro de retorno
            banco.stmt = banco.con.createStatement();

            //Executando a inserção dos dados
            banco.stmt.execute("INSERT INTO usuario (nome, usuario, senha)"
                    + "VALUES ('" + nome + "','" + usuario + "', md5('" + senha + "'))");
            resultCadastro = true;
        } catch (SQLException ec) {
            System.out.println("Erro ao inserir o usuário " + ec.getMessage());
            resultCadastro = false;
        }
        return resultCadastro;
    }

    //Método para alteração dos dados em nosso sistema
    public boolean alteraUsuario(String nome, String usuario, String senha) {
        //Fazer a instância da conexão com o banco de dados

        Conexao banco = new Conexao();

        try {
            //Abrindo a conexão com o banco de dados
            banco.abrirConexao();

            //Criando o parâmetro de retorno
            banco.stmt = banco.con.createStatement();

            //Executando a alteração no banco de dados
            banco.stmt.execute("UPDATE usuario SET nome = '" + nome
                    + "', senha = md5('" + senha + "') WHERE usuario = '"
                    + usuario + "'");
            //Se chegou aqui a alteração ocorreu com sucesso
            resultAlteracao = true;

        } catch (Exception ec) {
            System.out.println("Erro ao atualizar o usuário " + ec.getMessage());
            resultAlteracao = false;
        }

        banco.fecharConexao();

        return resultAlteracao;
    }

    public boolean excluiUsuario(String usuario) {
        //Realizando a instância da conexão com o banco de dados
        Conexao banco = new Conexao();

        try {
            //Abrindo a coonexão com o banco de dados
            banco.abrirConexao();

            //Criando o parâmetro de retorno
            banco.stmt = banco.con.createStatement();

            //Executando a alteração no banco de dados
            banco.stmt.execute("DELETE FROM usuario WHERE usuario = '"
                    + usuario + "'");

            //Caso exclua
            resultExclusao = true;

        } catch (Exception ec) {
            System.out.println("Erro ao excluir usuário " + ec.getMessage());
            resultExclusao = false;
        }
        banco.fecharConexao();
        return resultExclusao;
    }
}
