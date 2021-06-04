insert into users(user_id, create_date, introduce, admin_flag, password, user_rank) values('testid', current_timestamp(), 'hi hello', 0,'testpw', 5);
insert into users(user_id, create_date, introduce, admin_flag, password, user_rank) values('slygun', current_timestamp(), 'dk', 0, '1', 	105550);
insert into users(user_id, create_date, introduce, admin_flag, password, user_rank) values('omh9876',current_timestamp(), '오민혁2020114618', 0, '2', 6392);
insert into users(user_id, create_date, introduce, admin_flag, password, user_rank) values('fantasy7772',current_timestamp(), '김진욱', 0, '3', 11780);
insert into users(user_id, create_date, introduce, admin_flag, password, user_rank) values('nickse461',current_timestamp(), '안녕하세요', 0, '4', 56715);
insert into users(user_id, create_date, introduce, admin_flag, password, user_rank) values('pppp1923',current_timestamp(), '123456', 0, '5', 2621);

insert into problems(problem_id, problem_title, problem_content, input_condition, output_condition) values (21920, '서로소 평균', '효성이는 길이가 N인 수열 A에서 X와 서로소인 수들을 골라 평균을 구해보려고 한다.

효성이를 도와 이를 계산해주자.', '첫 번째 줄에 입력될 수들의 개수 N이 주어진다(N은 2이상 500,000이하). ' ||
                    '두번째 줄에는 수열 A를 이루는 자연수 Ai가 공백과 함께 주어진다(Ai는 2이상 1,000,000이하).' ||
                    '수열 A에 X와 서로소인 수가 최소 1개 이상 존재한다.' ||
                    '마지막 줄에는 X가 주어진다(X는 2이상 1,000,000이하).' , '첫째 줄에 수열 A에서 X와 서로소인 수들의 평균을 출력한다.' ||
                                                             '절대/상대 오차는 1/1,000,000까지 허용한다.');

insert into status(user_id, problem_id, solved) values ('testid', 21920, 'solved');

insert into board(board_id, board_title, problem_id, category, writer, board_content) values (69305, 'C언어 런타임에러 load of null 질문', 8958, '질문', 'kimtawann', '이 코드에서 5번째 줄을 char arr[80];으로 바꾸기만 하면 정답이 되던데 이 코드는 왜 안되는 걸까요?');