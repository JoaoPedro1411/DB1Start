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
insert into uf (nome) values ('PR'),
('SP'),
('SC')

DELETE FROM UF WHERE ID in( 1,2,3,4,5,6,7,8,9,10,11,12)

select * from cidade
delete from cidade where id in(2,3)

insert into cidade (nome, uf_id)
values ('CHAPECÓ', 15),
('BLUMENAU', 15),
('JOINVILLE', 15),
('CURITIBA', 13),
('MARINGÁ', 13),
('LUNARDELI', 13),
('APUCARANA', 13),
('SANTA FÉ', 13),
('SÃO MIGUEL DO IGUAÇU', 13),
('ARAPONGAS', 13),
('PONTA GROSSA', 13),
('JANDAIA DO SUL', 13),
('RIBEIRÃO PRETO', 14)

insert into cidade (nome, uf_id)
values ('SÃO PAULO', 14),
('AVARÉ', 14),
('BOTUCATU', 14),
('GUARULHOS', 14),
('CAMPINAS', 14),
('SOROCABA', 14),
('SANTO ANDRÉ', 14),
('SÃO BERNADO DO CAMPO', 14),
('SÃO JOSÉ DOS CAMPOS', 14),
('OSASCO', 14),
('MAUÁ', 14),
('SÃO JOSÉ DO RIO PRETO', 14),
('MOGI DAS CRUZES', 14),
('SANTOS', 14),
('DIADEMA', 14),
('JUNIAÍ', 14),
('PIRACICABA', 14),
('CARAPICUÍBA', 14),
('BAURU', 14),
('ITAQUAQUECETUBA', 14),
('SÃO VICENTE', 14),
('FRANCA', 14),
('PRAIA GRANDE', 14),
('GUARUJÁ', 14),
('TAUBATÉ', 14),
('LIMEIRA', 14),
('SUZANO', 14),
('TABOÃO DA SERRA', 14),
('SUMARÉ', 14),
('BARUERI', 14),
('EMBU DAS ARTES', 14),
('SÃO CARLOS', 14),
('INDAIATUBA', 14),
('COTIA', 14),
('MARÍLIA', 14),
('AMERICANA', 14),
('ITAPEVI', 14),
('ARARAQUARA', 14),
('JACAREÍ', 14),
('HORTOLÂNDIA', 14),
('PRESIDENTE PRUDENTE', 14),
('RIO CLARO', 14),
('ARAÇATUBA', 14),
('FERRAZ DE VASCONCELOS', 14),
('FRANCISCO MORATO', 14),
('ITAPECERICA DA SERRA', 14),
('ITU', 14),
('BRAGANÇA PAULISTA', 14),
('PINDAMONHANGABA', 14),
('ITAPETININGA', 14),
('SÃO CAETANO DO SUL', 14),
('FRANCO DA ROCHA', 14),
('MOGI GUAÇU', 14),
('JAÚ', 14),
('ATIBAIA', 14),
('SANTANA DE PARNAÍBA', 14),
('ARARAS', 14),
('CUBATÃO', 14),
('VALINHOS', 14),
('OURINHOS', 14),
('UBATUBA', 14)

UPDATE CIDADE SET NOME = 'CIDADE CANÇÃO' where id = 5
select * from cidade


SELECT CIDADE.NOME, UF.NOME FROM CIDADE 
INNER JOIN UF ON UF.ID = CIDADE.UF_ID
ORDER BY UF.NOME

