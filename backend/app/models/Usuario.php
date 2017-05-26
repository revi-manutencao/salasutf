<?php  defined('INITIALIZED') OR exit('You cannot access this file directly');

class Usuario extends Model {
	
	private $id;
	private $login;
	private $senha;
	private $email;
	private $tipoUsuario;
	private $nome;
	private $departamento;
	private $dataHoraCadastro;
	private $dataHoraAtualizacao;
	private $aceito;
	private $ativo;

    public function getId()
    {
        return $this->id;
    }

    public function setId($id)
    {
        $this->id = $id;
    }

    public function getLogin()
    {
        return $this->login;
    }

    public function setLogin($login)
    {
        $this->login = $login;
    }

    public function getSenha()
    {
        return $this->senha;
    }

    public function setSenha($senha)
    {
        $this->senha = $senha;
    }

    public function getEmail()
    {
        return $this->email;
    }

    public function setEmail($email)
    {
        $this->email = $email;
    }

    public function getTipoUsuario()
    {
        return $this->tipoUsuario;
    }

    public function setTipoUsuario($tipoUsuario)
    {
        $this->tipoUsuario = $tipoUsuario;
    }

    public function getNome()
    {
        return $this->nome;
    }

    public function setNome($nome)
    {
        $this->nome = $nome;
    }

    public function getDepartamento()
    {
        return $this->departamento;
    }

    public function setDepartamento($departamento)
    {
        $this->departamento = $departamento;
    }

    public function getDataHoraCadastro()
    {
        return $this->dataHoraCadastro;
    }

    public function setDataHoraCadastro($dataHoraCadastro)
    {
        $this->dataHoraCadastro = $dataHoraCadastro;
    }

    public function getDataHoraAtualizacao()
    {
        return $this->dataHoraAtualizacao;
    }

    public function setDataHoraAtualizacao($dataHoraAtualizacao)
    {
        $this->dataHoraAtualizacao = $dataHoraAtualizacao;
    }

    public function getAceito()
    {
        return $this->aceito;
    }

    public function setAceito($aceito)
    {
        $this->aceito = $aceito;
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