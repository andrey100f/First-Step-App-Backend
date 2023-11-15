create database FirstStepApp
use FirstStepApp

create table Universities(
	universityId int identity primary key,
	name varchar(150) not null,
	details varchar(max),
	img nvarchar(max)
)

create table Faculties(
	facultyId int identity primary key,
	name varchar(150) not null,
	university int not null foreign key references Universities(universityId),
	img nvarchar(max)
)

create table Users(
	userId uniqueidentifier primary key default NEWID(),
	name varchar(100) not null,
	sex varchar(1),
	birthDate date,
	email varchar(100) not null,
	password varchar(150) not null,
	phoneNumber varchar(20),
	university int not null foreign key references Universities(universityId),
	faculty int foreign key references Faculties(facultyId),
	img nvarchar(max)

)

create table Locations(
	locationId int identity primary key,
	name varchar(200) not null,
	city varchar(100) not null,
	street varchar(100),
	number varchar(20),
	type varchar(100),
	latitude decimal(8,6),
	longitude decimal(9,6),
	img nvarchar(max)

)

create table Messages(
	messageId int identity primary key,
	text varchar(max),
	posterId uniqueidentifier foreign key references Users(userId),
	messageDate datetime

)

create table Announcements(
	announcementId int identity primary key,
	title varchar(100) not null,
	text varchar(max) not null,
	category varchar(100),
	university int foreign key references Universities(universityId),
	img nvarchar(max)
)


insert into Universities values 
('Universitatea Babes Bolyai', null, null),
('Universitatea Tehnica Cluj-Napoca', 'detaliu', null),
('Universitatea de Medicina si Farmacie', null, null)

insert into Faculties values
('Facultatea de Matematica si Informatica', 1, null),
('Facultatea de Automatica si Calculatoare', 2, null),
('Facultatea de Medicina ', 3, null),
('Facultatea de Drept', 1, null),
('Facultatea de Constructii', 2, null),
('Facultatea de Medicina Dentara', 3, null)

insert into Users values
('CE398155-9BE8-442C-891D-718A9E21AF73', 'Ioan Popescu', 'M', '1990-05-15', 'ioan.popescu@email.com', 'parola123', '0740111222', 1, 1, null),
('FF2876FF-173C-44F7-8AAF-7DE74CC6C00C', 'Ana Ionescu', 'F', '1985-08-20', 'ana.ionescu@email.com', 'secret789', '0740111333', 2, null, null),
('C6649B5B-C00D-4BF5-9DF1-F53E2BFC1B1C', 'Mihai Vasile', 'M', '1995-02-10', 'mihai.vasile@email.com', 'parola456', null, 1, 4, null),
(NEWID(), 'Alice Marinescu', 'F', '2000-11-30', 'alice.marinescu@email.com', 'parolaSecure', null, 3, 3, null),
(NEWID(), 'Catalin Sarbu', 'M', '1988-07-05', 'catalin.sirbu@email.com', 'parola777', '555-234-5678', 2, 5, null)

insert into Locations values
('La Tevi', 'Cluj-Napoca','Potaissa', '13', 'Bar', 45.1111,23.123123, null),
('Samsara', 'Cluj-Napoca','Emil Racovita', '24', 'Teahouse', 45.1122,23.1231444, null),
('Biblioteca "Lucian Blaga"', 'Cluj-Napoca','Clinicilor', '2', 'Library', 45.12222,23.14658, null)

insert into Messages values
('Cine se trezeste de dimineata, cade in ea', 'CE398155-9BE8-442C-891D-718A9E21AF73', getdate()),
('Copiii din orfelinate dau cele mai bune party-uri pe La Familia', 'FF2876FF-173C-44F7-8AAF-7DE74CC6C00C', getdate()),
('Viata e ca o cutie de ciocolata, pentru grasi se termina repede', 'C6649B5B-C00D-4BF5-9DF1-F53E2BFC1B1C', getdate())

insert into Announcements values
('IMPORTANT!', 'Teapa, nu ii nimic important', 'Anunt', 1, null),
('Nu mai beti animalelor', 'Consumul de alcool pana la varsta de 18 ani dauneaza grav sanatatii creierului', 'Beutori', null, null)

select * from users
select * from Locations
select * from announcements
select * from messages
select * from Universities
select * from Faculties