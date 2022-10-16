-- 9. Remove "Memento" from the movie table
-- You'll have to remove data from two other tables before you can remove it (13 rows, 2 rows, 1 row)
delete from movie_genre mg
where mg.movie_id in (select movie_id from movie where title = 'Memento');
delete from movie_actor ma
where ma.movie_id in (select movie_id from movie where title = 'Memento');
delete from movie m
where m.title = 'Memento';


