-- 코드를 입력하세요
SELECT  f.flavor as flavor
FROM first_half as f
JOIN
    (SELECT  flavor , sum(total_order) as total_order
    FROM july 
    GROUP BY flavor ) as j
ON f.flavor = j.flavor
ORDER BY f.total_order+j.total_order desc
limit 3; 
