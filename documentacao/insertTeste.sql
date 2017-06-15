INSERT INTO bloco (codigo, ativo) VALUES ('A', true), ('K', true), ('P', true), ('G', true);

INSERT INTO tipo_de_sala (descricao, ativo) VALUES ('Sala Teórica', true), ('Lab. de Informática', true), ('Lab. de Rede', true);

INSERT INTO horarios (id, descricao, horario_inicio, horario_fim, turno, ativo)
VALUES
    ('M1', 'Primeiro horário da manhã', '07:30', '08:20', 0, true),
    ('M2', '', '08:20', '09:10', 0, true),
    ('M3', '', '09:10', '10:00', 0, true),
    ('M4', '', '10:20', '11:10', 0, true),
    ('M5', 'Último horário da manhã', '11:10', '12:00', 0, true),

    ('T1', 'Primeiro horário da tarde', '13:00', '13:50', 1, true),
    ('T2', '', '13:50', '14:40', 1, true),
    ('T3', '', '14:40', '15:30', 1, true),
    ('T4', '', '15:50', '16:40', 1, true),
    ('T5', 'Último horário da tarde', '16:40', '17:30', 1, true),

    ('N1', 'Primeiro horário da noite', '18:40', '19:30', 2, true),
    ('N2', '', '19:30', '20:20', 2, true),
    ('N3', '', '20:20', '21:10', 2, true),
    ('N4', '', '21:20', '23:00', 2, true),
    ('N5', 'Último horário da noite', '22:10', '23:00', 2, true);

INSERT INTO departamento (nome, sigla, ativo)
VALUES
('Departamento Acadêmico de Computação', 'DACOM', 1),
('Departamento Acadêmico de Elétrica', 'DAELE', 1),
('Departamento Acadêmico de Ciências Humanas e Sociais', 'DACHS', 1);

INSERT INTO usuario
(login, senha, email, tipo_usuario, nome, id_departamento, data_hora_cadastro, ativo, aceito)
VALUES
('admin', '5f4dcc3b5aa765d61d8327deb882cf99', 'admin@salasutf.com', 2, 'Administrador do Sistema', 1, '2017-06-14 22:16', true, true);
