<?php

defined('INITIALIZED') OR exit('You cannot access this file directly');

class ReservasController extends Controller {

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

        $reserva = new Reserva();
        $reserva->setAtivo(true);
        $reserva->setDataHoraReserva(date('Y-m-d H:i:s'));
        $reserva->setHorario($_POST['horario']);
        $reserva->setIdProfessor($_POST['idProfessor']);
        $reserva->setIdSala($_POST['idSala']);
        $res = $reserva->save();

        if (is_null($res) || $res == false) {
            $retorno['return'] = [
                "type" => "error",
                "message" => "Não foi possível registrar a reserva."
            ];
        } else {
            //TODO: gravar Log
            $retorno['return'] = [
                "type" => "success",
                "message" => "Reserva registrada com sucesso",
                "object" => $res
            ];
        }

        echo json_encode($retorno);
    }

    public function get($id) {
        if (is_null($id) or $id == '') {
            //Listar uma coleção
            $rec = new Reserva();
            echo jsonSerialize($rec->all());
        } else {
            //Exibir detalhes de uma reserva
            $rec = new Reserva();
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
