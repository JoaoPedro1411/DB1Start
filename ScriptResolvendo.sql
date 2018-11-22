select * from uf

insert into uf (nome) values ('AC'),
('AL'),
('AP'),
('BA'),
('CE'),
('PB'),
('PI'),
('RN'),
('RO'),
('RR'),
('SE'),
('TO')


DELETE FROM UF WHERE ID in( 1,2,4,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)

select * from cidade
delete from cidade where id in(2,3)

insert into cidade (nome, uf_id)
values ('CHAPECÓ', 3),
('BLUMENAU', 3),
('JOINVILLE', 3),
('CURITIBA', 5),
('MARINGÁ', 5),
('LUNARDELI', 5),
('APUCARANA', 5),
('SANTA FÉ', 5),
('SÃO MIGUEL DO IGUAÇU', 5),
('ARAPONGAS', 5),
('PONTA GROSSA', 5),
('JANDAIA DO SUL', 5),
('RIBEIRÃO PRETO', 6)

insert into cidade (nome, uf_id)
values ('SÃO PAULO', 6),
('AVARÉ', 6),
('BOTUCATU', 6),
('GUARULHOS', 6),
('CAMPINAS', 6),
('SOROCABA', 6),
('SANTO ANDRÉ', 6),
('SÃO BERNADO DO CAMPO', 6),
('SÃO JOSÉ DOS CAMPOS', 6),
('OSASCO', 6),
('MAUÁ', 6),
('SÃO JOSÉ DO RIO PRETO', 6),
('MOGI DAS CRUZES', 6),
('SANTOS', 6),
('DIADEMA', 6),
('JUNIAÍ', 6),
('PIRACICABA', 6),
('CARAPICUÍBA', 6),
('BAURU', 6),
('ITAQUAQUECETUBA', 6),
('SÃO VICENTE', 6),
('FRANCA', 6),
('PRAIA GRANDE', 6),
('GUARUJÁ', 6),
('TAUBATÉ', 6),
('LIMEIRA', 6),
('SUZANO', 6),
('TABOÃO DA SERRA', 6),
('SUMARÉ', 6),
('BARUERI', 6),
('EMBU DAS ARTES', 6),
('SÃO CARLOS', 6),
('INDAIATUBA', 6),
('COTIA', 6),
('MARÍLIA', 6),
('AMERICANA', 6),
('ITAPEVI', 6),
('ARARAQUARA', 6),
('JACAREÍ', 6),
('HORTOLÂNDIA', 6),
('PRESIDENTE PRUDENTE', 6),
('RIO CLARO', 6),
('ARAÇATUBA', 6),
('SANTA BÁRBARA D"OESTE', 6),
('FERRAZ DE VASCONCELOS', 6),
('FRANCISCO MORATO', 6),
('ITAPECERICA DA SERRA', 6),
('ITU', 6),
('BRAGANÇA PAULISTA', 6),
('PINDAMONHANGABA', 6),
('ITAPETININGA', 6),
('SÃO CAETANO DO SUL', 6),
('FRANCO DA ROCHA', 6),
('MOGI GUAÇU', 6),
('JAÚ', 6),
('ATIBAIA', 6),
('SANTANA DE PARNAÍBA', 6),
('ARARAS', 6),
('CUBATÃO', 6),
('VALINHOS', 6),
('OURINHOS', 6),
('UBATUBA', 6)

UPDATE CIDADE SET NOME = 'JANDAIA' where id = 15



SELECT CIDADE.NOME, UF.NOME FROM CIDADE 
INNER JOIN UF ON UF.ID = CIDADE.UF_ID
ORDER BY UF.NOME

