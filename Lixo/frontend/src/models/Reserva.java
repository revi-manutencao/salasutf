<?php

defined('INITIALIZED') OR exit('You cannot access this file directly');

class Reserva extends Model {

    private $id;
    private $dataUso;
    private $dataHoraReserva;
    private $ativo;
    private $idSala;
    private $idProfessor;
    private $horario;

    function getId() {
        return $this->id;
    }

    function getDataUso() {
        return $this->dataUso;
    }

    function getDataHoraReserva() {
        return $this->dataHoraReserva;
    }

    function getAtivo() {
        return $this->ativo;
    }

    function getIdSala() {
        return $this->idSala;
    }

    function getIdProfessor() {
        return $this->idProfessor;
    }

    function getHorario() {
        return $this->horario;
    }

    function setId($id) {
        $this->id = $id;
    }

    function setDataUso($dataUso) {
        $this->dataUso = $dataUso;
    }

    function setDataHoraReserva($dataHoraReserva) {
        $this->dataHoraReserva = $dataHoraReserva;
    }

    function setAtivo($ativo) {
        $this->ativo = $ativo;
    }

    function setIdSala($idSala) {
        $this->idSala = $idSala;
    }

    function setIdProfessor($idProfessor) {
        $this->idProfessor = $idProfessor;
    }

    function setHorario($horario) {
        $this->horario = $horario;
    }

}
