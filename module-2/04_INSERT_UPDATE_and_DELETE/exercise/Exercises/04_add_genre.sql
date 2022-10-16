-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)
insert into genre (genre_name,genre_id)
values ('Sports',13);

insert into movie_genre (movie_id,genre_id)
select movie_id,13
from movie m
where m.title = 'Coach Carter';

