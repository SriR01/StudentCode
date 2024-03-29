-- 5. The titles and release dates of all the movies that are in the Comedy genre. 
-- Order the results by release date, earliest to latest. 
-- (220 rows)
select title, release_date
from movie m
join movie_genre mg on m.movie_id = mg.movie_id
join genre g on mg.genre_id = g.genre_id
where g.genre_name = 'Comedy'
order by m.release_date asc

