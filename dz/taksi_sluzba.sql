# 7. Taksi Sluzba
# Taksi tvrtka ima više vozila. 
# Jedno vozilo vozi jedan vozač. 
# U jednoj vožnji vozač može prevesti više putnika. 
# Jedan putnik se naravno može tijekom vremena imati više vožnji.

# win+r, upisi cmd te zalijepi sljedecu liniju (prilagoditi putanje - diskove)
# c:\xampp\mysql\bin\mysql -uedunova -pedunova < e:\taksi_sluzba.sql
drop database if exists taksi_sluzba;
create database taksi_sluzba;

use taksi_sluzba;

create table vozilo(
    broj_vozila int primary key not null,
	reg_tablica int not null,
    vrsta varchar(50) not null, 
	vozac int
);

create table vozac(
	sifra int primary key not null auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
    iban varchar(50), 
	vozacka char(8) not null
);

create table voznja(
	sifra int primary key not null auto_increment,
    trajanje varchar(50),
    cijena decimal(18,2),
	vozilo int not null
);

create table putnik(
	sifra int primary key not null auto_increment,
	ime varchar(50) not null,
	broj_telefona int not null
);

create table voznja_putnik(
	sifra int primary key not null auto_increment,
	putnik int not null,
	voznja int not null
);

alter table vozilo add foreign key (vozac) references vozac(sifra);

alter table voznja add foreign key (vozilo) references vozilo(broj_vozila);

alter table voznja_putnik add foreign key (putnik) references putnik(sifra);
alter table voznja_putnik add foreign key (voznja) references voznja(sifra);

