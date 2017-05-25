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

}