CREATE TABLE usuario (
    id SERIAL NOT NULL,
    codigo VARCHAR NOT NULL,
    senha VARCHAR NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE caixa (
    id SERIAL NOT NULL,
    codigo VARCHAR NOT NULL,
    descricao VARCHAR NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE abertura_caixa (
    id SERIAL NOT NULL,
    data_hora TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT NOW(),
    id_caixa INTEGER NOT NULL,
    id_usuario INTEGER NOT NULL,
    valor_fundo_caixa NUMERIC(14,4),
    PRIMARY KEY (id),
    FOREIGN KEY (id_caixa) REFERENCES caixa (id),
    FOREIGN KEY (id_usuario) REFERENCES usuario (id)
);

CREATE TABLE fechamento_caixa (
    id SERIAL NOT NULL,
    data_hora TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT NOW(),
    id_abertura_caixa INTEGER NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_abertura_caixa) REFERENCES fechamento_caixa (id)
);

CREATE TABLE fechamento_caixa_item (
    id SERIAL NOT NULL,
    id_fechamento_caixa INTEGER NOT NULL,
    forma_pagamento INTEGER NOT NULL,
    valor NUMERIC(14,4),
    PRIMARY KEY (id),
    FOREIGN KEY (id_fechamento_caixa) REFERENCES fechamento_caixa (id)
);  

CREATE TABLE unidade (
    id SERIAL NOT NULL,
    descricao VARCHAR NOT NULL,
    sigla VARCHAR NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE produto (
    id SERIAL NOT NULL,
    codigo VARCHAR NOT NULL,
    descricao VARCHAR NOT NULL,
    id_unidade INTEGER NOT NULL,
    valor NUMERIC(14,4),
    PRIMARY KEY (id),
    FOREIGN KEY (id_unidade) REFERENCES unidade(id)
);

CREATE TABLE motivo_movim_estoque (
    id SERIAL NOT NULL,
    codigo VARCHAR NOT NULL,
    descricao VARCHAR NOT NULL,
    tipo VARCHAR NOT NULL,
    PRIMARY KEY (id)
);