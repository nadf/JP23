# 2. Salon za uljepšavanje
# U salonu za uljepšavanje radi više djelatnica. 
# Jedna djelatnica na dan radi s više korisnika. 
# Korisnik tijekom jednog posjeta koristi jednu uslugu.

# win+r, upisi cmd te zalijepi sljedecu liniju (prilagoditi putanje - diskove)
# c:\xampp\mysql\bin\mysql -uedunova -pedunova < e:\salon_za_uljepsavanje.sql
drop database if exists salon_za_uljepsavanje;
create database salon_za_uljepsavanje;

use salon_za_uljepsavanje;

create table djelatnica(
    sifra int not null primary key auto_increment,
    osoba int not null,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    iban varchar(50)
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11)
);

create table usluga(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    cijena decimal(18,2)
);

create table posjeta(
    sifra int not null primary key auto_increment,
    korisnik int not null,
    djelatnica int not null,
    usluga int not null
);


alter table djelatnica add foreign key (osoba) references osoba(sifra);

alter table posjeta add foreign key (korisnik) references osoba(sifra);
alter table posjeta add foreign key (djelatnica) references djelatnica(sifra);
alter table posjeta add foreign key (usluga) references usluga(sifra);
