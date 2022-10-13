-- 10. The names of directors who have directed a movie over 3 hours [180 minutes], sorted alphabetically.
-- (15 rows)
select distinct(person_name)
from person p
join movie m on p.person_id = m.director_id
where m.length_minutes > 180
order by person_name asc


