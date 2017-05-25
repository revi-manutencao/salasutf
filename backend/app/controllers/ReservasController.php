<?php defined('INITIALIZED') OR exit('You cannot access this file directly');

class ReservasController extends Controller {

	public function router(){
		switch( $this->getRequest() ){
			case 'get':
				echo json_encode("message" => "Aqui tem busca o registro com id " . $id);
				$this->get($id);
			break;
			case 'post':
				echo json_encode("message" => "Aqui cria um objeto!");
				$this->post();
			break;
			case 'put':
				echo json_encode("message" => "Aqui atualiza o registro de id " . $id);
				$this->put($id);
			break;
			case 'delete':
				echo json_encode("message" => "Aqui exclui o registro de id " . $id);
				$this->delete($id);
			break;
		}
	}

	public function post(){
		return "";
	}

	public function get($id = null){
		return "";
	}

	public function put($id = null){
	}

	public function delete($id = null){
	}

}