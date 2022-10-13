-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in. Name the count column 'num_of_movies'.
-- Include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. 
-- (59 rows)
Select person_name,count(movie_id) as num_of_movies
from person p, movie m
join movie_actor ma on ma.actor_id = p.person_id
where m.movie_id = ma.movie_id
and person_name like ('George%')
and m.release_date is null

