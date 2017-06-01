<?php

defined('INITIALIZED') OR exit('You cannot access this file directly');

class ObservacoesDeSalaController extends Controller {

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

        $recurso = new ObservacaoSala();
        $recurso->setAtivo(true);
        $recurso->setDataHora(date('Y-m-d H:i:s'));
        $recurso->setDescricao($_POST['descricao']);
        $recurso->setIdSala($_POST['idSala']);
        $recurso->setIdUsuario($_POST['idUsuario']);
        $rec = $recurso->save();

        if (is_null($rec) || $rec == false) {
            $retorno['return'] = [
                "type" => "error",
                "message" => "Não foi possível registrar a observação."
            ];
        } else {
            //TODO: gravar Log
            $retorno['return'] = [
                "type" => "success",
                "message" => "Observação de sala registrada com sucesso",
                "object" => $rec
            ];
        }

        echo json_encode($retorno);
    }

    public function get($id) {
        if (is_null($id) or $id == '') {
            //Listar uma coleção
            $rec = new ObservacaoSala();
            echo jsonSerialize($rec->all());
        } else {
            //Exibir detalhes de uma reserva
            $rec = new ObservacaoSala();
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
