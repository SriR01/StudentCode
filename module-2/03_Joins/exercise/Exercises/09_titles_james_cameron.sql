-- 9. The titles of movies directed by James Cameron, sorted alphabetically.
-- (6 rows)
select title
from movie m
join person p on m.director_id = p.person_id
where person_name = 'James Cameron'
order by title asc
