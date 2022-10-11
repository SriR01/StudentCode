-- 11. The name, state, and population of all cities in Colorado (CO) or Arizona (AZ) (22 rows)

--select c.city_name, s.state_abbreviation ,c.population
--from public.city c, public.state s
--where c.state_abbreviation = s.state_abbreviation
--and (s.state_abbreviation = 'AZ' OR s.state_abbreviation ='CO');

SELECT city_name, state_abbreviation, population
from city
where (state_abbreviation = 'AZ' OR state_abbreviation ='CO')
