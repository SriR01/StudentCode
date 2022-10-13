-- 19. The genre name and the number of movies in each genre. Name the count column 'num_of_movies'.
-- Order the results from the highest movie count to the lowest.
-- (19 rows, the highest expected count is around 400).
select g.genre_name, count(m.movie_id) as num_of_movies
from genre g, movie m
join movie_genre mg on mg.movie_id = m.movie_id
where g.genre_id = mg.genre_id
group by g.genre_name
order by count(m.movie_id) desc


