create database OURSYSTEM;
use OURSYSTEM;
-- ######################### SCHEMA #########################
create table owner
(
    id              bigint          not null  primary key,
    name            varchar(255)    not null,
    encrypted_sk    varchar(255)    not null,
    constraint unique_name unique (name)
);

create table role
(
    id          bigint          not null primary key,
    owner_id    bigint          not null,
    name        varchar(255)    not null,
    constraint foreign_key_owner_role foreign key (owner_id) references owner (id)
);

create table user
(
    id        bigint       not null primary key,
    full_name varchar(255) null,
    owner_id  bigint       not null,
    email     varchar(255) null,
    constraint foreign_key_owner_user foreign key (owner_id) references owner (id)
);
-- ######################### SAMPLE DATA #########################
INSERT INTO `owner` (`id`, `name`, `encrypted_sk`) VALUES
(1, 'MOMORA',   'MIIC2TBTBgkqhkiG9w0BBQ0wRjAlBgkqhkiG9w0BB'),
(2, 'SDAIA' ,   'yTV2fMVVAgIUczAdBglghkgBZQMEASoEEGRetyFtH'),
(3, 'STC'   ,   'GERtM1loEd+u8VAtLwTzBiXE5pmRpp/hX/1HrbBnz');
COMMIT;

INSERT INTO `role` (`id`, `owner_id`, `name`) VALUES
(1, 1 ,'MANAGER'),
(2, 1 ,'VP'),
(3, 1 ,'EMPLOYEE'),
(4, 2 ,'SECTION_MANAGER'),
(5, 2 ,'DEPARTMENT_MANAGER'),
(6, 2 ,'DEVELOPER'),
(7, 2 ,'DATA_SCIENTIST'),
(8, 3 ,'CONTRACTOR'),
(9, 3 ,'INTERN'),
(10, 3 ,'EMPLOYEE');
COMMIT;
