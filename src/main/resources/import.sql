insert into FELHASZNALO (FELHASZNALONEV, JELSZO, ATNEMVETTCSOMAGOK, SZEREPKOR) values ('TestUser1', 'TestPW1', 0, 'VENDEG');
insert into FELHASZNALO (FELHASZNALONEV, JELSZO, ATNEMVETTCSOMAGOK, SZEREPKOR) values ('TestUser2', 'TestPW2', 1, 'ADMIN');
insert into FELHASZNALO (FELHASZNALONEV, JELSZO, ATNEMVETTCSOMAGOK, SZEREPKOR) values ('TestUser3', 'TestPW3', 2, 'FELHASZNALO');
insert into FELHASZNALO (FELHASZNALONEV, JELSZO, ATNEMVETTCSOMAGOK, SZEREPKOR) values ('TestUser4', 'TestPW4', 10, 'TILTOTT');

insert into ARU (NEV, AR) values ('alma', 500);
insert into ARU (NEV, AR) values ('banan', 742);
insert into ARU (NEV, AR) values ('kolbasz', 321);
insert into ARU (NEV, AR) values ('sajt', 400);
insert into ARU (NEV, AR) values ('ecet', 999);
insert into ARU (NEV, AR) values ('cukor', 20999);
insert into ARU (NEV, AR) values ('liszt', 333);
insert into ARU (NEV, AR) values ('kenyer', 670);
insert into ARU (NEV, AR) values ('tej', 888);
insert into ARU (NEV, AR) values ('mososzer', 100500);

insert into FUTARSZOLGALAT (NEV, KISZALLITASIDO) values ('GLS', 1)
insert into FUTARSZOLGALAT (NEV, KISZALLITASIDO) values ('UPS', 2)

insert into BEVASARLOLISTA (FELHASZNALO_Id) values (2);
insert into BEVASARLOLISTA (FELHASZNALO_Id) values (2);
insert into BEVASARLOLISTA (FELHASZNALO_Id) values (3);
insert into BEVASARLOLISTA (FELHASZNALO_Id) values (3);
insert into BEVASARLOLISTA (FELHASZNALO_Id) values (3);


insert into BOLT (NEV, CIM, HONLAP) values ('COOP', 'COOP u. 12', 'www.coop.hu')
insert into BOLT (NEV, CIM, HONLAP) values ('CBA', 'CBA u. 48', 'www.cba.hu')
insert into BOLT (NEV, CIM, HONLAP) values ('Real', 'Real u. 123', 'www.real.hu')

insert into ARU_BOLTOK (ARUK_CIKKSZAM, BOLTOK_SORSZAM) values (1, 1)
insert into ARU_BOLTOK (ARUK_CIKKSZAM, BOLTOK_SORSZAM) values (1, 2)
insert into ARU_BOLTOK (ARUK_CIKKSZAM, BOLTOK_SORSZAM) values (10, 3)
insert into ARU_BOLTOK (ARUK_CIKKSZAM, BOLTOK_SORSZAM) values (10, 2)
insert into ARU_BOLTOK (ARUK_CIKKSZAM, BOLTOK_SORSZAM) values (10, 1)



