SELECT e.emp_name, d.dept_name
		FROM employees e
		CROSS JOIN departments d;