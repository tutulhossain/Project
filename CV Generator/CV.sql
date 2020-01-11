create table login(
username varchar(50) not null primary key
,password varchar(50) not null
);


create table frame1(
username varchar(50) not null primary key foreign key references login(username)
,firstname	varchar(50) not null
,surname	varchar(50) not null
,permanantaddress varchar(max) not null	
,presentaddress	varchar(max) not null
,postcode varchar(50) not null
,nationality varchar(50) not null default 'Bangladesh'
,dateofbirth varchar(50) not null	
,contact varchar(50) not null		
,email varchar(max) 
,university	varchar(max)
,college varchar(max)not null	
,school	varchar(max) not null
,skills	varchar(max) not null
,skills1	varchar(max) not null
,skills2	varchar(max) not null
,skills3	varchar(max) not null
,skills4	varchar(max) not null
,skills5	varchar(max) not null
,language varchar(max) not null
,language1 varchar(max) not null	
,language2 varchar(max) not null	
,language3 varchar(max) not null		
,companyname varchar(max) 	
,address varchar(max)	
,country varchar(50) default 'Bangladesh'
,title	varchar(50)
,role varchar(50)
,objective varchar(max) not null
,name1	varchar(50)
,title1	varchar(50)
,company1	varchar(50)
,cellno1 varchar(50) 
,name2	varchar(50)
,title2	varchar(50)
,company2	varchar(50)
,cellno2	varchar(50)
,sname	varchar(max) not null
,sdate varchar(50) not null
,imgage image not null
);