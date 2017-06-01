<?php

defined('INITIALIZED') OR exit('You cannot access this file directly');

class SalasController extends Controller {

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

        $recurso = new Sala();
        $recurso->setAtivo(true);
        $recurso->setIdBloco($_POST['idBloco']);
        $recurso->setIdTipoSala($_POST['idTipoSala']);
        $recurso->setIdAdministrador($_POST['idAdministrador']);
        $recurso->setCodigo($_POST['codigo']);
        $recurso->setEquipamentos($_POST['equipamentos']);
        $rec = $recurso->save();

        if (is_null($rec) || $rec == false) {
            $retorno['return'] = [
                "type" => "error",
                "message" => "Não foi possível registrar a sala."
            ];
        } else {
            //TODO: gravar Log
            $retorno['return'] = [
                "type" => "success",
                "message" => "Sala registrada com sucesso",
                "object" => $rec
            ];
        }

        echo json_encode($retorno);
    }

    public function get($id) {
        if (is_null($id)) {
            //Listar uma coleção
            echo json_encode(["return" => "Todas os usuários " . $id]);
        } else {
            //Exibir detalhes de uma reserva
            echo json_encode(["return" => "Aqui mostra o registro de id " . $id]);
        }
    }

    public function put($id = null) {
        echo json_encode(["return" => "Aqui atualiza o registro de id " . $id]);
    }

    public function delete($id = null) {
        echo json_encode(["return" => "Aqui exclui o registro de id " . $id]);
    }

}
