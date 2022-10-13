-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985.
-- Order the results by actor from oldest to youngest.
-- (20 rows)
select distinct(person_name), p.birthday
from person p
join movie_actor ma on ma.actor_id = p.person_id
join movie m on m.movie_id = ma.movie_id
where p.birthday between ('1950-01-01') and ('1959-12-31')
and m.release_date between ('1985-01-01') and ('1985-12-31')
order by p.birthday asc

