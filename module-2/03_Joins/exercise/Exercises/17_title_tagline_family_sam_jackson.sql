-- 17. The titles and taglines of movies that are in the "Family" genre that Samuel L. Jackson has acted in.
-- Order the results alphabetically by movie title.
-- (4 rows)
select title, tagline
from movie m
join movie_actor ma on m.movie_id = ma.movie_id
join person p on p.person_id = ma.actor_id
join movie_genre mg on mg.movie_id = m.movie_id
join genre g on g.genre_id = mg.genre_id
where genre_name = 'Family' and p.person_name = 'Samuel L. Jackson'
order by title asc

