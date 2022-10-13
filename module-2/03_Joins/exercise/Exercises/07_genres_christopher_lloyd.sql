-- 7. The genres of movies that Christopher Lloyd has appeared in, sorted alphabetically.
-- (8 rows) Hint: DISTINCT will prevent duplicate values in your query results.
select distinct(genre_name)
from genre g
join movie_genre mg on g.genre_id = mg.genre_id
join movie_actor ma on mg.movie_id = ma.movie_id
join person p on ma.actor_id = p.person_id
where person_name = 'Christopher Lloyd'
order by genre_name asc

