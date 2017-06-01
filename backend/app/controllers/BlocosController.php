<?php

defined('INITIALIZED') OR exit('You cannot access this file directly');

class BlocosController extends Controller {

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
        $recurso = new Bloco();
        $recurso->setAtivo(true);
        $recurso->setCodigo($_POST['codigo']);
        $rec = $recurso->save();

        if ( is_null($rec) || $rec == false ) {
            $retorno['return'] = [
                "type" => "error",
                "message" => "Não foi possível registrar o bloco."
            ];
        } else {
            //TODO: gravar Log
            $retorno['return'] = [
                "type" => "success",
                "message" => "Bloco registrado com sucesso",
                "object" => jsonSerialize($rec)
            ];
        }

        echo json_encode($retorno);
    }

    public function get($id) {
        if (is_null($id) or $id == '') {
            //Listar uma coleção
            $bloco = new Bloco();
            echo jsonSerialize($bloco->all());
        } else {
            //Exibir detalhes de uma reserva
            $bloco = new Bloco();
            echo jsonSerialize($bloco->where('id = ?', $id)->find());
        }
    }

    public function put($id = null) {
        echo json_encode(["return" => "Aqui atualiza o registro de id " . $id]);
    }

    public function delete($id = null) {
        echo json_encode(["return" => "Aqui exclui o registro de id " . $id]);
    }

}
