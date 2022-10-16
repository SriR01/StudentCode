-- 7. Remove the actor appearances in "Avengers: Infinity War" (14 rows)
-- Note: Don't remove the actors themeselves, just make it so it seems no one appeared in the movie.
delete from movie_actor ma
where ma.movie_id in (select movie_id from movie m where title = 'Avengers: Infinity War');
