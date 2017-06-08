<?php

defined('INITIALIZED') OR exit('You cannot access this file directly');

class Usuario extends Model {

    private $id;
    private $login;
    private $senha;
    private $email;
    private $tipoUsuario;
    private $nome;
    private $idDepartamento;
    private $dataHoraCadastro;
    private $dataHoraAtualizacao;
    private $aceito;
    private $ativo;

    function getId() {
        return $this->id;
    }

    function getLogin() {
        return $this->login;
    }

    function getSenha() {
        return $this->senha;
    }

    function getEmail() {
        return $this->email;
    }

    function getTipoUsuario() {
        return $this->tipoUsuario;
    }

    function getNome() {
        return $this->nome;
    }

    function getIdDepartamento() {
        return $this->idDepartamento;
    }

    function getDataHoraCadastro() {
        return $this->dataHoraCadastro;
    }

    function getDataHoraAtualizacao() {
        return $this->dataHoraAtualizacao;
    }

    function getAceito() {
        return $this->aceito;
    }

    function getAtivo() {
        return $this->ativo;
    }

    function setId($id) {
        $this->id = $id;
    }

    function setLogin($login) {
        $this->login = $login;
    }

    function setSenha($senha) {
        $this->senha = $senha;
    }

    function setEmail($email) {
        $this->email = $email;
    }

    function setTipoUsuario($tipoUsuario) {
        $this->tipoUsuario = $tipoUsuario;
    }

    function setNome($nome) {
        $this->nome = $nome;
    }

    function setIdDepartamento($idDepartamento) {
        $this->idDepartamento = $idDepartamento;
    }

    function setDataHoraCadastro($dataHoraCadastro) {
        $this->dataHoraCadastro = $dataHoraCadastro;
    }

    function setDataHoraAtualizacao($dataHoraAtualizacao) {
        $this->dataHoraAtualizacao = $dataHoraAtualizacao;
    }

    function setAceito($aceito) {
        $this->aceito = $aceito;
    }

    function setAtivo($ativo) {
        $this->ativo = $ativo;
    }

}
