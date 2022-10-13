-- 2. The names and birthdays of actors in "The Fifth Element"
-- Order the results alphabetically (A-Z) by name.
-- (15 rows)
Select person_name, birthday
from person p
join movie_actor ma on p.person_id = ma.actor_id
join movie m on ma.movie_id = m.movie_id
Where m.title = 'The Fifth Element'
Order by person_name asc
