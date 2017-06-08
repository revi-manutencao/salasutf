<?php

defined('INITIALIZED') OR exit('You cannot access this file directly');

class TiposDeSalaController extends Controller {

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
        
        $recurso = new TipoSala();
        $recurso->setAtivo(true);
        $recurso->setDescricao($_POST['descricao']);
        $tipo = $recurso->save();

        if ( is_null($tipo) || $tipo == false ) {
            $retorno['return'] = [
                "type" => "error",
                "message" => "Não foi possível registrar o tipo de sala."
            ];
        } else {
            //TODO: gravar Log
            $retorno['return'] = [
                "type" => "success",
                "message" => "Tipo de sala registrado com sucesso",
                "object" => $tipo
            ];
        }

        echo json_encode($retorno);
    }

    public function get($id) {
        if (is_null($id) or $id == '') {
            //Listar uma coleção
            $rec = new TipoSala();
            echo jsonSerialize($rec->all());
        } else {
            //Exibir detalhes de uma reserva
            $rec = new TipoSala();
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