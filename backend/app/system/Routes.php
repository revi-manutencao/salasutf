<?php defined('INITIALIZED') OR exit('You cannot access this file directly');
/*
 * Padrão para a escrita de rotas:
 * $route['URL'] = 'Controller/Method';
 *

 * // Use '?' to indicate that the method needs one or more parameters
 * $route['URL/?'] = 'Controller/Method'; 
 *
 * OBS: As rotas ao fim do arquivo sobrescrevem as do início.
 */
 
 $route['reservas/?'] = 'ReservasController/index';
 $route['usuarios/?'] = 'UsuariosController/index';
 $route['departamentos/?'] = 'DepartamentosController/index';
 $route['tiposdesala/?'] = 'TiposDeSalaController/index';
 $route['salas/?'] = 'SalasController/index';
 $route['horarios/?'] = 'HorariosController/index';
 $route['blocos/?'] = 'BlocosController/index';
 $route['observacoes-sala/?'] = 'ObservacoesDeSalaController/index';