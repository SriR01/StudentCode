-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later, sorted alphabetically.
-- (6 rows)
select distinct(genre_name)
from genre g
join movie_genre mg on g.genre_id = mg.genre_id
join movie m on mg.movie_id = m.movie_id
join movie_actor ma on m.movie_id = ma.movie_id
join person p on ma.actor_id = p.person_id
where (p.person_name = 'Robert De Niro') and (m.release_date >= date('2010-01-01'))
order by genre_name asc
