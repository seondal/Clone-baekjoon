drop table if exists baekjoon.boards;
drop table if exists baekjoon.status;
drop table if exists baekjoon.problems;
drop table if exists baekjoon.users;

create table boards (
                        board_id bigint not null auto_increment,
                        create_date datetime(6),
                        category varchar(45) not null,
                        board_content TEXT not null,
                        board_title varchar(255) not null,
                        problem_id bigint,
                        writer varchar(20) not null,
                        primary key (board_id)
) engine=InnoDB;

create table problems (
                          problem_id bigint not null auto_increment,
                          create_date datetime(6),
                          problem_content TEXT not null,
                          input_condition TEXT not null,
                          multilingual_flag bit not null default false,
                          output_condition TEXT not null,
                          problem_rank bigint not null,
                          problem_title varchar(255) not null,
                          primary key (problem_id)
) engine=InnoDB;

create table status (
                        status_no bigint not null auto_increment,
                        solve_flag bit not null default false,
                        problem_id bigint,
                        user_id varchar(20),
                        primary key (status_no)
) engine=InnoDB;

create table users (
                       user_id varchar(20) not null,
                       create_date datetime(6),
                       introduce varchar(255),
                       admin_flag bit not null default false,
                       password varchar(20) not null,
                       user_rank bigint not null,
                       primary key (user_id)
) engine=InnoDB;

alter table boards
    add constraint FKamni7pxeonuh41c1u8meor4so
        foreign key (problem_id)
            references problems (problem_id);

alter table boards
    add constraint FK3faq5fnym59tvtcrmikt3mclc
        foreign key (writer)
            references users (user_id);

alter table status
    add constraint FKs4ex7d6benl8msdgw32np5617
        foreign key (problem_id)
            references problems (problem_id);

alter table status
    add constraint FK41pnbjmhlw8pvggq86inm7le
        foreign key (user_id)
            references users (user_id);