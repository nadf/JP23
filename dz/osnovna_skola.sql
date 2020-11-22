# 12. Osnovna skola
# U osnovnoj školi postoje dječje radionice.
# Na jednoj radionici sudjeluje više djece.
# Jedno dijete može sudjelovati na više radionica. 
# Radionicu vodi jedna učiteljica.

# win+r, upisi cmd te zalijepi sljedecu liniju (prilagoditi putanje - diskove)
# c:\xampp\mysql\bin\mysql -uedunova -pedunova < e:\osnovna_skola.sql
drop database if exists  osnovna_skola;
create database osnovna_skola;

use osnovna_skola;

create table radionica(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    uciteljica int not null
);

create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table uciteljica(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table dijete_radionica(
    dijete int not null,
    radionica int not null
);

alter table radionica add foreign key (uciteljica) references uciteljica(sifra);

alter table dijete_radionica add foreign key (dijete) references dijete(sifra);
alter table dijete_radionica add foreign key (radionica) references radionica(sifra);
