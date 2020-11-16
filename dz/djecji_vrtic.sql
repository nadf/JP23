# 4. Dijecji Vrtic
# win+r, upisi cmd te zalijepi sljedecu liniju (prilagoditi putanje - diskove)
# c:\xampp\mysql\bin\mysql -uedunova -pedunova < e:\djecji_vrtic.sql
drop database if exists djecji_vrtic;
create database djecji_vrtic;

use djecji_vrtic;

create table skupina(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    broj_djece int,
    odgajateljica int not null
);

create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    skupina int not null
);

create table odgajateljica(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    iban varchar(50),
    strucna_sprema int not null
);

create table strucna_sprema(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null
);

alter table skupina add foreign key (odgajateljica) references odgajateljica(sifra);

alter table dijete add foreign key (skupina) references skupina(sifra);

alter table odgajateljica add foreign key (strucna_sprema) references strucna_sprema(sifra);