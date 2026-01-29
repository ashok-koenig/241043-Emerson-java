SELECT e.emp_name AS employee, m.emp_name AS manager
		FROM employees e
		JOIN employees m
		ON e.manager_id = m.id;