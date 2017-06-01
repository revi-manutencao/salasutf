<?php

defined('INITIALIZED') OR exit('You cannot access this file directly');

class Sala extends Model {

    private $id;
    private $codigo;
    private $idBloco;
    private $idTipoSala;
    private $idAdministrador;
    private $equipamentos;
    private $ativo;

    function getId() {
        return $this->id;
    }

    function getCodigo() {
        return $this->codigo;
    }

    function getIdBloco() {
        return $this->idBloco;
    }

    function getIdTipoSala() {
        return $this->idTipoSala;
    }

    function getIdAdministrador() {
        return $this->idAdministrador;
    }

    function getEquipamentos() {
        return $this->equipamentos;
    }

    function getAtivo() {
        return $this->ativo;
    }

    function setId($id) {
        $this->id = $id;
    }

    function setCodigo($codigo) {
        $this->codigo = $codigo;
    }

    function setIdBloco($idBloco) {
        $this->idBloco = $idBloco;
    }

    function setIdTipoSala($idTipoSala) {
        $this->idTipoSala = $idTipoSala;
    }

    function setIdAdministrador($idAdministrador) {
        $this->idAdministrador = $idAdministrador;
    }

    function setEquipamentos($equipamentos) {
        $this->equipamentos = $equipamentos;
    }

    function setAtivo($ativo) {
        $this->ativo = $ativo;
    }

}
