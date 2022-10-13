-- 6. The genres of "The Wizard of Oz" sorted in alphabetical order (A-Z).
-- (3 rows)
Select genre_name
from genre g
join movie_genre mg on g.genre_id = mg.genre_id
join movie m on mg.movie_id = m.movie_id
where m.title = 'The Wizard of Oz'
order by g.genre_name asc

