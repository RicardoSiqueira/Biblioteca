<%@ page import='br.com.biblioteca.modelo.Livro' %>
<%@ page import='java.util.List' %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Consulta Livros</title>
<link rel="stylesheet" href="consulta.css">
</head>
<body>
    <% List<Livro> listaLivros = (List<Livro>) request.getAttribute("LISTA-LIVROS"); %>
    <div class="header">
        <H1>Consulta Livros</H1>
    </div>
    <div class="main">
        <div class="formulario">
            <form action="">
            <span>Busca</span>
            <input type="text">
            <select name="opcao" id="seletor">
                <option value="nome">Nome</option>
                <option value="autor">Autor</option>
                <option value="editora">Editora</option>
            </select>
            <input type="submit">
            </form>
        </div>
        <div class="tabela">
            <table>
            <thead>
                <tr>
                	<th>ID</th>
                    <th>Nome</th>
                    <th>Autor</th>
                    <th>Editora</th>
                    <th>Área</th>
                    <th>Data Aquisição</th>
                    <th>Preço</th>
                    <th>Qtde</th>
                    <th>Ativo</th>
                </tr>
            </thead>
            <tbody>
	        <% for (Livro livro : listaLivros) { %>
                <tr>
                    <td><% livro.getId(); %></td>
                    <td><% livro.getNome(); %></td>
                    <td><% livro.getAutor(); %></td>
                    <td><% livro.getEditora(); %></td>
                    <td><% livro.getArea(); %></td>
                    <td><% livro.getData_aquisicao(); %></td>
                    <td><% livro.getPreco(); %></td>
                    <td><% livro.getQuantidade(); %></td>
                    <td><% livro.getAtivo(); %></td>
                </tr>
             <% } %>
            </tbody>
            </table>
        </div>
    </div>
    <div class="footer"></div>
    <script type="text/javascript" src="consulta.js"></script>
</body>
</html>