<?php defined('INITIALIZED') OR exit('You cannot access this file directly');

class ReservasController extends Controller {

	public function reservas($param){
		switch( strtolower($this->getRequest()) ){
			case 'get':
				$this->get($param['id']);
			break;
			case 'post':
				$this->post();
			break;
			case 'put':
				$this->put($param['id']);
			break;
			case 'delete':
				$this->delete($param['id']);
			break;
		}
	}

	public function post(){
		$reserva = new Reserva();
		
		$retorno['return'] = [
			"type" => "success",
			"message" => "Criado com sucesso!"
		];

		echo json_encode($retorno);
	}

	public function get($id = null){
		echo json_encode(["return" => "Aqui mostra o registro de id " . $id]);
	}

	public function put($id = null){
		echo json_encode(["return" => "Aqui atualiza o registro de id " . $id]);
	}

	public function delete($id = null){
		echo json_encode(["return" => "Aqui exclui o registro de id " . $id]);
	}

}