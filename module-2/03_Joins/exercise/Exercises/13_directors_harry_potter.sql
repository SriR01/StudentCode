-- 13. The directors of the movies in the "Harry Potter Collection", sorted alphabetically.
-- (4 rows)
select distinct(person_name)
from person p
join movie m on m.director_id = p.person_id
where m.title like 'Harry Potter%'
order by person_name asc

