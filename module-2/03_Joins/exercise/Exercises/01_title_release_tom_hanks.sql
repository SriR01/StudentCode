-- 1. The titles and release dates of movies that Tom Hanks has appeared in. 
-- Order the results by release date, newest to oldest.
-- (47 rows)
select title, release_date
from movie m
join movie_actor ma on m.movie_id = ma.movie_id
join person p on p.person_id = ma.actor_id
Where person_name = 'Tom Hanks'
Order by release_date desc


