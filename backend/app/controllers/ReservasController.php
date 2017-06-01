<?php

defined('INITIALIZED') OR exit('You cannot access this file directly');

class ReservasController extends Controller {

    public function reservas($param) {
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
        
        $reserva = new Reserva();
        $reserva->setAtivo(true);
        $reserva->setDataHoraReserva($_POST['dataHoraReserva']);
        $reserva->setHorario($_POST['horario']);
        $reserva->setProfessor($_POST['professor']);
        $reserva->setSala($_POST['sala']);
        $res = $reserva->save();

        if (is_null($res)) {
            $retorno['return'] = [
                "type" => "error",
                "message" => "Não foi possível registrar a reserva.",
                "object" => $res
            ];
        } else {
            //TODO: gravar Log
            $retorno['return'] = [
                "type" => "success",
                "message" => "Reserva registrada com sucesso"
            ];
        }

        echo json_encode($retorno);
    }

    public function get($id) {
        if (is_null($id)) {
            //Listar uma coleção
            echo json_encode(["return" => "Todas as reservas " . $id]);
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
