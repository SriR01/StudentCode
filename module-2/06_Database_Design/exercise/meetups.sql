create table member (
member_id int not null,
group_id int not null,
last_name varchar not null,
first_name varchar not null,
email_address varchar not null,
phone_number varchar not null,
birth_date date not null,
email_reminder boolean not null
    -- constraint pk_member_id primary key (member_id)
    -- constraint fk_group_id foreign key (group_id)
);

alter table member
add constraint pk_member_id
primary key (member_id);


create table interest_group (
group_id int not null,
group_name varchar not null
    -- constraint pk_group_id primary key (group_id)
);
alter table interest_group
add constraint pk_group_id
primary key (group_id);


create table event (
event_id int not null,
group_id int not null,
event_name varchar not null,
description varchar not null,
start_date_time timestamp not null,
duration int not null
    -- constraint pk_event_id primary key (event_id)
    -- constraint fk_group_id foreign key (group_id)
);

alter table event
add constraint pk_event_id
primary key (event_id);


alter table member
add constraint fk_group_id_1
foreign key (group_id) references interest_group(group_id);

alter table event
add constraint fk_group_id_2
foreign key (group_id) references interest_group(group_id);


-- Populate the tables with data for at least four events, three groups, and eight members.

insert into interest_group (group_id,group_name)
values (1,'Java');

insert into interest_group (group_id,group_name)
values (2,'Python');

insert into interest_group (group_id,group_name)
values (3,'C++');

insert into member (member_id, group_id, last_name, first_name, email_address, phone_number, birth_date, email_reminder)
values (1,1,'Chan','Colton','coltonchan@gmail.com','518-878-8870','12/23/86',true);

insert into member (member_id, group_id, last_name, first_name, email_address, phone_number, birth_date, email_reminder)
values (2,2,'Lang','Ursula','ursulalang@gmail.com','916-641-3842','03/18/86',true);

insert into member (member_id, group_id, last_name, first_name, email_address, phone_number, birth_date, email_reminder)
values (3,3,'Moran','Dwayne','dwaynemoran@gmail.com','256-234-2456','06/24/99',false);

insert into member (member_id, group_id, last_name, first_name, email_address, phone_number, birth_date, email_reminder)
values (4,1,'Moody','Mitchel','mitchelmoody@gmail.com','876-345-3575','12/09/83',true);

insert into member (member_id, group_id, last_name, first_name, email_address, phone_number, birth_date, email_reminder)
values (5,2,'Patel','William','williampatel@gmail.com','264-357-2345','01/05/93',false);

insert into member (member_id, group_id, last_name, first_name, email_address, phone_number, birth_date, email_reminder)
values (6,3,'Garner','Jay','jaygarner@gmail.com','568-265-8463','12/09/98',false);

insert into member (member_id, group_id, last_name, first_name, email_address, phone_number, birth_date, email_reminder)
values (7,1,'Gilbert','Alejandra','alejandragilbert@gmail.com','256-258-2346','11/15/94',false);

insert into member (member_id, group_id, last_name, first_name, email_address, phone_number, birth_date, email_reminder)
values (8,2,'Robinson','Mattie','mattierobinson@gmail.com','357-272-2436','08/15/93',true);

insert into event (event_id, event_name, description,start_date_time, duration, group_id)
values (101, 'Java Event', 'Event ran by Java Group', '10-18-2022 10:00:00', 30, 1 );

insert into event (event_id, event_name, description, start_date_time, duration, group_id)
values (102, 'Python Event', 'Event ran by Python Group', '10-18-2022 12:00:00', 30, 2);

insert into event (event_id, event_name, description, start_date_time, duration, group_id)
values (103, 'C++ Event', 'Event ran by C++ Group', '10-18-2022 2:00:00', 30, 3);

insert into event (event_id, event_name, description, start_date_time, duration, group_id)
values (104, 'Programming Event', 'Programming event ran by Java Group', '10-18-2022 4:00:00',30,1);



