-- 20. The titles, lengths, and release dates of the 5 longest movies in the "Action" genre. 
-- Order the movies by length (highest first), then by release date (latest first).
-- (5 rows, expected lengths around 180 - 200)
select title, length_minutes, release_date
from movie m
join movie_genre mg on mg.movie_id = m.movie_id
join genre g on mg.genre_id = g.genre_id
where g.genre_name = 'Action'
order by length_minutes desc, release_date desc
limit 5

