-- 11. The titles of the movies in the "Star Wars Collection" ordered by release date, most recent first. 
-- (9 rows)
select title
from movie m
join collection c on m.collection_id = c.collection_id
where collection_name like 'Star Wars%'
order by m.release_date desc

