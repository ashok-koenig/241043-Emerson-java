SELECT department, 
		COUNT(*) AS total_employees,
		SUM(salary) AS total_salary,
		AVG(salary) AS average_salary,
		MIN(salary) AS min_salary,
		MAX(salary) AS max_salary
		FROM employees 
		group by department;