<?php  defined('INITIALIZED') OR exit('You cannot access this file directly');

class Sala extends Model {
	
	private $id;
	private $codigo;
	private $bloco;
	private $tipoSala;
	private $administrador;
	private $equipamentos;
	private $ativo;

    public function getId()
    {
        return $this->id;
    }

    public function setId($id)
    {
        $this->id = $id;
    }

    public function getCodigo()
    {
        return $this->codigo;
    }

    public function setCodigo($codigo)
    {
        $this->codigo = $codigo;
    }

    public function getBloco()
    {
        return $this->bloco;
    }

    public function setBloco($bloco)
    {
        $this->bloco = $bloco;
    }

    public function getTipoSala()
    {
        return $this->tipoSala;
    }

    public function setTipoSala($tipoSala)
    {
        $this->tipoSala = $tipoSala;
    }

    public function getAdministrador()
    {
        return $this->administrador;
    }

    public function setAdministrador($administrador)
    {
        $this->administrador = $administrador;
    }

    public function getEquipamentos()
    {
        return $this->equipamentos;
    }

    public function setEquipamentos($equipamentos)
    {
        $this->equipamentos = $equipamentos;
    }

    public function getAtivo()
    {
        return $this->ativo;
    }

    public function setAtivo($ativo)
    {
        $this->ativo = $ativo;
    }
	
	
}