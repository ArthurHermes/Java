/* BancoBiblioteca: */

drop database if exists biblioteca;


create database if not exists biblioteca;

use biblioteca;

CREATE TABLE if not exists usuario (
    idUsuario int PRIMARY KEY AUTO_INCREMENT not null,
    nome varchar(100),
    senha varchar(100),
    endereco varchar(100),
    tpUsuario enum('usuario', 'gerente')
);


CREATE TABLE if not exists livro (
    idLivro int PRIMARY KEY AUTO_INCREMENT not null,
    nome Varchar(100),
    valor float,
    numPag int,
	categoria enum('romance', 'ficcaoCientifica', 'fantasia', 'misterio', 'suspense', 'horror', 'biografia', 'historia', 'programacao', 'gastronomia'),
    classificacao Enum('infantil', 'livre'),
    idioma Varchar(100),
    disponibilidade boolean
);


CREATE TABLE if not exists aluga (
    fk_Usuario_idUsuario int,
    fk_Livro_idLivro int,
    FOREIGN KEY (fk_Usuario_idUsuario) REFERENCES usuario (idUsuario) ON DELETE SET NULL,
    FOREIGN KEY (fk_Livro_idLivro) REFERENCES livro (idLivro) ON DELETE SET NULL
);


-- Criando usuarios
INSERT INTO usuario (nome, senha, endereco, tpUsuario) VALUES
('João Silva', 'senha123', 'Rua das Flores, 123', 'usuario'),
('Maria Santos', 'senha456', 'Avenida Principal, 456', 'gerente'),
('Pedro Oliveira', 'senha789', 'Travessa das Árvores, 789', 'usuario');


-- Criando livros
INSERT INTO livro (nome, valor, numPag, categoria, classificacao, idioma, disponibilidade) VALUES
('Harry Potter e a Pedra Filosofal', 39.90, 320, 'fantasia', 'infantil', 'Português', false),
('1984', 29.90, 368, 'ficcaoCientifica', 'livre', 'Inglês', false),
('Dom Casmurro', 25.50, 256, 'romance', 'livre', 'Português', false),
('A Culpa é das Estrelas', 34.99, 288, 'romance', 'livre', 'Português', false);


SELECT * FROM usuario;
SELECT * FROM livro;
