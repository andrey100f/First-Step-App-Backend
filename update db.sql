alter table Locations
add description varchar(max)

alter table Announcements
add url varchar(200)

alter table Users
drop column sex, birthDate, phoneNumber, img

alter table Messages
add category varchar(200)

create table Events(
	eventId int identity primary key,
	name varchar(200) not null,
	description varchar(max),
	participants int default 0,
	location int foreign key references Locations(locationId)
)

create table Participants(
	participationId int identity primary key,
	userId uniqueidentifier not null,
	eventId int not null
)