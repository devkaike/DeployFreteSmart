INSERT INTO `frete_smart`.`solicitacoes` (
	`status`,
    `valor_viagem`, 
    `cliente_id`, 
    `data_atualizacao`, 
    `data_criacao`, 
    `data_partida`, 
    `data_solicitacao`, 
    `id`, 
    `motorista_id`, 
    `destino`, 
    `detalhes_carga`, 
    `local_partida`, 
    `metodo_pagamento`, 
    `observacoes`, 
    `tipo_carga`
) VALUES
('2', 150.75, 1, '2024-06-12 15:30:00', '2024-06-10 12:00:00', '2024-06-10 09:00:00', '2024-06-10 12:00:00', 1, 2, 'Endereço de Destino 1', 'Carga frágil, necessita de cuidados especiais.', 'Endereço de Partida 1', 'Cartão de Crédito', 'Entregar no período da manhã.', 'Eletrônicos'),
('2', 200.00, 2, '2024-06-08 15:30:00', '2024-06-05 12:00:00', '2024-06-05 09:00:00', '2024-06-05 12:00:00', 2, 3, 'Endereço de Destino 2', 'Carga pesada.', 'Endereço de Partida 2', 'Cartão de Crédito', 'Entregar no período da tarde.', 'Móveis'),
('2', 250.00, 3, '2024-05-18 15:30:00', '2024-05-16 12:00:00', '2024-05-16 09:00:00', '2024-05-16 12:00:00', 3, 4, 'Endereço de Destino 3', 'Carga perecível, manter refrigerado.', 'Endereço de Partida 3', 'Boleto Bancário', 'Entregar no período da tarde.', 'Alimentos'),
('2', 180.50, 4, '2024-05-12 15:30:00', '2024-05-10 12:00:00', '2024-05-10 09:00:00', '2024-05-10 12:00:00', 4, 5, 'Endereço de Destino 4', 'Carga leve.', 'Endereço de Partida 4', 'Cartão de Crédito', 'Entregar no período da manhã.', 'Roupas'),
('0', 220.00, 5, '2024-04-18 15:30:00', '2024-04-16 12:00:00', '2024-04-16 09:00:00', '2024-04-16 12:00:00', 5, 6, 'Endereço de Destino 5', 'Carga frágil, necessita de cuidados especiais.', 'Endereço de Partida 5', 'Cartão de Crédito', 'Entregar no período da manhã.', 'Vidros');
