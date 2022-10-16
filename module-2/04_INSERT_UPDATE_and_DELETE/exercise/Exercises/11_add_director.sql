-- 11. Hollywood is remaking the classic movie "The Blob" and doesn't have a director yet. Add yourself to the person table, and assign yourself as the director of "The Blob" (the movie is already in the movie table). (1 record each)
insert into person (person_id,person_name)
values(100, 'Sriram Raju');
update movie
set director_id = 100
where title = 'The Blob';
