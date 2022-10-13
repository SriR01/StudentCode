-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas, sorted alphabetically.
-- (5 rows)
select title
from movie m
join collection c on c.collection_id = m.collection_id
join person p on p.person_id = m.director_id
where (collection_name like 'Star Wars%') and (p.person_name != 'George Lucas')
order by title asc

