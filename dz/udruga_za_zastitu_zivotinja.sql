# 3. Udruga za zastitu zivotinja
# win+r, upisi cmd te zalijepi sljedecu liniju (prilagoditi putanje - diskove)
# c:\xampp\mysql\bin\mysql -uedunova -pedunova < e:\udruga_za_zastitu_zivotinja.sql
drop database if exists udruga_za_zastitu_zivotinja;
create database udruga_za_zastitu_zivotinja;

use udruga_za_zastitu_zivotinja;

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    iban varchar(50),
    oib char(11)
);

create table prostor(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null
);

create table zivotinja(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    vrsta varchar(50) not null,
    prostor int not null,
    osoba int not null
);

alter table zivotinja add foreign key (prostor) references prostor(sifra);
alter table zivotinja add foreign key (osoba) references osoba(sifra);