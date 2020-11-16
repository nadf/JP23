# 6. Samostan
# U samostanu se nalaze svećenici. 
# Svaki svećenik je zadužen za više poslova. 
# Jedan posao u isto vrijeme može obavljati više svećenika. 
# Svaki svećenik ima samo jednog nadređenog svećenika.

# win+r, upisi cmd te zalijepi sljedecu liniju (prilagoditi putanje - diskove)
# c:\xampp\mysql\bin\mysql -uedunova -pedunova < e:\samostan.sql
drop database if exists samostan;
create database samostan;

use samostan;

create table svecenik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    nadredeni_svecenik int not null
);

create table posao(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    trajanje varchar(50)
);

create table svecenik_posao(
    svecenik int not null,
    posao int not null
);

alter table svecenik add foreign key (nadredeni_svecenik) references svecenik(sifra);

alter table svecenik_posao add foreign key (svecenik) references svecenik(sifra);
alter table svecenik_posao add foreign key (posao) references posao(sifra);