-- Inserindo 10 Usuários e Clientes
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
('gustavopereira', 'senhaSegura707');

-- Inserindo Clientes
INSERT INTO clientes (nome, cpf, celular, email, cep, endereco, complemento, bairro, cidade, estado)
VALUES 
('João Silva', '123.456.789-00', '(11) 98765-4321', 'joao.silva@example.com', '12345-678', 'Rua Exemplo, 123', 'Apto 101', 'Centro', 'São Paulo', 'SP'),
('Maria Oliveira', '234.567.890-01', '(21) 91234-5678', 'maria.oliveira@example.com', '23456-789', 'Avenida Principal, 456', 'Bloco B, Apto 202', 'Jardim', 'Rio de Janeiro', 'RJ'),
('Carlos Medeiros', '345.678.901-02', '(31) 92345-6789', 'carlos.medeiros@example.com', '34567-890', 'Rua das Flores, 789', 'Casa', 'Planalto', 'Belo Horizonte', 'MG'),
('Ana Carvalho', '456.789.012-03', '(41) 93456-7890', 'ana.carvalho@example.com', '45678-901', 'Rua do Sol, 101', 'Cobertura', 'Centro', 'Curitiba', 'PR'),
('Pedro Ramos', '567.890.123-04', '(51) 94567-8901', 'pedro.ramos@example.com', '56789-012', 'Avenida Brasil, 202', 'Sala 1', 'Comercial', 'Porto Alegre', 'RS'),
('Luiza Freitas', '678.901.234-05', '(61) 95678-9012', 'luiza.freitas@example.com', '67890-123', 'SQN 303, Bloco C', 'Apto 303', 'Asa Norte', 'Brasília', 'DF'),
('Roberto Souza', '789.012.345-06', '(71) 96789-0123', 'roberto.souza@example.com', '78901-234', 'Rua das Laranjeiras, 404', 'Apto 404', 'Barra', 'Salvador', 'BA'),
('Fernanda Lima', '890.123.456-07', '(81) 97890-1234', 'fernanda.lima@example.com', '89012-345', 'Avenida Atlântica, 505', 'Casa', 'Boa Viagem', 'Recife', 'PE'),
('Juliana Costa', '901.234.567-08', '(91) 98901-2345', 'juliana.costa@example.com', '90123-456', 'Rua Amazonas, 606', 'Cobertura', 'Centro', 'Belém', 'PA'),
('Gustavo Pereira', '012.345.678-09', '(51) 90012-3456', 'gustavo.pereira@example.com', '01234-567', 'Rua Rio Grande, 707', 'Apto 707', 'Cidade Baixa', 'Porto Alegre', 'RS');
