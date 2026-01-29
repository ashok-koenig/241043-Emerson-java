SELECT emp_name,dept_name 
				FROM employees e 
				INNER JOIN departments d
				ON e.dept_id = d.dept_id;