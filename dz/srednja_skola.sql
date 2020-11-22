# 13. Srednja skola
# Jedna srednja škola ima više razreda.
# Jedan razred pohađa više učenika.
# U jednom razredu predaje više profesora.
# Jedan profesor može predavati u više razreda.

# win+r, upisi cmd te zalijepi sljedecu liniju (prilagoditi putanje - diskove)
# c:\xampp\mysql\bin\mysql -uedunova -pedunova < e:\srednja_skola.sql
drop database if exists  srednja_skola;
create database srednja_skola;

use srednja_skola;

create table razred(
    sifra int not null primary key auto_increment,
    naziv varchar(20) not null,
    brojucenika char(10)
);

create table ucenik (
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    razred int not null
);

create table profesor(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table predavanje(
    naziv varchar(50) not null,
    datum_pocetka datetime,
    profesor int not null,
    razred int not null
);

alter table ucenik add foreign key (razred) references razred(sifra);

alter table predavanje add foreign key (profesor) references profesor(sifra);
alter table predavanje add foreign key (razred) references razred(sifra);