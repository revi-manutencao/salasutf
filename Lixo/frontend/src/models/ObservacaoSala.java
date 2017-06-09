<?php

defined('INITIALIZED') OR exit('You cannot access this file directly');

class ObservacaoSala extends Model {

    private $id;
    private $descricao;
    private $dataHora;
    private $idSala;
    private $idUsuario;
    private $ativo;

    function getId() {
        return $this->id;
    }

    function getDescricao() {
        return $this->descricao;
    }

    function getDataHora() {
        return $this->dataHora;
    }

    function getIdSala() {
        return $this->idSala;
    }

    function getIdUsuario() {
        return $this->idUsuario;
    }

    function getAtivo() {
        return $this->ativo;
    }

    function setId($id) {
        $this->id = $id;
    }

    function setDescricao($descricao) {
        $this->descricao = $descricao;
    }

    function setDataHora($dataHora) {
        $this->dataHora = $dataHora;
    }

    function setIdSala($idSala) {
        $this->idSala = $idSala;
    }

    function setIdUsuario($idUsuario) {
        $this->idUsuario = $idUsuario;
    }

    function setAtivo($ativo) {
        $this->ativo = $ativo;
    }

}
