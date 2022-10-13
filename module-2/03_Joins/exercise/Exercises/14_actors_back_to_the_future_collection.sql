-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection", sorted alphabetically.
-- (28 rows)
Select distinct(person_name)
from person p
join movie_actor ma on ma.actor_id = p.person_id
join movie m on m.movie_id = ma.movie_id
join collection c on c.collection_id = m.collection_id
where c.collection_name like 'Back to the Future%'
order by person_name asc

