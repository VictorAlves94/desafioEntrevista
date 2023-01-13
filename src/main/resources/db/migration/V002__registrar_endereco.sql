CREATE TABLE endereco(
endereco_id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
logadouro VARCHAR(50)NOT NULL,
cep VARCHAR(20) NOT NULL,
numero VARCHAR(50) NOT NULL,
cidade VARCHAR(50)NOT NULL,
pessoa_id BIGINT(20)                                                                                                                         NOT NULL,
FOREIGN KEY (endereco_id) REFERENCES endereco(endereco_id),
FOREIGN KEY (pessoa_id) REFERENCES pessoa(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;