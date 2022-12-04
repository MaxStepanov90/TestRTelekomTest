--liquibase formatted sql

--changeset stepanov:20221204-1-createChartTranscript splitStatements:;

--create table
create table CHARTTRANSCRIPT
(
ID varchar(50) primary key,
MEDIATYPE varchar(50) not null,
STRUCTUREDTEXT text
);

--commment on column
comment on column CHARTTRANSCRIPT.MEDIATYPE is 'тип';
comment on column CHARTTRANSCRIPT.STRUCTUREDTEXT is 'содержимое из файла';