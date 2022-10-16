-- 12. Create a "Bill Murray Collection" in the collection table. For the movies that have Bill Murray in them, set their collection ID to the "Bill Murray Collection". (1 row, 6 rows)
insert into collection (collection_id, collection_name)
values (1, 'Bill Murray Collection');
update movie
set collection_id = 1
where movie_id in (select ma.movie_id from person p, movie_actor ma where p.person_id = ma.actor_id
and person_name = 'Bill Murray');
