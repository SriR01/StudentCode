-- 4. The titles and taglines of all the movies that are in the Fantasy genre. 
-- Order the results by title (A-Z).
-- (81 rows)
Select title, tagline
from movie m
join movie_genre mg on m.movie_id = mg.movie_id
join genre g on mg.genre_id = g.genre_id
where g.genre_name = 'Fantasy'
order by m.title asc
