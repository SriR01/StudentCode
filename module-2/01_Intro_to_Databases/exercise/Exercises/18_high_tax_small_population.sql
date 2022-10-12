-- 18. The name, population, and sales tax of all records in the state table with a sales tax of at least 7% or have a population of less than 1,000,000 (17 rows)
Select state_name, population, sales_tax
from state
where (sales_tax >= 7) OR (population < 1000000)