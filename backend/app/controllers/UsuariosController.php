<?php

defined('INITIALIZED') OR exit('You cannot access this file directly');

class UsuariosController extends Controller {

    public function index($param) {
        switch (strtolower($this->getRequest())) {
            case 'get':
                $this->get(@$param['id']);
                break;
            case 'post':
                $this->post();
                break;
            case 'put':
                $this->put(@$param['id']);
                break;
            case 'delete':
                $this->delete(@$param['id']);
                break;
        }
    }

    public function post() {
        $usuario = new Usuario();
        $usuario->setAceito(false);
        $usuario->setAtivo(false);
        $usuario->setDataHoraCadastro(date('Y-m-d H:i:s'));
        $usuario->setIdDepartamento($_POST['idDepartamento']);
        $usuario->setEmail($_POST['email']);
        $usuario->setLogin($_POST['login']);
        $usuario->setNome($_POST['nome']);
        $usuario->setSenha($_POST['senha']);
        if ($_POST['isAdmin'] == true) {
            $usuario->setTipoUsuario(TipoUsuario::PROF);
        }
        $rec = $usuario->save();

        if ( is_null($rec) || $rec == false ) {
            $retorno['return'] = [
                "type" => "error",
                "message" => "Não foi possível registrar o usuário."
            ];
        } else {
            //TODO: gravar Log
            $retorno['return'] = [
                "type" => "success",
                "message" => "Usuário registrado com sucesso",
                "object" => jsonSerialize($rec)
            ];
        }

        echo json_encode($retorno);
    }

    public function get($id) {
        if (is_null($id) or $id == '') {
            //Listar uma coleção
            $rec = new Usuario();
            echo jsonSerialize($rec->all());
        } else {
            //Exibir detalhes de uma reserva
            $rec = new Usuario();
            echo jsonSerialize($rec->where('id = ?', $id)->find());
        }
    }

    public function put($id = null) {
        echo json_encode(["return" => "Aqui atualiza o registro de id " . $id]);
    }

    public function delete($id = null) {
        echo json_encode(["return" => "Aqui exclui o registro de id " . $id]);
    }

}
