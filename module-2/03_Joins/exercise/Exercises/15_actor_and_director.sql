-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie.
-- Order the results by movie title (A-Z)
-- (73 rows)

select m.title, director.person_name as person_name
from movie m, person director, movie_actor ma, person actor
where m.movie_id = ma.movie_id
and director.person_id = m.director_id
and m.director_id = ma.actor_id
and actor.person_id = ma.actor_id
order by title asc


