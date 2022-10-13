-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in. 
-- Order the results by the actor names (A-Z) and then by movie title (A-Z). 
-- (48 rows)
select person_name,title
from person p
join movie_actor ma on p.person_id = ma.actor_id
join movie m on ma.movie_id = m.movie_id
where p.person_name like '% Jones'
order by p.person_name,m.title asc




