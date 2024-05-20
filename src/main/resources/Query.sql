-- Inserindo Usuários
INSERT INTO usuarios (login, senha)
VALUES 
('joaosilva', 'senhaSegura123'),
('mariaoliveira', 'senhaSegura456'),
('carlosmedeiros', 'senhaSegura789'),
('anacarvalho', 'senhaSegura101'),
('pedroramos', 'senhaSegura202'),
('luizafreitas', 'senhaSegura303'),
('robertosouza', 'senhaSegura404'),
('fernandalima', 'senhaSegura505'),
('julianacosta', 'senhaSegura606'),
('gustavopereira', 'senhaSegura707'),
('mariasantos', 'senhaSegura808'),
('anacosta', 'senhaSegura111'),
('pedroalves', 'senhaSegura333'),
('carlamelo', 'senhaSegura444'),
('lucasferreira', 'senhaSegura555'),
('fernandaoliveira', 'senhaSegura666'),
('rafaellima', 'senhaSegura777'),
('beatrizbarros', 'senhaSegura888'),
('tiagoribeiro', 'senhaSegura999');

-- Inserindo Administradores
INSERT INTO administradores (`cpf`, `email`, `nome`, `sobrenome`, `celular`, `usuario_id`, `cep`, `bairro`, `cidade_id`, `complemento`, `endereco`)
VALUES 
('11111111111', 'admin1@fretesmart.com', 'João', 'Silva', '11987654321', 1, '11111-111', 'Centro', '1', 'Apto 101', 'Rua A'), 
('22222222222', 'admin2@fretesmart.com', 'Maria', 'Oliveira', '21987654321', 2, '22222-222', 'Botafogo', '3000', 'Bloco B', 'Avenida B'), 
('33333333333', 'admin3@fretesmart.com', 'Carlos', 'Santos', '31987654321', 3, '33333-333', 'Savassi', '4998', 'Casa 3', 'Rua C');

-- Inserindo Clientes associados aos Usuários
INSERT INTO clientes (nome, sobrenome, cpf, celular, email, cep, endereco, complemento, bairro, cidade_id, usuario_id)
VALUES 
('Ana', 'Carvalho', '45678901203', '41934567890', 'ana.carvalho@example.com', '45678-901', 'Rua do Sol, 101', 'Cobertura', 'Centro', '1156', 4),
('Pedro', 'Ramos', '56789012304', '51945678901', 'pedro.ramos@example.com', '56789-012', 'Avenida Brasil, 202', 'Sala 1', 'Comercial', '4700', 5),
('Luiza', 'Freitas', '67890123405', '61956789012', 'luiza.freitas@example.com', '67890-123', 'SQN 303, Bloco C', 'Apto 303', 'Asa Norte', '3456', 6),
('Roberto', 'Souza', '78901234506', '71967890123', 'roberto.souza@example.com', '78901-234', 'Rua das Laranjeiras, 404', 'Apto 404', 'Barra', '3781', 7),
('Fernanda', 'Lima', '89012345607', '81978901234', 'fernanda.lima@example.com', '89012-345', 'Avenida Atlântica, 505', 'Casa', 'Boa Viagem', '1245', 8),
('Juliana', 'Costa', '90123456708', '91989012345', 'juliana.costa@example.com', '90123-456', 'Rua Amazonas, 606', 'Cobertura', 'Centro', '3022', 9),
('Gustavo', 'Pereira', '01234567809', '51900123456', 'gustavo.pereira@example.com', '01234-567', 'Rua Rio Grande, 707', 'Apto 707', 'Cidade Baixa', '3561', 10);

-- Inserindo Caminhões
INSERT INTO caminhoes (placa, renavam, chassis, marca, ano, cor, peso_maximo_carga, quantidade_eixos, tipo_carroceria, uf_placa) 
VALUES 
('ABC1234', '12345678901', '9BWZZZ377VT004251', 'Volvo', '2020', 'Branco', 15000.0, 3, 'BAU', 'SP'),
('DEF5678', '12345678902', '8BWZZZ377VT004252', 'Mercedes', '2018', 'Azul', 12000.0, 2, 'SIDER', 'RJ'),
('GHI9012', '12345678903', '7BWZZZ377VT004253', 'Scania', '2019', 'Vermelho', 18000.0, 4, 'GRANELEIRO', 'MG'),
('JKL3456', '12345678904', '6BWZZZ377VT004254', 'MAN', '2021', 'Preto', 16000.0, 3, 'CARGA_SECA', 'RS'),
('MNO7890', '12345678905', '5BWZZZ377VT004255', 'Iveco', '2017', 'Verde', 14000.0, 2, 'FRIGORIFICO', 'BA'),
('PQR1234', '12345678906', '4BWZZZ377VT004256', 'DAF', '2022', 'Branco', 20000.0, 4, 'CARGA_SECA', 'PR'),
('STU5678', '12345678907', '3BWZZZ377VT004257', 'Ford', '2015', 'Amarelo', 13000.0, 2, 'GRANELEIRO', 'GO'),
('VWX9012', '12345678908', '2BWZZZ377VT004258', 'Volkswagen', '2016', 'Cinza', 17000.0, 3, 'BAU', 'ES'),
('YZA3456', '12345678909', '1BWZZZ377VT004259', 'Renault', '2019', 'Azul', 19000.0, 4, 'SIDER', 'SC'),
('BCD7890', '12345678910', '0BWZZZ377VT004250', 'Hyundai', '2014', 'Vermelho', 11000.0, 2, 'FRIGORIFICO', 'MT');

-- Inserindo Motoristas
INSERT INTO motoristas (nome, sobrenome, data_nascimento, cpf, cnh, tipo_cnh, celular, email, usuario_id) 
VALUES 
('Maria', 'Santos', '1988-04-10', '98765432100', '12345678900', 'D', '62987654321', 'maria.santos@example.com', 11);

-- Inserindo Motoristas com Caminhões
INSERT INTO motoristas (nome, sobrenome, data_nascimento, cpf, cnh, tipo_cnh, celular, email, usuario_id, caminhao_id) 
VALUES 
('Ana', 'Costa', '1990-07-22', '45678912302', '34567890123', 'C', '62923456789', 'ana.costa@example.com', 12, 2),
('Pedro', 'Alves', '1975-01-30', '32165498703', '45678901234', 'E', '62934567890', 'pedro.alves@example.com', 13, 3),
('Carla', 'Melo', '1982-03-05', '65432198704', '56789012345', 'B', '62945678901', 'carla.melo@example.com', 14, 4),
('Lucas', 'Ferreira', '1995-08-12', '78912345605', '67890123456', 'D', '62956789012', 'lucas.ferreira@example.com', 15, 5),
('Fernanda', 'Oliveira', '1983-09-25', '98765412306', '78901234567', 'C', '62967890123', 'fernanda.oliveira@example.com', 16, 6),
('Rafael', 'Lima', '1978-12-10', '12378945607', '89012345678', 'E', '62978901234', 'rafael.lima@example.com', 17, 7),
('Beatriz', 'Barros', '1992-11-17', '45612378908', '90123456789', 'B', '62989012345', 'beatriz.barros@example.com', 18, 8),
('Tiago', 'Ribeiro', '1987-02-28', '32198765409', '01234567890', 'D', '62990123456', 'tiago.ribeiro@example.com', 19, 9);

