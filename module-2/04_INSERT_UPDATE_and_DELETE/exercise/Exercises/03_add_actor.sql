-- 3. Did you know Eric Stoltz was originally cast as Marty McFly in "Back to the Future"? Add Eric Stoltz to the list of actors for "Back to the Future" (1 row)
insert into movie_actor (movie_id,actor_id)
select movie_id, person_id
from movie m, person p
where (p.person_name ='Eric Stoltz') and (m.title = 'Back to the Future')

