# 9. Urar Silvija
# Urar popravlja satove. 
# Jedan korisnik može uraru donijeti više satova na popravak dok jedan sat može biti više puta na popravku.
# Urar ima šegrta koji sudjeluje u određenim popravcima satova.
# win+r, upisi cmd te zalijepi sljedecu liniju (prilagoditi putanje - diskove)
# c:\xampp\mysql\bin\mysql -uedunova -pedunova < e:\urar_silvija.sql

drop database if exists urar_silvija;
create database urar_silvija;

use urar_silvija;

create table korisnik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    broj_mobitela int    
);
create table urar(
    sifra int not null primary key auto_increment,
    korisnik int not null,
    segrt int not null,
    iban varchar(50)
);

create table segrt(
    sifra int not null primary key auto_increment,
    korisnik int not null,
    iban varchar(50)
);

create table sat(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    vrsta varchar(50) not null,
    vlasnik int not null
);

create table popravak(
    sifra int not null primary key auto_increment,
    urar int not null,
    segrt int,
    trajanje varchar(50) not null, 
    cijena decimal(18,2)
);

create table popravak_sat(
    sifra int not null primary key auto_increment,
    popravak int not null,
    sat int not null
);


alter table urar add foreign key (korisnik) references korisnik(sifra);
alter table urar add foreign key (segrt) references segrt(sifra);

alter table segrt add foreign key (korisnik) references korisnik(sifra);

alter table sat add foreign key (vlasnik) references korisnik(sifra);

alter table popravak add foreign key (urar) references urar(sifra);
alter table popravak add foreign key (segrt) references segrt(sifra);

alter table popravak_sat add foreign key (popravak) references popravak(sifra);
alter table popravak_sat add foreign key (sat) references sat(sifra);