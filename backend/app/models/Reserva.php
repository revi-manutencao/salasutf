<?php  defined('INITIALIZED') OR exit('You cannot access this file directly');

class Reserva extends Model {
	
	private $id;
	private $dataUso;
	private $dataHoraReserva;
	private $ativo;
	private $sala;
	private $professor;
	private $horario;

    public function getId()
    {
        return $this->id;
    }

    public function setId($id)
    {
        $this->id = $id;
    }

    public function getDataUso()
    {
        return $this->dataUso;
    }

    public function setDataUso($dataUso)
    {
        $this->dataUso = $dataUso;
    }

    public function getDataHoraReserva()
    {
        return $this->dataHoraReserva;
    }

    public function setDataHoraReserva($dataHoraReserva)
    {
        $this->dataHoraReserva = $dataHoraReserva;
    }

    public function getAtivo()
    {
        return $this->ativo;
    }

    public function setAtivo($ativo)
    {
        $this->ativo = $ativo;
    }

    public function getSala()
    {
        return $this->sala;
    }

    public function setSala($sala)
    {
        $this->sala = $sala;
    }

    public function getProfessor()
    {
        return $this->professor;
    }

    public function setProfessor($professor)
    {
        $this->professor = $professor;
    }

    public function getHorario()
    {
        return $this->horario;
    }

    public function setHorario($horario)
    {
        $this->horario = $horario;
    }

	
}