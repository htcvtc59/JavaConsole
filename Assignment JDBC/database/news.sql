CREATE DATABASE News
ON PRIMARY
(NAME='news',FILENAME='C:\Assignment\database\new_data.mdf',SIZE=4MB,MAXSIZE=4GB,FILEGROWTH=5MB),
FILEGROUP news_ndf
(NAME='news2',FILENAME='C:\Assignment\database\new_data2.ndf',SIZE=2MB,MAXSIZE=2GB,FILEGROWTH=5MB)
LOG ON
(NAME='news_log',FILENAME='C:\Assignment\database\new_data.ldf',SIZE=2MB,MAXSIZE=2GB,FILEGROWTH=5MB)
COLLATE SQL_Latin1_General_CP1_CI_AS
GO
use News
GO

create table New(
Id int not null,
Name nvarchar(100) not null,
Date date not null,
Title nvarchar(100) not null,
Description nvarchar(300) default null,
Details nvarchar(400) not null,
Category nvarchar(100) not null,
Image nvarchar(200) not null,
primary key(Id)
)
GO


